package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.Smartphone;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClasses {

    @Test
    public void toStringShouldReturnProperlyForLaptop(){
        Laptop test_laptop = new Laptop(32, "Crucial", "Ryzen 7 5600x",
                1024, "RTX 3080", "Latitude", "Dell", "2-in-1");

        assertEquals("Laptop Name: Latitude\nBrand: Dell\nForm Factor: 2-in-1\nMemory Amount: 32gb\nMemory Type: Crucial\nCPU Name: Ryzen 7 5600x\nStorage Space: 1024gb\nGPU Name: RTX 3080", test_laptop.toString());
    }

    @Test
    public void equalsShouldReturnProperlyForLaptop(){
        Laptop test_laptop1 = new Laptop(32, "Crucial", "Ryzen 7 5600x",
                1024, "RTX 3080", "Latitude", "Dell", "2-in-1");
        Laptop test_laptop2 = new Laptop(32, "Crucial", "Ryzen 7 5600x",
                1024, "RTX 3080", "Shield", "Razer", "2-in-1");

        assertFalse(test_laptop1.equals(test_laptop2));
    }

    @Test
    public void equalsShouldReturnTrueForSameLaptop(){
        Laptop test_laptop1 = new Laptop(32, "Crucial", "Ryzen 7 5600x",
                1024, "RTX 3080", "Latitude", "Dell", "2-in-1");
        assertTrue(test_laptop1.equals(test_laptop1));
    }

    @Test
    public void inheritsSuperInFirstConstructorForLaptop(){
        Laptop test_laptop = new Laptop(32, "Crucial", "Ryzen 7 5600x",
                1024, "RTX 3080", "Latitude", "Dell", "2-in-1");

        assertEquals(32, test_laptop.getMemoryAmount());
    }

    @Test
    public void toStringShouldReturnProperlyForSmartphone(){
        Smartphone test_smartphone = new Smartphone(4, "G.Skill", "Arm", 64,
                "Integrated", "Note 10", "Samsung", 3.2);
        assertEquals("Smartphone Name: Note 10\nBrand: Samsung\nScreen Size: 3.2\nMemory Amount: 4gb\nMemory Type: G.Skill\nCPU Name: Arm\nStorage Space: 64gb\nGPU Name: Integrated", test_smartphone.toString());
    }

    @Test
    public void equalsShouldReturnProperlyForSmartphone(){
        Smartphone test_smartphone1 = new Smartphone(4, "G.Skill", "Arm", 64,
                "Integrated", "Note 10", "Samsung", 3.2);
        Smartphone test_smartphone2 = new Smartphone(4, "G.Skill", "Arm", 64,
                "Integrated", "12 Pro", "iPhone", 3.2);

        assertFalse(test_smartphone1.equals(test_smartphone2));
    }

    @Test
    public void equalsShouldReturnProperlyForSameSmartphone(){
        Smartphone test_smartphone1 = new Smartphone(4, "G.Skill", "Arm", 64,
                "Integrated", "Note 10", "Samsung", 3.2);

        assertTrue(test_smartphone1.equals(test_smartphone1));
    }

    @Test
    public void inheritsSuperInFirstConstructorForSmartPhone(){
        Smartphone test_smartphone = new Smartphone(4, "G.Skill", "Arm", 64,
                "Integrated", "Note 10", "Samsung", 3.2);

        assertEquals(4, test_smartphone.getMemoryAmount());
    }

    @Test
    public void laptopShouldReturnId(){
        Laptop test_laptop = new Laptop(32, "Crucial", "Ryzen 7 5600x",
                1024, "RTX 3080", "Latitude", "Dell", "2-in-1");

        assertEquals(1, test_laptop.getId());
    }

    @Test
    public void smartphoneSHouldReturnId(){
        Smartphone test_smartphone = new Smartphone(4, "G.Skill", "Arm", 64,
                "Integrated", "Note 10", "Samsung", 3.2);

        assertEquals(1, test_smartphone.getId());
    }
}
