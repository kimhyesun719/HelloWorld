// bad code
function getResult(score) {
    let result;
    if (score > 5) {
        result = 'up';
    } else if (score <= 5) {
        result = 'down';
    }
    return result;
}
// 위 코드를 아래처럼 변환가능 
// good code
function getResult(score) {
    return score > 5 ? 'up' : 'down';
}

// 배열에서 새로 추가하기
let fruits = ['수박', '딸기','사과','바나나'];

//fruits.push('망고'); 기존 배열 추가방법
fruits = [...fruits, '망고']; // 새로운 배열 생성

// 두 배열을 합칠때
let fruits2 = ['자몽', '파파야'];
let combined = fruits.concat(fruits2);
console.log(combined);
// 혹은
combined2 = [...fruits, ...fruits2];
console.log(combined2);

// && 문 바꾸기
const bob = {
    name: 'julia',
    age:20,
};
const anna = {
    name: 'julia',
    age:20,
    job: {
        title: '보미 밥주기',
    },
};

function Job(person) {
    if(person.job && person.job.title) { // job이 있고 그 job의 title이 있다면
        console.log(person.job.title);
    }
}
//위를 아래처럼
function Job(person) {
    if(person.job?.title) { // ?는 job이 있다면을 대신함
        console.log(person.job.title);
    }
}
// 또 위를 아래처럼도 사용 가능
function Job(person) {
    const title = person.job?.title ?? 'No Job Yet'; //  job이 있고 그 job의 title이 있다면 ? 없다면 다음 문장 출력
    console.log(title);
}


// 배열 내 중복 제거
const array = ['강아지', '토끼', '고양이', '강아지', '사자', '고양이'];
console.log(array);

console.log([...new Set(array)]); // Set은 중복 비허용