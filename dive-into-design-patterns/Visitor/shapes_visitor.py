from abc import ABCMeta, abstractmethod

class Visitor(metaclass=ABCMeta):
  @abstractmethod
  def visitDot(self, dot):
    pass

  @abstractmethod
  def visitCircle(self, circle):
    pass

class XMLExportVisitor(Visitor):
  def visitDot(self, dot):
    print("<dot>\n \t<x>{}</x>\n \t<y>{}</y>\n</dot>".format(dot.x, dot.y))

  def visitCircle(self, circle):
    print("<circle>\n \t<xc>{}</xc>\n \t<yc>{}</yc>\n \t<radius>{}</radius>\n </circle>".format(circle.xc, circle.yc, circle.radius))

class Shape(metaclass=ABCMeta):
  @abstractmethod
  def accept(self, visitor):
    pass

  @abstractmethod
  def draw(self):
    pass

  @abstractmethod
  def move(self, x, y):
    pass

class Dot(Shape):
  def __init__(self, x, y):
    self.x = x
    self.y = y

  def accept(self, visitor):
    visitor.visitDot(self)

  def draw(self):
    print("x={} y={}".format(self.x, self.y))

  def move(self, x, y):
    self.x = x
    self.y = y

class Circle(Shape):
  def __init__(self, x, y, radius):
    self.xc = x
    self.yc = y
    self.radius = radius

  def accept(self, visitor):
    visitor.visitCircle(self)

  def draw(self):
    print("xc={}, yc={}, radius={}".format(self.xc, self.yc, self.radius))

  def move(self, x, y):
    self.xc = x
    self.yc = y

xmlExporter = XMLExportVisitor()
dot = Dot(1,2)
circle = Circle(0,2,4)

print("######### Draw outputs #########")
circle.draw()
dot.draw()

print("######### XML exporter outputs #########")
circle.accept(xmlExporter)
dot.accept(xmlExporter)
