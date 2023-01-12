package day05;

import org.junit.Test;

public class C01_Notasyon_Annotation {
    // Java daki gibi selenium da da belirli islevleri yapan methodlar olusturabiliriz.
    // ancak bu methodlar cagrilmadikca calismazlar
    public void ilkTestMethodu(){
        System.out.println("Ilk test methodumuz");
    }

    // JUnit ile Notasyon kullanarak siradan methodlari test method una donusturebiliriz.
    // Bir test methodu bagimsiz olarak calisabilen test yapmamiza imkan verir
    // @Test notasyonu sayesinde main method mecburiyeti otadan kalkar

    @Test
    public void notasyonluIlkTestMethodu(){
        System.out.println("notasyonlu ilk test methodumuz");
    }


}
