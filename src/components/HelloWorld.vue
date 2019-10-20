<template>
  <div >
    <van-nav-bar
        left-text="返回"
        left-arrow
        @click-left="onClickLeft"
    />
    <div>
      <van-dropdown-menu>
        <van-dropdown-item v-model="value1" :options="option1" />
        <van-dropdown-item v-model="value2" :options="option2" />
      </van-dropdown-menu>
      <div>
        <div v-for="(val, item) in list" :key="item">
          <van-card
              :tag="val.tag"
              :desc="val.desc"
              :title="val.title"
              thumb="https://img.yzcdn.cn/vant/t-thirt.jpg"
          >
            <div slot="tags">
              <van-tag plain type="danger">
                <van-rate
                  v-model="valuestart"
                  :size="10"
                  color="#ee0a24"
                  void-icon="star"
                  void-color="#eee"
              />
                <span>4.5</span>
              </van-tag>
              <van-tag plain type="danger">促销8折</van-tag>
              <div>均价:￥{{val.price}}/每条</div>
            </div>
            <div slot="footer">
              <van-button @click="opendialog" size="mini">200m</van-button>
              <!--<van-button size="mini">按钮</van-button>-->
            </div>
          </van-card>
        </div>
      </div>

    </div>

  </div>
</template>

<script>
    export default {
        methods: {
            onClickLeft() {

            },
            opendialog(){
                this.$dialog.confirm({
                    message: '是否需要跳转导航App'
                }).catch((res) =>{
                    console.log(res)
                })
            }
        },
        data() {
            return {
                valuestart:4,
                value1: 0,
                value2: 'a',
                option1: [
                    {text: '全部商铺', value: 0},
                    {text: '休闲装', value: 1},
                    {text: '商务装', value: 2},
                    {text: '运动装', value: 3},
                ],
                option2: [
                    {text: '默认排序', value: 'a'},
                    {text: '人气优先', value: 'b'},
                    {text: '好评优先', value: 'c'},
                ],
                list: [
                    {
                        tag: '商务',
                        desc: '合生汇国际广场L2-43',
                        title: 'GUCCI',
                        price: 1000
                    },
                    {
                        tag: '休闲',
                        desc: '合生汇国际广场L2-44',
                        title: '森马',
                        price: 100
                    },
                    {
                        tag: '运动',
                        desc: '合生汇国际广场L2-40',
                        title: 'nike',
                        price: 400
                    },
                    {
                        tag: '运动',
                        desc: '合生汇国际广场L2-40',
                        title: '阿迪达斯',
                        price: 300
                    },

                ]
            }
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
  .divcontant{

  }
</style>
