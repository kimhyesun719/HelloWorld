// 1. String concatenation
console.log('my' + 'cat');
console.log('1' + 2);
console.log(`string literals : 1 + 2 = ${1 + 2}`);

// 2. Numeric operators
console.log(2 ** 3); // 2의 3승

// 3.Increment and decrement operators
let counter = 2;
const preIncrement = ++counter;
console.log(counter);

// 4.Assignment operators
let x = 3;
let y = 6;
x += y; // x = x+ y;
console.log(x);

// 5. Comparison operators
console.log(10 < 6);

// 6. Logical operators: || (or), && (and), ! (not)
const val1 = false;
const val2 = 4 < 2;
// or ||
console.log(`or: ${val1 || val2 || check()}`);
// 셋중 하나라도 true가 있다면 true 출력
// check 함수는 아래와 같음
function check() {
    for (let i = 0; i < 10; i ++) {
        // wasting time
        console.log('뻐꾹');
    }
    return true;
}

// 위에서 앞에꺼가 true나오면 뒤에 함수 실행 안됨
const val3 = true;
const val4 = 4 < 2;
// ||
console.log(`or: ${val3 || val4 || check2()}`);
// 셋중 하나라도 true가 있다면 true 출력
// check 함수는 아래와 같음
function check2() {
    for (let i = 0; i < 10; i ++) {
        // wasting time
        console.log('뻐꾹');
    }
    return true;
}

// and &&
const val5 = false;
const val6 = 4 < 2;

console.log(`and: ${val5 && val6 && check3()}`);
// 셋 모두가 true여야 하기 때문에 앞이 false면 실행 안함
// check 함수는 아래와 같음
function check3() {
    for (let i = 0; i < 10; i ++) {
        // wasting time
        console.log('뻐꾹');
    }
    return true;
}

// 7. Equality
const strFive = '5';
const numFive = 5;

console.log(strFive == numFive); // == 타입 같이 변경해줌
console.log(strFive != numFive);

console.log(strFive === numFive); // === 타입을 변경 안해줌(다른타입이면 false)
console.log(strFive !== numFive);

// 퀴즈
console.log(0 == false); // t
console.log(0 === false); // f
console.log('' == false); // t
console.log('' === false); // f
console.log(null == undefined); // t
console.log(null === undefined); // f

// 8. Conditional operators: if
// if, else if, else
const name = 'hs';
if(name === 'hs') {
    console.log('hi hs!~');
} else if (name === 'hh') {
    console.log('hi hhhhh!~');
} else{
    console.log('unkwnon');
}

// 9. Ternary operator : ?
// condition ? value1 : value2;
//좀더 쉬운 if문 
console.log(name === 'hs' ? 'yes' : 'no');

// 10. Switch 문
const browser = 'IE';
switch (browser) {
    case 'IE' :
        console.log('go hyesun');
        break;
    case 'Chrome':
    case 'Firefox':
        console.log('love yooou');
        break;
    default:
        console.log('same all');
        break;
}

// 퀴즈
//01. 0~10까지 짝수만 출력되게끔(continue 사용)
for(let i=0; i<=10; i++){
    if(i % 2 !== 0 && i > 0) { 
        continue;// true일경우 continue로 다시 반복문 실행 false면 console실행
    }
    console.log(`q1 : ${i}`);
}

//02. 0~10까지 출력되는데 8일때 빠져 나오도록
for(let i=0; i<=10; i++){
    if(i == 8){
        break;
    }
    console.log(`q2 : ${i}`)
}