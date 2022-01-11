/*
* https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Object_initializer
*/
// 1.
const hs1 = {
    name: 'hyesun',
    age: '20',
};

const name = 'hyesunee';
const age = '25';

const hs2 = {
    name : name,
    age : age,
};
// 위 처럼 키랑 밸류값이 일치하면 아래처럼 축약 가능
const hs3 = {
    name,
    age,
}; 

console.log(hs1, hs2, hs3);

// 2. obj값 정의
const student = {
    name: 'hyesun',
    level: '1',
};

{
    const name =  student.name;
    const level = student.level;
    console.log(name, level);
}
// 이걸 줄여서
{
    const {name, level} = student;
    console.log(name, level);
}

// 3. 배열에도 동일하게 적용 가능
const animals = ['강아지', '고양이', '사자'];

{
    const first = animals[0];
    const second = animals[1];
    console.log(first, second);
}

// 위를 줄여서
{
    const [first, second] = animals;
    console.log(first, second);
}

// 배열 병합
const fruits1 = ['복숭아', '사과'];
const fruits2 = ['바나나', '키위'];
const fruits = [...fruits1, ...fruits2];
console.log(fruits);

// if문 줄이기
const isCat = true;
{
    let component;
    if(isCat) {
        component = '고양이';
    }else{
        component = '강아지';
    }
    console.log(component);
}

// 위에꺼를 아래처럼
{
    const component = isCat ? '고양이' : '강아지'; // true면 고양이 false면 강아지
    console.log(component);
    console.log(isCat ? '고양이' : '강아지');
}

// 문장작성 요약
{
    const type = '푸들';
    const name = '보미';

    console.log(
        '우리 강아지 종류는' + type + '이름은' + name
    );

    // 위를 아래처럼
    console.log(`우리 강아지 종류는 ${type} 이름은 ${name}입니다.`);

};
