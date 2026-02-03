We are designing a program to manage musical instruments of a music group. 
In this group, there are three types of instruments:

    Wind Instruments
    String instruments
    Percussion instruments

All these instruments have two characteristics in common:

    Name
    Price

In addition, everyone can play, but they do it in different ways.

Create a Abstract class called Instrument, with:

        Two attributes: name and price
        An abstract method called play()

Create three subclasses that inherit from Instrument:

        WindInstrument
        StringInstrument
        PercussionInstrument

In each subclass, implement the method play() to display for console a specific message:

        "Està sonant un instrument de vent"for a WindInstrument
        "Està sonant un instrument de corda"for a StringInstrument
        "Està sonant un instrument de percussió"for a PercussionInstrument

Add a class Main with a method main() where:

        An object of each type of instrument is created
        Call the method play()of each to see the polymorphic behavior

---

The loading process of a class in Java occurs only once during the execution of the program.

It shows that this charge can be caused in two ways:

    When the first instance of the class is created.
    When accessing a static member of the class (such as a method or attribute static).

To check, add a static block into the class and watch when running.

In addition, research and document by yourself :

    What is an initialization block (without static)?
    When is it executed?
    What is the difference between this and a block static?




