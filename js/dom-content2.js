const title =document.querySelector("#title");
const userName= document.querySelector("#desc p");
const pImage=document.querySelector("#profile img");

title.onclick =() => title.innerText="프로필";

userName.onclick=()=> userName.innerHTML=`이름:<b>신사임당</b>`;
pImage.onclick=() => pImage.src= "../js-6(dom)/images/person2.png";