from abc import ABCMeta, abstractmethod

class SocialNetwork(metaclass=ABCMeta):
  @abstractmethod
  def createFriendsIterator(self, profileId):
    pass

  @abstractmethod
  def createCoworkersIterator(self, profileId):
    pass

class Facebook(SocialNetwork):
  def __init__(self):
    self.friendsMap = {
      1: [2,3,4,5],
      2: [1,4],
      3: [1,5],
      4: [1,2],
      5: [1,3]
    }

    self.coworkersMap = {
      1: [3,5],
      2: [4],
      3: [1,5],
      4: [2],
      5: [1,3]
    }

    self.maps = {
      "friends": self.friendsMap,
      "coworkers": self.coworkersMap
    }
  
  def socialGraphRequest(self, profileId, type):
    return self.maps[type][profileId]
    
  def createFriendsIterator(self, profileId):
    return FacebookIterator(self, profileId, "friends")

  def createCoworkersIterator(self, profileId):
    return FacebookIterator(self, profileId, "coworkers")

class ProfileIterator(metaclass=ABCMeta):
  @abstractmethod
  def getNext(self):
    pass

  @abstractmethod
  def hasNext(self):
    pass

class FacebookIterator(ProfileIterator):
  def __init__(self, facebook, profileId, type):
    self.facebook = facebook
    self.profileId = profileId
    self.type = type
    self.currentPosition = 0
    self.cache = None

  def lazyInit(self):
    if not self.cache:
      self.cache = self.facebook.socialGraphRequest(self.profileId, self.type)

  def getNext(self):
    if self.hasNext():
      to_return = self.cache[self.currentPosition]
      self.currentPosition += 1
      return to_return
    else: 
      raise StopIteration

  def hasNext(self):
    self.lazyInit()
    return len(self.cache) > self.currentPosition

# Application
network = Facebook()
user = 1

friends_iterator = network.createFriendsIterator(user)
print("Friends of user " + str(user))
while friends_iterator.hasNext():
  print(friends_iterator.getNext())

coworkers_iterator = network.createCoworkersIterator(user)
print("Coworkers of user " + str(user))
while coworkers_iterator.hasNext():
  print(coworkers_iterator.getNext())
