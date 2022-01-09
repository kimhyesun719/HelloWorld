'use strict';

// 동기적인 자바
console.log('1');
setTimeout(function(){
    console.log('2');
}, 1000); // 1000ms 1초
console.log('3');

// synchronous callback 동기식 콜백
function printImmediately(print) {
    print();
}
printImmediately(function(){
    console.log('hello');
});


// Asynchronous callback 비동기 콜백
function printWithDelay(print, timeout) {
    setTimeout(print, timeout);
}
printWithDelay(()=> console.log('비동기 콜백'), 2000);  


// 최종 순서
// 1 -> 3 -> hello -> 2 -> 비동기 콜백


// 콜백 지옥 예시
class UserStrorge {
    loginUser(id, password, onSuccess, onError) {
        setTimeout(() => {
            if (
                (id === 'hs' && password === '1234') ||
                (id === 'godhs' && password === 'q1234')
            ) {
                onSuccess(id);
            }else {
                onError(new Error('not found'));
            }
        }, 2000);
    }
    getRoled(user, onSuccess, onError) {
        setTimeout(() => {
            if (user === 'hs') {
                onSuccess({ name: 'hs', role: 'admin' });
            }else{
                onError(new Error('no access'));
            }
        }, 1000);
    }
}
const userStrorge = new UserStrorge();
const id = prompt('enter your id');
const password = prompt('enter your passrod');
userStrorge.loginUser(
    id,
    password,
    user => {
        userStrorge.getRoled(
            user,
            userWithRole => {
                alert(`Hello ${userWithRole.name}, you have a ${userWithRole.role} role`);
            },
            error => {
                console.log(error);
            }
        );
    },
    error => {
        console.log(error);
    }
);