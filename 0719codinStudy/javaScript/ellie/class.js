'use strict';

class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    speak() {
        console.log(`${this.name}: hello!`);
    }
}

const hs = new Person('hyesun', 20);
console.log(hs);
hs.speak();

