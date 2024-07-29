    Person person1 = new Person("Alice", 25);
    Person person2 = new Person("Bob", 30);

    if (person1.compareTo(person2) < 0) {
        System.out.println(person1.getName() + " is younger than " + person2.getName());
    } else {
        System.out.println(person1.getName() + " is not younger than " + person2.getName());
    }
    