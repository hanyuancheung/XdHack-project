<template>
  <div>
    <van-nav-bar
        left-text="返回"
        left-arrow
        @click-left="onClickLeft"
    />
    <img class="user-poster" src="https://img.yzcdn.cn/public_files/2017/10/23/8690bb321356070e0b8c4404d087f8fd.png">

    <van-cell-group class="user-group">
      <van-cell icon="records" title="全部订单" is-link />
    </van-cell-group>

    <van-cell-group>
      <van-cell icon="points" title="推荐记录" is-link />
      <van-cell icon="gold-coin-o" title="我的优惠券" is-link />
      <van-cell icon="gift-o" title="会员中心" is-link />
    </van-cell-group>
  </div>
</template>

<script>
    import { Row, Col, Icon, Cell, CellGroup } from 'vant';

    export default {
        methods: {
            onClickLeft(){}
        },
        components: {
            [Row.name]: Row,
            [Col.name]: Col,
            [Icon.name]: Icon,
            [Cell.name]: Cell,
            [CellGroup.name]: CellGroup
        }
    };
</script>

<style lang="less">
  .user {
    &-poster {
      width: 100%;
      height: 53vw;
      display: block;
    }

    &-group {
      margin-bottom: 15px;
    }

    &-links {
      padding: 15px 0;
      font-size: 12px;
      text-align: center;
      background-color: #fff;

      .van-icon {
        display: block;
        font-size: 24px;
      }
    }
  }
</style>
