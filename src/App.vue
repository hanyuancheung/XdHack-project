<template>
  <div id="app">
    <router-view/>
    <div v-show="$route.path !== '/'">
      <van-tabbar v-model="active">

        <van-tabbar-item name="home" @click="$router.push('/helloword')" icon="home-o">周围商铺</van-tabbar-item>
        <van-tabbar-item name="like" @click="$router.push('/preference')" icon="like-o">贴心推荐</van-tabbar-item>
        <van-tabbar-item name="setting" @click="$router.push('/person')" icon="setting">个人中心</van-tabbar-item>
      </van-tabbar>
    </div>

  </div>
</template>

<script>
    export default {
        name: 'app',
        data() {
            return {
                active: "home",
            }
        },
        mounted() {
            console.log()
        }
    }
</script>

<style>
  html, body {
    width: 100%;
    height: 100%;
    margin: 0;
    padding: 0;
    background: rgba(0, 0, 0, 0);
    overflow: hidden;
    margin: auto 0;
  }

  #app {
    width: 100%;
    height: 100%;
    overflow: hidden;
    margin: 0 auto;
  }
</style>
