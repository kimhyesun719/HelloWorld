let number = 2;
let number2 = number;
console.log(number);
console.log(number2);

number2 = 3;

console.log(number);
console.log(number2);

// object
let obj = {
    name: 'hs',
    age : 5,
};
console.log(obj.name);

let obj2 = obj;

console.log(obj2.name);

obj.name = '뻐꾸기';
console.log('--------');
console.log(obj.name);
console.log(obj2.name);

//const num =2;
//num = 4; // 오류남 const변경 불가 단, object로 만들면 그 안 변수들은 변경 가능
// 아래 예시 참조
const obj3 = {
    color: 'blue',
    size: 's',
}; // 여기서 obj3를 통으로 바꾸는건 불가능함 BUT
obj3.color = 'green';
// 위처럼 안 변수를 바꾸는건 가능
console.log(obj3);