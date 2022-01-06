'use strict';

// 배열을 문자열로 변환하기
{
    const friends = ['김혜선', '윤아영', '짱보미'];
    console.log(friends);
    const result = friends.join('and'); // 기본값은 ,임
    console.log('join 결과:' + result); // string으로 변환
} 


// 문자열을 배열로 변환하기 
{
    const friends = '김혜선, 윤아영, 짱보미';
    console.log(friends);
    const result = friends.split(',');
    console.log('split 결과:' + result);
}// 반응 없음..


// 배열을 거꾸로 변환
{
    const array = [1, 2, 3, 4, 5];
    const result = array.reverse()
    console.log(result);
}


// 첫번째와 두번째 값을 뺀 배열 재생성
{
    const array = [1, 2, 3, 4, 5];
    const result = array.splice(0, 2); // 3번째 자리부터 3개 삭제할거야
    console.log(result); // 삭제된값 1, 2
    console.log(array); // 현재 배열 3, 4, 5
}
{
    const array = [1, 2, 3, 4, 5];
    const result = array.slice(2, 5); // 받고싶은 마지막값에 +1
    console.log(result); // slice된 배열만 표시됨 
    console.log(array);  // 원 배열엔 변화없음
}


// 학생 배열
class student {
    constructor(name, age, enrolled, score) {
        this.name = name;
        this.age = age;
        this.enrolled = enrolled;
        this.score = score;
    }
}
const students = [
    new student ('A', 29, true, 45),
    new student ('B', 28, true, 80),
    new student ('C', 30, false, 90),
    new student ('D', 25, true, 60)
];

// 학생의 점수가 90점인 학생 찾기 find (가장 첫값)
{
    const result = students.find(function(student) {
        return student.score === 90;
    });
    console.log(result);
}

// 등록값이 true인 학생 찾기 filter (전체값)
{
    const result = students.filter(function(student) {
        return student.enrolled == true;
    });
    console.log(result);
}

// 학생들의 점수만 모아보기 map
{
    const result = students.map(function(student) {
        return student.score;  // 학생들의 점수를 2배로 만들고 싶다면 끝에 * 2
    });
    console.log(result);
}

// 학생중 50점미만 학생이 있는지 some // 하나라도 조건에 만족한다면 true
{
    const result = students.some(function(student) {
        return student.score < 50;  // true
    });
    console.log(result);
}

// 학생들의 누적 점수, 평균 점수 구하기 reduce
{
    const result = students.reduce((prev, curr) => { // prev 이전전달값 curr배열의 아이템 
        console.log('-----누적값------');
        console.log(prev);
        console.log(curr);
        return prev + curr.score;
    }, 0); // 0으로 초기화
    console.log(result); // 누적값
    console.log(result / students.length); // 평균값
}

// 학생들의 모든 점수를 string으로 변환하기 
{
    const result = students.map(function(student) {
        return student.score; 
    });
    console.log(result);

    const result2 = result.join(',');
    console.log(result2);
}

// 학생들 점수를 낮은순으로 정렬한 다음 문자열로 변환 .sort
{
    const result = students
        .map((student) => student.score)
        .sort((a, b) => a - b) // 낮은것부터 높은것까지
        .join();
    console.log(result);
}