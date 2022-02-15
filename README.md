# Usage-of-Design-Patterns-and-Principles
This folder is an example of refactoring code via design principles and patterns. 

The OriginalArmourBuild jave file is intended to be used in an Action RPG. The players will kill enemies and enemies have a chance of dropping loot.In this example, enemies will only drop armour.

**Instructions on Refactoring**

As the OriginalArmourBuild jave file stands it is functional but will not be maintainable as the project becomes larger.
Additional changes that may appear are:
- new modifications (Strength, Intellegence, and Dexterity), but many more could potentially be added
- new sorts of armour (shields, amulets, belts)
- new rarities (mythic, legendary)
- as well as possibly controlling the way armour is generated, such as a boss should drop higher quality armour than a normal enemy drop

The getDescription() method should still function for any variable of type Armour found potentially elsewhere in the application.


My refactored code is in the ArmourBuild folder.

**The Patterns Used:**

Factory Pattern - This pattern was used for creating objects without having to specify the exact class of the object. For example the ArmourFactory will drop armour from a normal enemy or boss.

Decorator Pattern - This pattern was used to add behaviour for the armour type dropped by an enemy without affecting the behaviour of other objects. For example, a boss drop will drop an Epic or Rare armour along with its ArmourType. Every armour will have the added behaviour of the ArmourType and a rarity type (Uncommon, Rare, etc).

**Some of the Principles Used:**

Open-Closed Principle: This principle was used throughout the code to ensure reusability and most importantly for this questions scenario when additional rarities and attributes come forth, we are able to extend from a class rather than have to constantly modify it. For example, the ArmourDecorator will be able to easily add new behaviour to armour in terms of multiple rarities like Mythical or Unique. We would simply extend the mythical class from the decorator class and add its new behaviour to the armour.

Dependency-Inversion Principle (depends on abstractions, not on concretions): This principle was used to ensure concrete classes were dependent on abstract/interface classes, especially for our scenario to use this principle to help with not needing to specify the exact class of the object. For example, for the AttributeFactory our enemy classes are able to obtain a select number of attributes without specifically calling onto each attribute subclass (dexterity, strength, etc).

Interface Segregation Principle (user should not need to implement an interface that it does not use or depend on methods it does not use): This principle was used to ensure there are no unnecessary methods or interfaces used to extract the description of the armour. 

**UML Diagram of Refactored Code**

![image](https://user-images.githubusercontent.com/89663127/154098238-5b83dbb5-6828-417e-9794-616f5ca69c31.png)

