// JSON
//stringfy
let json = JSON.stringify(true);
console.log(json);

json = JSON.stringify(['사과', '바나나']);
console.log(json);

const rabbit = {
    name: 'tori',
    color: 'white',
    size: null,
    btd: new Date(),
    jump: () => {
        console.log(`${name} can jump!`);
    },
};
json = JSON.stringify(rabbit);
console.log(json); // 점프 함수 포함 안되는거 확인 가능

json = JSON.stringify(rabbit, ['name', 'color']);
console.log(json);