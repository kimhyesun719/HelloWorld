'use strict';

//2. Variable 변수
// let (added in ES6)
let globalName = 'gname';
{

    let name = 'hs';
    console.log(name);
    name = 'hi';
    console.log(name);
}
console.log(name);
console.log(globalName);

// var 쓰지말것 1.비상식적, 2.블럭 무시
// var hoisting 어디에 선언되어있든 끌어 올려주는것

// 3. Constants / const
// 변경 불가능한 데이터 타입
// 1.보안상 적절 2.나중에 코드 변경시 실수 방지

// 4. Variable types
// 여러 데이터 타입들

// 5. Dynamic typing ! : dynamically typed language
let text = 'hello';
console.log(`value : ${text}, type: ${typeof text}`);
text = 1;
console.log(`value : ${text}, type: ${typeof text}`);
text = '7' + 5;
console.log(`value : ${text}, type: ${typeof text}`);
text = '8' / '2';
console.log(`value : ${text}, type: ${typeof text}`);