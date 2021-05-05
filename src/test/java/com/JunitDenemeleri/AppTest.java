package com.JunitDenemeleri;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.junit.experimental.categories.Category;

import java.util.concurrent.TimeUnit;

public class AppTest 
{
    App app ;
    @BeforeClass
    public static void setUpp(){

        System.out.println("-------- BEFORE CLASS -----------");
    }

    @Before
     public void setUp(){

        app = new App();
        System.out.println("-------- TEST BAŞLIYOR --------------");
    }

    @Test(timeout = 2000)
    public void helloWorldTest() throws InterruptedException {

        System.out.println("-------- TEST YAPILIYOR ---------");
        Assert.assertEquals("String Hatası!!!","Hello World!!",app.getHelloWorld());
        TimeUnit.SECONDS.sleep(1);
    }
    @Test
    public void helloWorldTest2() {

        System.out.println("-------- TEST YAPILIYOR2 ---------");
        Assert.assertTrue("Hata!! String eşleşmiyor.",app.getHelloWorld().equals("Hello World!!"));
    }
    @Category(AssertSameSelectable.class)
    @Test
    public void assertEqualsDeneme(){
     String yazi = "123";
     int sayi = 123;
     byte sayi1 = 123;

     Assert.assertEquals("string-int farkı ",sayi,sayi1);
     Assert.assertNotEquals("Aynı tür değişken ", sayi,yazi);
    }

    @Category(AssertSameSelectable.class)
    @Test
    public void assertSameDeneme(){

     int sayi = 123;
     int  sayi1 = 123;

     Assert.assertSame("Tür uyuşmazlığı",sayi,sayi1);
    }

    @Test
    public void assertTrueFalseDeneme(){

        boolean secim1 = true;
        boolean secim2 = false;


        Assert.assertTrue("Aynı boolean değer dönmüyor ",secim1);
        Assert.assertFalse("Aynı boolean değer dönüyor",secim2);
    }

    @Ignore("Canım istedi Ignore attım :)")
    @Test
    public void assertFailDeneme(){

        Assert.fail("İsteyerek Hata Mesajı");
    }

    @Test
    public void assertNullAndNotNullDeneme(){

        Object bos = null;
        Assert.assertNotNull("Obje Boş!",app);
        Assert.assertNull("Boş Değil!!",bos);
    }

    @Test
    public void assertEqualsWithBoolean(){
        boolean secim1 =  true;
        boolean secim2 = false;
        boolean secim3 = false;

        Assert.assertEquals("aynı sacim değil!!",secim3,secim2);
    }
    @Test
    public void assertSameWithBoolean(){
        boolean secim1 =  true;
        boolean secim2 = false;
        boolean secim3 = false;

        Assert.assertSame("aynı sacim değil!!",secim3,secim2);
    }

    @After
    public void tearDown(){
        System.out.println("------- TEST BİTTİ --------");
    }
    @AfterClass
    public static void tearDownn(){
        System.out.println("-------- AFTER CLASS -----------");
    }
}
