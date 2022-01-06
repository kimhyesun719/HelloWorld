'use strict';

// Array 배열

// 1. 배열 선언
const arr1 = new Array();
const arr2 = [1, 2];

// 2. 인덱스 position
const fruits = ['사과', '바나나', '딸기'];
console.log(fruits);
console.log(fruits.length);
console.log(fruits[0]); // 사과
console.log(fruits[2]); // undefined

// 3. 배열 출력
for(let i=0; i<fruits.length; i++){
    console.log(fruits[i]);
}

// for of로 출력
for (let f of fruits){
    console.log(f);
}

// for Each로 출력
fruits.forEach(function(fruit, index, array){
    console.log(fruit);  //  사과, 바나나, 딸기
});

fruits.forEach(function(fruit, index, array){
    console.log(fruit, index, array); // 사과 0 [배열]
});
// 윗 문장을 array지운상태로 한줄로 출력하기
fruits.forEach((fruit,index) => console.log(fruit,index));

// 4. 삽입 삭제

// 삽입 push
fruits.push('복숭아');
console.log(fruits); 

// 삭제 pop
fruits.pop('복숭아');
console.log(fruits); 

// 맨앞에서부터 삽입 unshift
fruits.unshift('복숭아');
console.log(fruits); 

// 맨앞에서부터 삭제 shift
fruits.shift();
console.log(fruits); 

// 지정된 위치에서 삭제 혹은 삽입 splice
fruits.splice(1, 1); // 시작위치부터 하나만 지울거야
console.log(fruits); 

fruits.splice(1, 0, '복숭아', '수박'); // 시작위치에서 0개 지우고 그 위치에서 두개 삽입할거야
console.log(fruits); 

// 배열 합치기 concat
const fruits2 = ['자몽', '귤'];
const newFruits = fruits.concat(fruits2);
console.log(newFruits);

// 5. 배열 안에서 검색하기 Searching
console.log(newFruits);
// 몇번째 위치에 있는지?
console.log(newFruits.indexOf('귤')); // 5
// 포함하고 있는지?
console.log(newFruits.includes('귤')); // true
// 뒤에서부터 세기
console.log(newFruits.lastIndexOf('귤')); // 같은값이 있을때 유용함


// 퀴즈
