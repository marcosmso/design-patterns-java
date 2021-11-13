class Editor:
  def __init__(self):
    self.text = ""

  def getText(self):
    return self.text

  def setText(self, text):
    self.text = text

  def addText(self, textInput):
    self.text += textInput

  def createSnapshot(self):
    return Snapshot(self, self.text)

class Snapshot():
  def __init__(self, editor, text): 
    self.editor = editor
    self.text = text

  def restore(self):
    self.editor.setText(self.text)

class Backup:
  def __init__(self):
    self.stack = []

  def makeBackup(self, editor):
    self.stack.append(editor.createSnapshot())

  def undo(self):
    if len(self.stack) > 0:
      backup = self.stack.pop()
      backup.restore()

backup = Backup()
editor = Editor()
editor.addText("Hello, ")
backup.makeBackup(editor)
editor.addText("World")

print(editor.getText())
backup.undo()
print(editor.getText())

