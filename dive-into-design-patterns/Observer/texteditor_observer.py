from collections import defaultdict 
from abc import ABCMeta, abstractmethod
class EventManager:
  
  def __init__(self):
    self.listeners = defaultdict(set)
  
  def subscribe(self, eventType, listener):
    self.listeners[eventType].add(listener)
  
  def unsubscribe(self, eventType, listener):
    if listener in self.listeners[eventType]:
      self.listeners[eventType].remove(listener)
  
  def notify(self, eventType, data):
    for listener in self.listeners[eventType]:
      listener.update(data)

class EventListener(metaclass=ABCMeta):
  @abstractmethod
  def update(self, filename):
    pass