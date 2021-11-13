from abc import ABCMeta, abstractmethod

class Component(ABCMeta):
  def __init__(self, dialog):
    self.dialog = dialog
  
  def click(self):
    self.dialog.notify(self, "click")

  def keypress(self):
    self.dialog.notify(self, "keypress")

class Button(Component):
  def __init__(self, dialog):
    super.__init__(dialog)

class TextBox(Component):
  def __init__(self, dialog):
    super.__init__(dialog)

class Checkbox(Component):
  def __init__(self, dialog):
    super.__init__(dialog)
  
  def check(self):
    self.dialog.notify(self, "check")

class Mediator(mataclass=ABCMeta):
  @abstractmethod
  def notify(self, sender, event):
    pass

# class AuthenticationDialog(Mediator):
#   def __init__(self, loginOrRegisterCheckBox, okBtn, cancelBtn):
#     self.loginOrRegisterCheckBox = loginOrRegisterCheckBox
#     self.okBtn, self.cancelBtn = okBtn, cancelBtn

#   def notify(self, sender, event):
#     if sender == self.loginOrRegisterCheckBox and event == "check":
#       print("Render Login Page")
#     else:
#       print("Render Register Page")

#     if sender == self.okBtn and event == "click":
#       if (loginOrRegisterCheckBox)

