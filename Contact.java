package contact_book;


public class Contact 
{
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) 
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() { return name;}
    public String getPhone() { return phone;}
    public String getEmail() { return email;}

    @Override
    public String toString()
    {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}




//
//💡 Enhancement Ideas:
//- Save/load contacts to/from a JSON or CSV file
//- Add sorting by name or phone
//- Create subclasses for PersonalContact and BusinessContact
//- Add validation for phone/email formats

//Double Tap ❤ For More
/*
 * ✅ Java Project: Contact Book Using OOP 📇

📌 Problem Statement:
Build a console-based Contact Book application that allows users to add, view, search, and delete contacts using object-oriented principles.

🧠 What You'll Learn:
- Defining classes and objects
- Encapsulation and constructors
- Using ArrayList for dynamic data storage
- Menu-driven programming with loops and switch-case
- Input handling with Scanner

🧱 Core Classes

*1. Contact Class*
Represents a single contact.

java
 */
