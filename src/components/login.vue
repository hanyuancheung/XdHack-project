<template>
  <div class="user-warp">
    <div class="user-img">
    </div>
    <div class="user-input">
      <div class="user-account">
        <input type="tel" placeholder="请输入手机号">
      </div>
      <div class="user-password">
        <input type="password" placeholder="输入密码">
      </div>
      <van-button style="width:100%;margin-top: 30px" @click="$router.push('/helloword')" round type="info">登录</van-button>
    </div>
  </div>
</template>

<script>
    export default {
        name: "login",
        created() {
            console.log('343')
        }
    }
</script>

<style>
  .user-warp {
    background-color: #2e9d65;
    width: 100%;
    height: 100%;
    position: relative;
  }

  .user-img {
    overflow: hidden;
    height:400px;
    width: 400px;
    position: absolute;
    top: 150px;
    right: calc(50% - 200px);
    background-size: 100% 100%;
    background-image: url("../assets/logo.png");
  }

  .user-input {
    position: absolute;
    top: 600px;
    width: 100%;
    height: 100%;
    padding:0 30px;
    box-sizing: border-box;
  }

  .user-account {
    display: flex;
    position: relative;
    justify-content: center;
  }

  .user-account > input {
    width: 600px;
    background: none;
    outline: none;
    height: 80px;
    padding-left: 60px;
    border: 1px solid white;
    border-radius: 30px;
  }

  .user-password {
    position: relative;
    display: flex;
    margin-top: 20px;
    justify-content: center;
  }

  .user-password > input {
    width: 600px;
    background: none;
    outline: none;
    height: 80px;
    margin-top: 30px;
    padding-left: 60px;
    border: 1px solid white;
    border-radius: 30px;
  }
  .user-button{

  }
  input::-webkit-input-placeholder, textarea::-webkit-input-placeholder {
    color: white;
    font-size: 30px;
    line-height: 88px;
  }
</style>
