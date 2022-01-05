function printHello(){
    console.log('hello');
}
printHello();

function log(message){
    console.log(message);
}
log('Hello@')

// 2. Parameters
function changeName(obj) {
    obj.name = 'coder';
}
const hs = { name : 'hs'};
changeName(hs);
console.log(hs);

// 3. Default parameters
function showMsg(message, from = '뻐꾹'){
    console.log(`${message} by ${from}`);
}
showMsg('hi~');

// 4. Rest parameters
function printAll(...args){
    for(let i=0; i<args.length; i++){
        console.log(args[i]);
    }
}
printAll('나지금', '똥마려', '배아파');

// 5. Local scope 
// 밖에서는 안이 보이지 않고 안에서는 밖이 보인다
let globalMsg = 'global';
function printMsg() {
    let message = 'hi hs';
    console.log(message);
    console.log(globalMsg); // 밖에꺼가 출력됨
}
printMsg();
// console.log(globalMsg); 오류남 밖에서는 안을 볼수 없다

// 6. Return a value
function sum(a,b) {
    return a + b;
}
const result = sum(1, 2); //3
console.log(`sum: ${sum(1,2)}`);

// 7. Early return, early exit
function upgradeUser(user) {
    if(user.point > 10) {
        // 너무 긴 로직..
    }
}

function upgradeUser(user) {
    if(user.point <= 10) {
        return;
    }
    // 합리적 로직!
}

// Callback 함수
function callback(answer, printYes, printNo){
    if(answer === 'love bomi') {
        printYes();
    } else {
        printNo();
    }
}
const printYes = function(){
    console.log('yeees');
}
const printNo = function(){
    console.log('nooooo');
}
callback('wrong', printYes, printNo);
callback('love bomi', printYes, printNo);

// Arrow function! 코드를 간결하게 줄여줌

/* 평소방법
const simple = function(){
    console.log('simple~~!!');
};
simple();
*/

const simple = () => console.log('simple!!');
const add = (a,b) => a + b;
const simpleMuitiply = (a, b) => {
    return a * b;
};
simple();

// IIFE
function hihs(){
    console.log('IIFE');
};
hihs(); // 원래방법

(function hibomi(){
    console.log('IIFE bomi');
})();

// 퀴즈 ㅡㅡ
// 계산기 만들기(command, a, b)
// command: add, substract, divide, multiply, remainder
function calculate(command, a, b) {
    if(command === 'add') {
        a + b;
    } else if(command === 'multiply') {
        a * b ;
    } else{
         a/ b;
    }
}
console.log(add, 1 , 3);


