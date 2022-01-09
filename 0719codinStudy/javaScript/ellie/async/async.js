// clear style of using promise 깔끔한 promise 사용법

// async 사용법

//function feachUser() {
//    return new Promise((resolve, reject) => {
//        resolve ('hs');
//    });
//} -> 이걸 아래처럼 줄이기 가능
async function feachUser(){
    return 'god hs';
}

const user = feachUser();
user.then(console.log);
console.log(user);

// 2. await
