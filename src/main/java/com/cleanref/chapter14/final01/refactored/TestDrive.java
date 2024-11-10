package com.cleanref.chapter14.final01.refactored;

public class TestDrive {
    /*
        - Introduce Parameter Object: EmailMessage sınıfını ekleyerek e-posta konusunu ve içeriğini bir nesneye dönüştürdük.
        - Extract Class: User, NotificationService, UserEligibilityChecker gibi bağımsız sınıflar oluşturarak
        kodu daha modüler hale getirdik.
        - Extract Method: createEmailMessage ve sendUserNotification metotlarını ayırarak daha okunabilir bir yapı oluşturduk.
        - Replace Conditional with Polymorphism: isActive, isInactive gibi UserStatus enum sabitlerini
        User sınıfında durum kontrolü yaparak kullandık. Bu, farklı durumlarda davranışların değişmesine olanak tanıyor.
        - Introduce Enum (Enum Tanımlama): UserStatus ve UserGroup enumlarını tanımlayarak
        status ve grp değerlerini magic stringlerden kurtardık.
        - Encapsulate Collection (Koleksiyonu Kapsülleme): users listesini UserManager sınıfına private final olarak ekledik.
        - Stream API Kullanımı: Kullanıcıları filtrelemek ve işlem yapmak için stream ve filter kullanarak kodu sadeleştirdik.
        - Replace Temp with Query: status, group, email, name gibi geçici değişkenlerden kurtulduk,
        direkt User sınıfı ile metotlar oluşturduk.
        - Introduce Static Method: isEligibleForNotification ve sendUserNotification gibi işlemleri bağımsız hale getirerek
        statik metotlara taşıdık.
        - Record Kullanımı: EmailMessage için Java'nın record yapısını kullanarak gereksiz getter/setter tanımlarından kurtulduk.
     */
}
