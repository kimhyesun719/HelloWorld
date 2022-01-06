//'use strict';

//const name = 'hyesun';
//const age = 20;
//print(name,age);
const obj1 = {};
// 오브젝트 = key, value 집합체
function print(Person) {
    console.log(Person.name);
    console.log(Person.age);
}
const hs = { name: 'hyesun', age: 20};
print(hs);

//2. 계산된 properties
console.log(hs.name);
console.log(hs['name']);

const array = [1, 2, 3, 4];

for(value of array){
    console.log(value);
}

for(key in hs){
    console.log(key);
}

// 다른 값을 같이 제시했을 경우
const fruit1 = {color : 'red'};
const fruit2 = {color : 'blue', size: 'big' };
const mixed = Object.assign({}, fruit1, fruit2); // 키값이 동일하면 뒤에 값이 앞에 값을 덮어 씌움
console.log(mixed.color);
console.log(mixed.size);