'use strict';

//promise 비동기적에 유용
// 상태 : pending => fulfilled or rejected
//Producer vs Consumer

// 1. Producer
const promise = new Promise((resolve, reject) => {
    // 비동기적 처리방식이 좋음
    console.log('힘들다진짜');
    setTimeout(() => {
        //resolve('hs');
        reject(new Error('졸리다진짜'));
    }, 2000);
});

promise.then(value => { // then resolve정상작동 값 담김
    console.log(value);
});
