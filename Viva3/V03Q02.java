package com.guild.roles.RoleTest;

import com.guild.roles.Role.Role;

public class RoleTest {

    public static void main(String[] args) {

        // Create several Role objects using both constructors
        Role role1 = new Role();
        Role role2 = new Role("Eldrin", 120, "Elf", 250.5);
        Role role3 = new Role("Gorak", 45, "Orc", 180.0);

        // Use setter methods to modify some attributes
        role1.setName("Mystra");
        role1.setAge(300);
        role1.setRace("Human");
        role1.setMana(500.0);

        role2.setMana(300.0);

        // Call performAction() for each object.
        role1.performAction();
        role2.performAction();
        role3.performAction();

        System.out.println();

        // Print out all role details (name, age, race, mana)
        printRoleDetails(role1);
        printRoleDetails(role2);
        printRoleDetails(role3);
    }
        // Helper method to print role details
    private static void printRoleDetails(Role role) {
        System.out.println("Name : " + role.getName());
        System.out.println("Age  : " + role.getAge());
        System.out.println("Race : " + role.getRace());
        System.out.println("Mana : " + role.getMana());
        System.out.println();
    }
}
