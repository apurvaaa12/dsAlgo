package designPatterns;

import designPatterns.singletonClass.MutableClass;

import java.util.Date;

public final class ImmutableClass {

    private final String name;
    private final long mobileNumber;
    private final int age;
    private final Date date;
    private final MutableClass address;

    public ImmutableClass(String name, long mobileNumber, int age, Date date, MutableClass mutableClass) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.date = date;
        this.address = mutableClass;
    }

    public String getName() {
        return name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public int getAge() {
        return age;
    }

//    public Date getDate() {
//        return date;
//    }

    public Date getDate() {
        return (Date) date.clone();  //If we pass a clone we will not be able to modify it
    }

//    public MutableClass getAddress() {
//        return address;
//    }

    public MutableClass getAddress() {
        return new MutableClass(address.getState(),address.getCity());
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                ", date=" + date +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args){
        MutableClass address = new MutableClass("karnataka","blr");
        ImmutableClass employee = new ImmutableClass("APURVA",990820,25,
                new Date(),address);
//        immutableClass.getName() = "pop"; doeesn't work since we've made it final
        employee.getDate().setDate(1);
        System.out.println(employee);
        employee.getAddress().setState("Maharastra");
        System.out.println(address);
    }
}
