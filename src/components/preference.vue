<template>
  <div data-v-75563610="" class="sponsor-detail-page ypl-flex authenticated">
    <van-nav-bar
        left-text="返回"
        left-arrow
        @click-left="onClickLeft"
    />
    <div data-v-75563610="" id="sponsorDetailPageContent" class="sponsor-detail-page-content flex">
      <div data-v-75563610="" class="sponsor-detail-page-inner"
           style="transition-timing-function: cubic-bezier(0.165, 0.84, 0.44, 1); transition-duration: 0ms; transform: translate(0px, 0px) scale(1) translateZ(0px);">
        <section data-v-75563610="" class="sponsor-detail-page-top-banner">
          <div data-v-75563610="" class="sponsor-card">
            <div data-v-75563610="" class="sponsor-card-avatar"><img data-v-75563610="" width="100%"
                                                                     src="../assets/WechatIMG35.png"
                                                                     lazy="loaded">
              <div data-v-75563610="" class="sponsor-badge"></div>
            </div> <!----> <p data-v-75563610="" class="f-md text-center letterSpace1 sponsor-name p-l-lg p-r-lg">
            NIKE</p>
            <p data-v-75563610="" class="f-xs text-muted letterSpace1 sponsor-desc"></p>
            <div data-v-75563610="" class="sponsor-card-statics">
              <div data-v-75563610="" class="sponsor-card-statics-item"><i data-v-75563610=""
                                                                           class="iconfont icon-follower"></i> <span
                  data-v-75563610="" class="text-info">8</span> 关注人数
              </div>
              <div data-v-75563610="" class="sponsor-card-statics-item"><i data-v-75563610=""
                                                                           class="iconfont icon-schedule"></i> <span
                  data-v-75563610="" class="text-info">5折</span> 折扣力度
              </div>
              <div data-v-75563610="" class="sponsor-card-statics-item"><i data-v-75563610=""
                                                                           class="iconfont icon-users"></i> <span
                  data-v-75563610="" class="text-info">4.5</span> 店铺评分
              </div>
            </div>
          </div>
        </section>
        <div data-v-75563610="" class="top-banner-bg"></div>
        <section data-v-75563610="" class="public-activity">
          <div data-v-75563610="" class="flex-row titleLine"><p data-v-75563610="" class="f-lg title">Ta的推广活动</p>
            <div data-v-75563610="" class="flex1"></div>
            <!--<div data-v-75563610="" class="consult flex-row"><img data-v-75563610=""-->
                                                                  <!--src="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4NCjxzdmcgd2lkdGg9IjI2cHgiIGhlaWdodD0iMjNweCIgdmlld0JveD0iMCAwIDI2IDIzIiB2ZXJzaW9uPSIxLjEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgeG1sbnM6eGxpbms9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsiPg0KICAgIDwhLS0gR2VuZXJhdG9yOiBTa2V0Y2ggNTIuNSAoNjc0NjkpIC0gaHR0cDovL3d3dy5ib2hlbWlhbmNvZGluZy5jb20vc2tldGNoIC0tPg0KICAgIDx0aXRsZT5pY196eF9jb2xvclk8L3RpdGxlPg0KICAgIDxkZXNjPkNyZWF0ZWQgd2l0aCBTa2V0Y2guPC9kZXNjPg0KICAgIDxnIGlkPSJQYWdlLTEiIHN0cm9rZT0ibm9uZSIgc3Ryb2tlLXdpZHRoPSIxIiBmaWxsPSJub25lIiBmaWxsLXJ1bGU9ImV2ZW5vZGQiPg0KICAgICAgICA8ZyBpZD0i5rS75Yqo5pWw5o2uLeiBlOe7nOaWueW8jy1jb3B5IiB0cmFuc2Zvcm09InRyYW5zbGF0ZSgtMjk2LjAwMDAwMCwgLTM5Ny4wMDAwMDApIj4NCiAgICAgICAgICAgIDxnIGlkPSJCYXJzIiB0cmFuc2Zvcm09InRyYW5zbGF0ZSgwLjAwMDAwMCwgMi4wMDAwMDApIj4NCiAgICAgICAgICAgICAgICA8ZyBpZD0i5YiG57uELTMtY29weSIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoMC4wMDAwMDAsIDIxMC4wMDAwMDApIj4NCiAgICAgICAgICAgICAgICAgICAgPGcgaWQ9IuWIhue7hC0yIj4NCiAgICAgICAgICAgICAgICAgICAgICAgIDxnIGlkPSJpY196eF9jb2xvclkiIHRyYW5zZm9ybT0idHJhbnNsYXRlKDI5Ni4wMDAwMDAsIDE4NS4wMDAwMDApIj4NCiAgICAgICAgICAgICAgICAgICAgICAgICAgICA8cmVjdCBpZD0i55+p5b2iIiBzdHJva2U9IiNDQUEyNjQiIGZpbGwtcnVsZT0ibm9uemVybyIgeD0iMC41IiB5PSIwLjUiIHdpZHRoPSIyNSIgaGVpZ2h0PSIyMiIgcng9IjIiPjwvcmVjdD4NCiAgICAgICAgICAgICAgICAgICAgICAgICAgICA8ZyBpZD0iemFpeGlhbmtlZnUiIHRyYW5zZm9ybT0idHJhbnNsYXRlKDUuMDAwMDAwLCA0LjAwMDAwMCkiIGZpbGw9IiNDQUEyNjQiIGZpbGwtcnVsZT0ibm9uemVybyI+DQogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIDxwYXRoIGQ9Ik00LjQ0NTk4Njk4LDcuNTI0NTExOTMgQzQuNDQ1OTg2OTgsNi45ODU0NjI5IDQuNzcwNzAyMjksNi40OTk0OTIxMSA1LjI2ODcxODY1LDYuMjkzMjA2OTcgQzUuNzY2NzM1MDIsNi4wODY5MjE4NCA2LjMzOTk3NjY1LDYuMjAwOTQ2NjkgNi43MjExNDE4OCw2LjU4MjExMTkyIEM3LjEwMjMwNzEsNi45NjMyNzcxNCA3LjIxNjMzMTk1LDcuNTM2NTE4NzggNy4wMTAwNDY4Miw4LjAzNDUzNTE0IEM2LjgwMzc2MTY5LDguNTMyNTUxNTEgNi4zMTc3OTA5LDguODU3MjY2ODEgNS43Nzg3NDE4Nyw4Ljg1NzI2NjgxIEM1LjA0MjY4MTY3LDguODU3MjY2ODEgNC40NDU5ODY5OCw4LjI2MDU3MjEzIDQuNDQ1OTg2OTgsNy41MjQ1MTE5MyBaIE0xNC42NjM3NzQ0LDkuNzQ1NzcwMDcgQzEzLjkyNzcxNDIsOS43NDU3NzAwNyAxMy4zMzEwMTk1LDkuMTQ5MDc1MzggMTMuMzMxMDE5NSw4LjQxMzAxNTE4IEwxMy4zMzEwMTk1LDcuMDgwMjYwMyBDMTMuMzMxMDE5NSw0LjEzNjAxOTUyIDEwLjk0NDI0MDgsMS43NDkyNDA3OCA4LDEuNzQ5MjQwNzggQzUuMDU1NzU5MjIsMS43NDkyNDA3OCAyLjY2ODk4MDQ4LDQuMTM2MDE5NTIgMi42Njg5ODA0OCw3LjA4MDI2MDMgQzIuNjY4OTgwNDgsMTAuMDI0NTAxMSA1LjA1NTc1OTIyLDEyLjQxMTI3OTggOCwxMi40MTEyNzk4IEw4Ljg4ODUwMzI1LDEyLjQxMTI3OTggQzkuMzc5MjEwMDUsMTIuNDExMjc5OCA5Ljc3NzAwNjUxLDEyLjgwOTA3NjMgOS43NzcwMDY1MSwxMy4yOTk3ODMxIEM5Ljc3NzAwNjUxLDEzLjc5MDQ4OTkgOS4zNzkyMTAwNSwxNC4xODgyODYzIDguODg4NTAzMjUsMTQuMTg4Mjg2MyBMOCwxNC4xODgyODYzIEM1LjEwMjM0NjIsMTQuMTg5NjYzMSAyLjQ5MzkyNTgzLDEyLjQzMTk2NzUgMS40MDczMDU4Niw5Ljc0NTc3MDA3IEwxLjMzNjIyNTYsOS43NDU3NzAwNyBDMC42MDAxNjU0MDEsOS43NDU3NzAwNyAwLjAwMzQ3MDcxNTg0LDkuMTQ5MDc1MzggMC4wMDM0NzA3MTU4NCw4LjQxMzAxNTE4IEwwLjAwMzQ3MDcxNTg0LDYuNjM2MDA4NjggQzAuMDA4Njk4NTA4NTEsNS45OTI3MDc2NCAwLjQ3ODU5MDAyOSw1LjQ0NzYzMzQ4IDEuMTE0MDk5NzgsNS4zNDc2Nzg5NiBDMS45MTkzODU0NCwyLjIwMjUyODc5IDQuNzUzMzkzMzgsMC4wMDI3MjE5MTQ4OCA4LDAuMDAyNzIxOTE0ODggQzExLjI0NjYwNjYsMC4wMDI3MjE5MTQ4OCAxNC4wODA2MTQ2LDIuMjAyNTI4NzkgMTQuODg1OTAwMiw1LjM0NzY3ODk2IEMxNS41MjE0MSw1LjQ0NzYzMzQ4IDE1Ljk5MTMwMTUsNS45OTI3MDc2NCAxNS45OTY1MjkzLDYuNjM2MDA4NjggTDE1Ljk5NjUyOTMsOC40MTMwMTUxOCBDMTUuOTk2NTI5Myw5LjE0OTA3NTM4IDE1LjM5OTgzNDYsOS43NDU3NzAwNyAxNC42NjM3NzQ0LDkuNzQ1NzcwMDcgWiBNOC44ODg1MDMyNSw3LjUyNDUxMTkzIEM4Ljg4ODUwMzI1LDYuOTg1NDYyOSA5LjIxMzIxODU2LDYuNDk5NDkyMTEgOS43MTEyMzQ5Miw2LjI5MzIwNjk3IEMxMC4yMDkyNTEzLDYuMDg2OTIxODQgMTAuNzgyNDkyOSw2LjIwMDk0NjY5IDExLjE2MzY1ODEsNi41ODIxMTE5MiBDMTEuNTQ0ODIzNCw2Ljk2MzI3NzE0IDExLjY1ODg0ODIsNy41MzY1MTg3OCAxMS40NTI1NjMxLDguMDM0NTM1MTQgQzExLjI0NjI3OCw4LjUzMjU1MTUxIDEwLjc2MDMwNzIsOC44NTcyNjY4MSAxMC4yMjEyNTgxLDguODU3MjY2ODEgQzkuNDg1MTk3OTQsOC44NTcyNjY4MSA4Ljg4ODUwMzI1LDguMjYwNTcyMTMgOC44ODg1MDMyNSw3LjUyNDUxMTkzIFoiIGlkPSLlvaLnirYiPjwvcGF0aD4NCiAgICAgICAgICAgICAgICAgICAgICAgICAgICA8L2c+DQogICAgICAgICAgICAgICAgICAgICAgICAgICAgPGcgaWQ9Im1uX3hpYW94aV9maWxsIiB0cmFuc2Zvcm09InRyYW5zbGF0ZSg1LjAwMDAwMCwgNC4wMDAwMDApIj48L2c+DQogICAgICAgICAgICAgICAgICAgICAgICAgICAgPGcgaWQ9IuW9oueKti0yIiB0cmFuc2Zvcm09InRyYW5zbGF0ZSg1LjAwMDAwMCwgNS4wMDAwMDApIj48L2c+DQogICAgICAgICAgICAgICAgICAgICAgICA8L2c+DQogICAgICAgICAgICAgICAgICAgIDwvZz4NCiAgICAgICAgICAgICAgICA8L2c+DQogICAgICAgICAgICA8L2c+DQogICAgICAgIDwvZz4NCiAgICA8L2c+DQo8L3N2Zz4="-->
                                                                  <!--alt=""></div>-->
            <div data-v-75563610="" class="follow-btn flex-row"><img data-v-75563610=""
                                                                     src="../assets/WechatIMG35.png"
                                                                     alt="">
              <p data-v-75563610="">联系TA</p></div>
            <div data-v-75563610="" class="follow-btn"><i data-v-75563610="" class="iconfont icon-plus f-sm"></i>关注
            </div>
          </div>
          <div data-v-75563610="" class="scroll-load-more-container p-b-xxl">
            <ul data-v-75563610="" class="activity-list">
              <li data-v-75563610="" class="activity-list-item"><p data-v-75563610="" class="f-sm activity-title">最新运动春季男装促销活动</p>
                <p data-v-75563610="" class="text-muted f-xs activity-subTitle m-t-lg">2019-09-19 00:00:00开始 | 线上活动</p>
                <div data-v-75563610="" class="image-placeholder"><img data-v-75563610=""
                                                                       src="../assets/WechatIMG35.png"
                                                                       lazy="loaded"></div>
              </li>
              <li data-v-75563610="" class="activity-list-item"><p data-v-75563610="" class="f-sm activity-title">最新运动女装春季促销活动</p>
                <p data-v-75563610="" class="text-muted f-xs activity-subTitle m-t-lg">2019-09-19 00:00:00开始 | 线上活动</p>
                <div data-v-75563610="" class="image-placeholder"><img data-v-75563610=""
                                                                       src="../assets/WechatIMG35.png"
                                                                       lazy="loaded"></div>
              </li>
              <li data-v-75563610="" class="activity-list-item"><p data-v-75563610="" class="f-sm activity-title">最新运动春季童装促销活动</p>
                <p data-v-75563610="" class="text-muted f-xs activity-subTitle m-t-lg">2019-09-19 00:00:00开始 | 线上活动</p>
                <div data-v-75563610="" class="image-placeholder"><img data-v-75563610=""
                                                                       src="../assets/WechatIMG35.png"
                                                                       lazy="loaded"></div>
              </li>
              <li data-v-75563610="" class="activity-list-item"><p data-v-75563610="" class="f-sm activity-title">篮球鞋促销活动</p>
                <p data-v-75563610="" class="text-muted f-xs activity-subTitle m-t-lg">2019-09-19 00:00:00开始 | 线上活动</p>
                <div data-v-75563610="" class="image-placeholder"><img data-v-75563610=""
                                                                       src="../assets/WechatIMG35.png"
                                                                       lazy="loaded"></div>
              </li>
            </ul>
            <div style="display: none;"><img src="/static/images/loading-bubbles.svg" width="64" height="64"></div>
          </div> <!----></section>
      </div>
    </div> <!----></div>
</template>

<script>
    export default {
        name: "preference",
        methods: {
            onClickLeft(){}
        },
    }
</script>

<style scoped>
  body, html {
    width: 100%;
    height: 100%;
    font-family: PingFang-SC-Regular, \\5FAE\8F6F\96C5\9ED1, MicrosoftYaHei, Helvetica Neue, Helvetica, sans-serif !important;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    overflow-x: hidden;
    -webkit-overflow-scrolling: touch;
    color: #2e2e2e
  }

  body, html, li, ul {
    margin: 0;
    padding: 0
  }

  li, ul {
    list-style: none
  }

  a, article, aside, b, body, button, dd, div, dl, dt, figcaption, figure, footer, form, h1, h2, h3, h4, h5, h6, header, i, input, li, nav, p, section, select, span, textarea, ul {
    padding: 0;
    margin: 0;
    text-decoration: none;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    border: 0;
    -webkit-tap-highlight-color: transparent;
    -webkit-font-smoothing: antialiased;
    outline: none
  }

  a:hover, article:hover, aside:hover, b:hover, body:hover, button:hover, dd:hover, div:hover, dl:hover, dt:hover, figcaption:hover, figure:hover, footer:hover, form:hover, h1:hover, h2:hover, h3:hover, h4:hover, h5:hover, h6:hover, header:hover, i:hover, input:hover, li:hover, nav:hover, p:hover, section:hover, select:hover, span:hover, textarea:hover, ul:hover {
    outline: none
  }

  input, textarea {
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    line-height: normal
  }

  a, a:active, a:hover, a:link, a:visited {
    text-decoration: none
  }

  [type=password], [type=text], button, select, textarea {
    border: none
  }

  button {
    padding: 0
  }

  input, select {
    border: none;
    outline: none;
    line-height: normal
  }

  input::-webkit-input-placeholder, textarea::-webkit-input-placeholder {
    color: #6d768d
  }

  input:-moz-placeholder, input::-moz-placeholder, textarea:-moz-placeholder, textarea::-moz-placeholder {
    color: #6d768d
  }

  input:-ms-input-placeholder, textarea:-ms-input-placeholder {
    color: #6d768d
  }

  a, div, img {
    -webkit-tap-highlight-color: transparent;
    -webkit-touch-callout: none;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none
  }

  h1, h2, h3, p {
    -webkit-margin-before: 0;
    -webkit-margin-after: 0;
    -webkit-padding-before: 0;
    -webkit-padding-after: 0
  }

  img {
    vertical-align: top
  }

  .f-b {
    font-weight: 700
  }

  .f-xx {
    font-size: .05rem
  }

  .f-xs {
    font-size: .24rem
  }

  .f-sm {
    font-size: .26rem
  }

  .f-md {
    font-size: .28rem
  }

  .f-lg {
    font-size: .32rem
  }

  .f-xl {
    font-size: .34rem
  }

  .f-0 {
    font-size: 0
  }

  .p-0 {
    padding: 0
  }

  .m-t-xs {
    margin-top: .05rem
  }

  .m-t-sm {
    margin-top: .1rem
  }

  .m-t-md {
    margin-top: .15rem
  }

  .m-t-lg {
    margin-top: .2rem
  }

  .m-t-xl {
    margin-top: .3rem !important
  }

  .m-t-xxl {
    margin-top: .4rem
  }

  .m-t-xxxl {
    margin-top: .5rem
  }

  .m-r-xs {
    margin-right: .05rem
  }

  .m-r-sm {
    margin-right: .1rem
  }

  .m-r-md {
    margin-right: .15rem
  }

  .m-r-lg {
    margin-right: .2rem
  }

  .m-r-xl {
    margin-right: .3rem
  }

  .m-r-xxl {
    margin-right: .4rem
  }

  .m-r-xxxl {
    margin-right: .5rem
  }

  .m-l-xs {
    margin-left: .05rem
  }

  .m-l-sm {
    margin-left: .1rem
  }

  .m-l-md {
    margin-left: .15rem
  }

  .m-l-lg {
    margin-left: .2rem
  }

  .m-l-xl {
    margin-left: .3rem
  }

  .m-l-xxl {
    margin-left: .4rem
  }

  .m-l-xxxl {
    margin-left: .5rem
  }

  .m-b-xs {
    margin-bottom: .05rem
  }

  .m-b-sm {
    margin-bottom: .1rem
  }

  .m-b-md {
    margin-bottom: .15rem
  }

  .m-b-lg {
    margin-bottom: .2rem
  }

  .m-b-xl {
    margin-bottom: .3rem
  }

  .m-b-xxl {
    margin-bottom: .4rem
  }

  .m-b-xxxl {
    margin-bottom: .5rem
  }

  .p-t-xs {
    padding-top: .05rem
  }

  .p-t-sm {
    padding-top: .1rem
  }

  .p-t-md {
    padding-top: .15rem
  }

  .p-t-lg {
    padding-top: .2rem
  }

  .p-t-xl {
    padding-top: .3rem
  }

  .p-t-xxl {
    padding-top: .4rem
  }

  .p-t-xxxl {
    padding-top: .5rem
  }

  .p-r-xs {
    padding-right: .05rem
  }

  .p-r-sm {
    padding-right: .1rem
  }

  .p-r-md {
    padding-right: .15rem
  }

  .p-r-lg {
    padding-right: .2rem
  }

  .p-r-xl {
    padding-right: .3rem
  }

  .p-r-xxl {
    padding-right: .4rem
  }

  .p-r-xxxl {
    padding-right: .5rem
  }

  .p-l-xs {
    padding-left: .05rem
  }

  .p-l-sm {
    padding-left: .1rem
  }

  .p-l-md {
    padding-left: .15rem
  }

  .p-l-lg {
    padding-left: .2rem
  }

  .p-l-xl {
    padding-left: .3rem
  }

  .p-l-xxl {
    padding-left: .4rem
  }

  .p-l-xxxl {
    padding-left: .5rem
  }

  .p-b-xs {
    padding-bottom: .05rem
  }

  .p-b-sm {
    padding-bottom: .1rem
  }

  .p-b-md {
    padding-bottom: .15rem
  }

  .p-b-lg {
    padding-bottom: .2rem
  }

  .p-b-xl {
    padding-bottom: .3rem
  }

  .p-b-xxl {
    padding-bottom: .4rem
  }

  .p-b-xxxl {
    padding-bottom: .5rem
  }

  .text-muted {
    color: #aaa
  }

  .text-primary {
    color: #333
  }

  .text-success {
    color: #3c763d
  }

  .text-info {
    color: #1fa2ff
  }

  .text-warning {
    color: #8a6d3b
  }

  .text-danger {
    color: #a94442
  }

  .text-white {
    color: #fff
  }

  .pull-right {
    float: right
  }

  .pull-left {
    float: left
  }

  .scroll-y {
    height: 100%;
    overflow-y: scroll
  }

  .w-full {
    width: 100%
  }

  .h-full {
    height: 100%
  }

  .overflowHidden {
    overflow: hidden
  }

  .bg-white {
    background-color: #fff
  }

  .list-unstyle {
    list-style: none
  }

  .mint-cell-text {
    vertical-align: baseline
  }

  .text-black {
    color: #2e2e2e
  }

  .text-green {
    color: #50e3c2
  }

  .text-cyan {
    color: #05cedc
  }

  .text-yellow {
    color: #ff7200
  }

  .text-red {
    color: #ff7c7c
  }

  .text-purple {
    color: #9c86ff
  }

  .text-light-purple {
    color: #86a4ff
  }

  .text-center {
    text-align: center
  }

  .text-left {
    text-align: left
  }

  .text-right {
    text-align: right
  }

  .red-dot {
    position: relative
  }

  .red-dot:after {
    content: "";
    width: 4px;
    height: 4px;
    background-color: red;
    border-radius: 50%;
    right: 0;
    top: 0;
    position: absolute
  }

  .mint-cell-value {
    border: none
  }

  .letterSpace1 {
    letter-spacing: 1px
  }

  .header-top-search {
    padding: 0 .2rem;
    background-color: #fff;
    width: 100%;
    display: inline-block;
    border-radius: .46rem;
    font-weight: 400;
    font-size: .24rem;
    letter-spacing: 1px;
    line-height: .46rem
  }

  .image-placeholder img {
    border-radius: 3px
  }

  .mint-button:after {
    background: transparent
  }

  .mint-header {
    width: 100%;
    background-color: #fff;
    color: #000;
    height: .9rem;
    position: relative
  }

  .mint-header:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .mint-header:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .mint-header:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .mint-header .mint-header-button {
    -webkit-box-flex: 0;
    -ms-flex: none;
    flex: none
  }

  .mint-header .mint-header-button.is-left {
    padding-right: .15rem
  }

  .mint-header .mint-header-button .current-city-name {
    width: .7rem;
    display: inline-block;
    text-align: center
  }

  .mint-header .mint-header-button.is-right {
    width: .96rem
  }

  .mint-header .mint-header-button.is-right .mint-button {
    margin-right: .2rem
  }

  .mint-header .mint-header-title {
    font-size: .32rem
  }

  .mint-header .mint-button-icon {
    vertical-align: baseline
  }

  .mint-cell-wrapper {
    padding: 0
  }

  .footer-wrapper {
    position: relative;
    height: .9rem
  }

  @media only screen and (device-width: 375px) and (device-height: 812px) and (-webkit-device-pixel-ratio: 3) {
    .footer-wrapper {
      height: .98rem
    }
  }

  @media only screen and (device-width: 414px) and (device-height: 896px) and (-webkit-device-pixel-ratio: 2) {
    .footer-wrapper {
      height: .98rem
    }
  }

  @media only screen and (device-width: 414px) and (device-height: 896px) and (-webkit-device-pixel-ratio: 3) {
    .footer-wrapper {
      height: .98rem
    }
  }

  .ypl-page-wrapper {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0
  }

  .ypl-flex {
    display: flex;
    display: -webkit-box;
    display: -ms-flexbox;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -ms-flex-direction: column;
    flex-direction: column;
    overflow: hidden;
    height: 100%
  }

  .ypl-flex .flex {
    -ms-flex: 1;
    flex: 1;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    position: relative;
    overflow: auto;
    -webkit-overflow-scrolling: touch
  }

  .flex-col, .flex-row {
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex
  }

  .flex-col {
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -ms-flex-direction: column;
    flex-direction: column
  }

  .flex1 {
    -webkit-box-flex: 1;
    -ms-flex: 1;
    flex: 1
  }

  .flex2 {
    -webkit-box-flex: 2;
    -ms-flex: 2;
    flex: 2
  }

  .flex3 {
    -webkit-box-flex: 3;
    -ms-flex: 3;
    flex: 3
  }

  .flex4 {
    -webkit-box-flex: 4;
    -ms-flex: 4;
    flex: 4
  }

  .noData {
    text-align: center;
    padding-top: 1.5rem
  }

  .noData img {
    width: 2.3rem;
    height: 3.3rem
  }

  .noData p {
    color: #397cca;
    font-size: .26rem;
    margin-top: .24rem
  }

  .noData-img {
    align-items: center;
    justify-content: center;
    margin-top: 2rem
  }

  .noData-img img {
    width: 3.04rem;
    height: 2.52rem
  }

  .noData-img p {
    color: #397cca;
    font-size: .26rem;
    margin-top: .4rem
  }

  .oneLine {
    white-space: nowrap
  }

  .oneLine, .twoLine {
    overflow: hidden;
    text-overflow: ellipsis
  }

  .twoLine {
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical
  }

  ::-webkit-scrollbar {
    display: none
  }

  .clearFloat:after {
    content: ".";
    display: block;
    height: 0;
    clear: both;
    visibility: hidden
  }

  .clearMarginTop:before {
    content: "";
    display: table
  }

  .textellipsis {
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  input[type=button], input[type=reset], input[type=search], input[type=submit] {
    -webkit-appearance: none;
    outline: none;
    border: none
  }

  .mint-msgbox-message {
    color: #2e2e2e;
    font-size: .28rem;
    line-height: .4rem
  }

  .MeetingSignUpInfoPage {
    background: #f6f6f6;
    padding-bottom: 1rem
  }

  .MeetingSignUpInfoPage .errorMsg {
    opacity: .8;
    width: 100%;
    color: #fff;
    padding: .1rem;
    font-size: .28rem;
    line-height: .4rem;
    text-align: center;
    background: #ef4f4f
  }

  .MeetingSignUpInfoPage .btnSubmit {
    width: 80%;
    height: .9rem;
    line-height: .9rem;
    margin: 1rem 10%;
    color: #fff;
    font-size: .36rem;
    text-align: center;
    background: #3498db;
    border-radius: .08rem
  }

  .MeetingSignUpInfoPage .downloadApp {
    bottom: 0;
    width: 100%;
    z-index: 100;
    position: fixed
  }

  .MeetingSignUpInfoPage .list {
    padding: .5rem .3rem;
    background: #fff
  }

  .MeetingSignUpInfoPage .list .item {
    font-size: .28rem
  }

  .MeetingSignUpInfoPage .list .item .cell {
    margin: .3rem 0
  }

  .MeetingSignUpInfoPage .list .item .cell input {
    line-height: .3rem
  }

  .MeetingSignUpInfoPage .list .item .cell input, .MeetingSignUpInfoPage .list .item .cell textarea {
    width: 100%;
    font-size: .28rem;
    padding: .3rem .15rem;
    margin-top: .3rem;
    border-radius: .08rem;
    border: 1px solid #ddd
  }

  .MeetingSignUpInfoPage .list .item .cell textarea {
    height: 2rem;
    line-height: .36rem
  }

  .MeetingSignUpInfoPage .list .item .cell .radio {
    padding: .2rem 0
  }

  .MeetingSignUpInfoPage .list .item .cell .radio img {
    width: .34rem;
    height: .34rem
  }

  .MeetingSignUpInfoPage .list .item .cell .radio p {
    line-height: .34rem;
    margin-left: .3rem
  }

  .activityList-item {
    overflow: hidden;
    background: #fff;
    margin-bottom: .2rem;
    padding: .15rem .25rem
  }

  .activityList-item-hd {
    padding-left: 2.9rem;
    position: relative;
    font-size: 0;
    height: 1.44rem
  }

  .activityList-item-hd .text-muted-money {
    color: red;
    display: inline-block;
    margin-top: .4rem
  }

  .activityList-item-hd .text-muted-status {
    color: #ababab;
    position: absolute;
    right: 0;
    margin-top: .4rem
  }

  .activityList-item-hd .red {
    color: #fb403d
  }

  .activityList-item-hd .activity-title {
    padding-top: .05rem;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .activityList-item-hd .image-placeholder {
    position: absolute;
    left: 0;
    top: 0;
    width: 2.54rem;
    height: 1.44rem
  }

  .activityList-item .bottomLine {
    height: .36rem;
    line-height: .36rem;
    justify-content: space-between;
    -webkit-justify-content: space-between
  }

  .activityList-item .bottomLine img {
    width: .32rem;
    height: .32rem;
    margin-right: .1rem;
    align-self: center;
    -webkit-align-self: center
  }

  .voteList-item {
    padding: .15rem .25rem;
    margin-bottom: .2rem;
    background: #fff
  }

  .voteList-item img {
    width: 2.54rem;
    height: 1.44rem;
    margin-right: .3rem
  }

  .voteList-item .twoLine {
    line-height: .28rem;
    max-height: .84rem;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .crowdList-item {
    background: #fff;
    padding: .15rem .25rem;
    margin-bottom: .2rem
  }

  .crowdList-item img {
    width: 2.53rem;
    height: 1.44rem
  }

  .crowdList-item .progress-bar {
    height: .4rem;
    display: table
  }

  .crowdList-item .progress-bar .progress-bar-graph {
    width: 3.2rem;
    padding-right: .2rem
  }

  .crowdList-item .progress-bar .progress-bar-graph, .crowdList-item .progress-bar .progress-bar-percent {
    display: table-cell;
    vertical-align: middle
  }

  .crowdList-item .progress-bar .progress-bar-percent {
    color: #ff4800
  }

  .crowdList-item .progress-bar .mt-progress-runway {
    background-color: #ededed;
    border-radius: 6px
  }

  .crowdList-item .progress-bar .mt-progress-progress {
    background: linear-gradient(-90deg, red, #ff9300);
    border-radius: 6px
  }

  .sponsorList-item {
    background: #fff
  }

  .sponsorList-item .upside {
    padding: .2rem .3rem;
    position: relative
  }

  .sponsorList-item .upside:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #eee;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .sponsorList-item .upside:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .sponsorList-item .upside:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .sponsorList-item .upside .avatar {
    width: .9rem;
    height: .9rem;
    border-radius: 100%
  }

  .sponsorList-item .upside .vip {
    width: .32rem;
    height: .32rem;
    position: absolute;
    right: -.05rem;
    bottom: .1rem
  }

  .sponsorList-item .upside .sponsorInfo {
    width: 0;
    margin-left: .3rem;
    justify-content: center;
    -webkit-justify-content: center
  }

  .sponsorList-item .upside .sponsorInfo .name {
    color: #2e2e2e;
    font-size: .28rem;
    width: 80%
  }

  .sponsorList-item .upside .sponsorInfo .intro, .sponsorList-item .upside .sponsorInfo .name {
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .sponsorList-item .upside .sponsorInfo .intro {
    color: #ababab;
    font-size: .24rem;
    margin-top: .15rem;
    width: null
  }

  .sponsorList-item .belowSide {
    height: .9rem;
    line-height: .9rem;
    padding: 0 .3rem;
    font-size: .24rem;
    margin-bottom: .2rem
  }

  .sponsorList-item .belowSide .icon {
    font-size: .3rem;
    align-self: center;
    margin-right: .2rem
  }

  .sponsorList-item .belowSide .number {
    color: #1fa2ff;
    margin-left: .1rem
  }

  .sponsorList-item .belowSide .btns {
    justify-content: flex-end;
    -webkit-justify-content: flex-end;
    align-items: center;
    -webkit-align-items: center
  }

  .sponsorList-item .belowSide .btns .btn-attention {
    color: #1fa2ff;
    padding: .05rem .15rem;
    background: #fff;
    position: relative
  }

  .sponsorList-item .belowSide .btns .btn-attention:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border: 1px solid #1fa2ff;
    border-radius: .15rem;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .sponsorList-item .belowSide .btns .btn-attention:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .sponsorList-item .belowSide .btns .btn-attention:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .sponsorList-item .belowSide .btns .attentioned {
    color: #fff;
    background: #1fa2ff
  }

  .main-app {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    background: #f6f6f6
  }

  .fade-enter-active, .fade-leave-active {
    transition: opacity .2s
  }

  .fade-enter, .fade-leave-to {
    opacity: 0
  }

  .unClick[data-v-0bead4d6] {
    font-size: .28rem;
    color: #1fa2ff
  }

  .clicked[data-v-0bead4d6] {
    font-size: .28rem;
    color: #7b7f8a
  }

  .page-login[data-v-3018603f] {
    height: 100%;
    padding: .8rem;
    background: #fff
  }

  .page-login .logo[data-v-3018603f] {
    width: 1rem;
    height: 1rem;
    color: #fff;
    display: flex;
    margin: auto;
    font-size: .36rem;
    line-height: 1rem;
    border-radius: .12rem;
    justify-content: center;
    background: linear-gradient(225deg, #00c8fe, #4facfe)
  }

  .page-login h5[data-v-3018603f] {
    color: #2b2b2b;
    font-weight: 400;
    font-size: .48rem;
    margin-top: .3rem
  }

  .page-login .line-input[data-v-3018603f] {
    height: 1.18rem;
    align-items: center;
    border-bottom: .01rem solid #dfdfe4
  }

  .page-login .line-input input[data-v-3018603f] {
    width: 0;
    color: #2e2e2e;
    font-size: .28rem
  }

  .page-login .line-input .clear[data-v-3018603f] {
    width: .6rem;
    height: .6rem;
    display: flex;
    align-items: center;
    justify-content: center
  }

  .page-login .line-input .clear img[data-v-3018603f] {
    width: .3rem;
    height: .3rem
  }

  .page-login .msg[data-v-3018603f] {
    color: #aaa;
    font-size: .24rem;
    margin-top: .2rem
  }

  .page-login .msg-error[data-v-3018603f] {
    color: #fd545b;
    font-size: .24rem;
    margin-top: .2rem
  }

  .page-login .btn-login[data-v-3018603f] {
    width: 100%;
    height: .88rem;
    color: #959595;
    font-size: .32rem;
    margin-top: .46rem;
    background: #ebebeb;
    border-radius: .08rem
  }

  .page-login .canLogin[data-v-3018603f] {
    color: #fff;
    background: linear-gradient(225deg, #00c8fe, #4facfe)
  }

  .page-login .btn-login-pwd[data-v-3018603f] {
    height: .5rem;
    display: flex;
    color: #666;
    padding: 0 .5rem;
    font-size: .32rem;
    margin: .6rem auto;
    background: #fff
  }

  .page-login .protocol[data-v-3018603f] {
    display: flex;
    color: #aaa;
    font-size: .24rem;
    justify-content: center
  }

  .page-login .protocol span[data-v-3018603f] {
    color: #1fa2ff
  }

  .page-login-pwd[data-v-f6c5f666] {
    height: 100%;
    padding: .8rem;
    background: #fff
  }

  .page-login-pwd .logo[data-v-f6c5f666] {
    width: 1rem;
    height: 1rem;
    color: #fff;
    display: flex;
    margin: auto;
    font-size: .36rem;
    line-height: 1rem;
    border-radius: .12rem;
    justify-content: center;
    background: linear-gradient(225deg, #00c8fe, #4facfe)
  }

  .page-login-pwd h5[data-v-f6c5f666] {
    color: #2b2b2b;
    font-weight: 400;
    font-size: .48rem;
    margin-top: .3rem;
    margin-bottom: .76rem
  }

  .page-login-pwd .line-input[data-v-f6c5f666] {
    height: 1.18rem;
    align-items: center;
    border-bottom: .01rem solid #dfdfe4
  }

  .page-login-pwd .line-input input[data-v-f6c5f666] {
    width: 0;
    color: #2e2e2e;
    font-size: .28rem
  }

  .page-login-pwd .line-input .clear[data-v-f6c5f666] {
    width: .6rem;
    height: .6rem;
    display: flex;
    align-items: center;
    justify-content: center
  }

  .page-login-pwd .line-input .clear img[data-v-f6c5f666] {
    width: .3rem;
    height: .3rem
  }

  .page-login-pwd .msg[data-v-f6c5f666] {
    color: #aaa;
    font-size: .24rem;
    margin-top: .2rem
  }

  .page-login-pwd .msg-error[data-v-f6c5f666] {
    color: #fd545b;
    font-size: .24rem;
    margin-top: .2rem;
    margin-right: .3rem
  }

  .page-login-pwd .btn-login[data-v-f6c5f666] {
    width: 100%;
    height: .88rem;
    color: #959595;
    font-size: .32rem;
    margin-top: .46rem;
    background: #ebebeb;
    border-radius: .08rem
  }

  .page-login-pwd .canLogin[data-v-f6c5f666] {
    color: #fff;
    background: linear-gradient(225deg, #00c8fe, #4facfe)
  }

  .page-login-pwd .btn-login-pwd[data-v-f6c5f666] {
    height: .5rem;
    display: flex;
    color: #666;
    padding: 0 .5rem;
    font-size: .32rem;
    margin: .6rem auto;
    background: #fff
  }

  .page-login-pwd .protocol[data-v-f6c5f666] {
    display: flex;
    color: #aaa;
    font-size: .24rem;
    justify-content: center
  }

  .page-login-pwd .protocol span[data-v-f6c5f666] {
    color: #1fa2ff
  }

  .page-pwd-forgot[data-v-2b53cad9] {
    height: 100%;
    padding: .8rem;
    background: #fff
  }

  .page-pwd-forgot .logo[data-v-2b53cad9] {
    width: 1rem;
    height: 1rem;
    color: #fff;
    display: flex;
    margin: auto;
    font-size: .36rem;
    line-height: 1rem;
    border-radius: .12rem;
    justify-content: center;
    background: linear-gradient(225deg, #00c8fe, #4facfe)
  }

  .page-pwd-forgot h5[data-v-2b53cad9] {
    color: #2b2b2b;
    font-weight: 400;
    font-size: .48rem;
    margin-top: .3rem;
    margin-bottom: .76rem
  }

  .page-pwd-forgot .line-input[data-v-2b53cad9] {
    height: 1.18rem;
    align-items: center;
    border-bottom: .01rem solid #dfdfe4
  }

  .page-pwd-forgot .line-input input[data-v-2b53cad9] {
    width: 0;
    color: #2e2e2e;
    font-size: .28rem
  }

  .page-pwd-forgot .line-input .clear[data-v-2b53cad9] {
    width: .6rem;
    height: .6rem;
    display: flex;
    align-items: center;
    justify-content: center
  }

  .page-pwd-forgot .line-input .clear img[data-v-2b53cad9] {
    width: .3rem;
    height: .3rem
  }

  .page-pwd-forgot .msg-error[data-v-2b53cad9] {
    color: #fd545b;
    font-size: .24rem;
    margin-top: .2rem
  }

  .page-pwd-forgot .btn-login[data-v-2b53cad9] {
    width: 100%;
    height: .88rem;
    color: #959595;
    font-size: .32rem;
    margin-top: .46rem;
    background: #ebebeb;
    border-radius: .08rem
  }

  .page-pwd-forgot .canLogin[data-v-2b53cad9] {
    color: #fff;
    background: linear-gradient(225deg, #00c8fe, #4facfe)
  }

  .agreement-user .content[data-v-1e6d71a5] {
    color: #444;
    padding: .2rem;
    font-size: .28rem;
    line-height: .4rem;
    text-indent: .56rem
  }

  .agreement-user .content h5[data-v-1e6d71a5] {
    text-indent: 0;
    font-size: .32rem;
    margin-top: .3rem
  }

  .agreement-user .content strong[data-v-1e6d71a5] {
    display: block;
    font-weight: 700
  }

  .agreement-user .content .secondContent[data-v-1e6d71a5] {
    color: #7a7a7a;
    text-indent: 0;
    font-size: .24rem;
    line-height: .3rem
  }

  .footer-wrapper .mint-tabbar {
    box-shadow: 0 -1px 15px 1px rgba(0, 0, 0, .07);
    background-image: none;
    background-color: #fff
  }

  .footer-wrapper .mint-tabbar .mint-tab-item-icon {
    margin: 0 auto;
    width: .48rem;
    height: .48rem;
    line-height: .48rem
  }

  .footer-wrapper .mint-tabbar .mint-tab-item-icon .iconfont {
    line-height: .48rem
  }

  .footer-wrapper .mint-tabbar > .mint-tab-item {
    padding: .1rem 0 .15rem
  }

  .footer-wrapper .mint-tabbar > .mint-tab-item.is-selected {
    background-color: transparent;
    color: #1fa2ff
  }

  .scroll-wrap[data-v-e939c95a] {
    width: 3.84rem;
    height: .5rem;
    display: inline-block;
    overflow: hidden
  }

  .scroll-wrap .animate[data-v-e939c95a] {
    transition: top .5s
  }

  .scroll-wrap .scroll-content[data-v-e939c95a] {
    padding: 0;
    margin: 0;
    position: relative;
    font-size: .26rem
  }

  .scroll-wrap .scroll-content li[data-v-e939c95a] {
    line-height: .5rem;
    text-align: center;
    height: .5rem
  }

  .scroll-wrap .scroll-content li a[data-v-e939c95a] {
    color: #2e2e2e
  }

  #recommend-page-container[data-v-d079551c] {
    position: relative;
    height: 100%;
    overflow: hidden
  }

  .ypl-banner[data-v-d079551c] {
    height: 3.66rem
  }

  .ypl-banner .mint-swipe-indicators[data-v-d079551c] {
    right: .2rem;
    bottom: 0;
    transform: none;
    left: auto
  }

  .ypl-banner .mint-swipe-indicator[data-v-d079551c] {
    opacity: .4;
    width: .16rem;
    height: .16rem;
    border-radius: 50%
  }

  .ypl-banner .mint-swipe-indicator.is-active[data-v-d079551c] {
    background: linear-gradient(180deg, #42cfff, #1fa2ff);
    opacity: 1
  }

  .headline-container[data-v-d079551c] {
    padding: .3rem;
    width: 100%;
    font-size: .24rem
  }

  .headline-container img[data-v-d079551c] {
    width: 1.94rem;
    height: .3rem;
    vertical-align: super;
    margin-right: .2rem
  }

  .headline-container a[data-v-d079551c] {
    color: #333;
    display: inline-block;
    width: 3.84rem;
    vertical-align: middle;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .headline-container .view-more-btn[data-v-d079551c] {
    display: inline-block;
    border-left: 1px solid #333;
    padding-left: .2rem;
    margin-left: .05rem;
    vertical-align: super
  }

  .index-block-header[data-v-d079551c] {
    height: .3rem;
    line-height: .3rem;
    position: relative
  }

  .index-block-icon[data-v-d079551c] {
    width: .34rem;
    height: .44rem;
    vertical-align: middle
  }

  .index-block-title[data-v-d079551c] {
    font-size: .34rem;
    font-weight: 700;
    vertical-align: middle;
    margin-left: .1rem
  }

  .index-block .refresh-content[data-v-d079551c] {
    font-size: .24rem;
    color: #aaa;
    float: right
  }

  .index-block .refresh-content[data-v-d079551c]:active {
    color: #1fa2ff
  }

  .index-block .filter-layer[data-v-d079551c] {
    font-size: .28rem;
    width: 2rem;
    background-color: #1fa2ff;
    position: absolute;
    top: -1.1rem;
    right: 1rem;
    z-index: 2222;
    text-align: center;
    color: #fff
  }

  .index-block .filter-layer[data-v-d079551c]:before {
    display: inline-block;
    width: 0;
    height: 0;
    border: solid transparent;
    border-width: .2rem .2rem .3rem;
    border-bottom-color: #1fa2ff;
    content: "";
    position: absolute;
    top: 1rem;
    right: -.4rem;
    transform: rotate(90deg)
  }

  .index-block .filter-layer li[data-v-d079551c] {
    height: .85rem;
    line-height: .85rem;
    position: relative
  }

  .index-block .filter-layer li.selected span[data-v-d079551c] {
    position: relative;
    display: inline-block;
    line-height: .34rem
  }

  .index-block .filter-layer li.selected span[data-v-d079551c]:after {
    content: "";
    position: absolute;
    bottom: -.14rem;
    width: .26rem;
    left: 50%;
    margin-left: -.13rem;
    border: 1px solid #fff;
    border-radius: 2px
  }

  .index-block .filter-layer li.selected span[data-v-d079551c]:active {
    opacity: .8
  }

  .index-block .filter-layer li[data-v-d079551c]:not(:last-child):after {
    content: "";
    position: absolute;
    bottom: 0;
    border: .01rem solid #4ab4ff;
    width: 1.6rem;
    left: .2rem
  }

  .strongly-recommend-container[data-v-d079551c] {
    padding: 0 .3rem .3rem
  }

  .strongly-recommend-container .refresh-content[data-v-d079551c] {
    font-size: .24rem;
    color: #aaa;
    float: right
  }

  .strongly-recommend-container .recommend-list[data-v-d079551c] {
    margin-top: .3rem
  }

  .strongly-recommend-container .recommend-list ul[data-v-d079551c] {
    width: 17.5rem
  }

  .strongly-recommend-container .recommend-list-item[data-v-d079551c] {
    display: inline-block;
    width: 3.28rem
  }

  .strongly-recommend-container .recommend-list-item[data-v-d079551c]:not(:last-child) {
    padding-right: .2rem
  }

  .strongly-recommend-container .recommend-list-item .image-placeholder[data-v-d079551c] {
    background-color: #aaa;
    width: 100%;
    height: 1.84rem;
    border-radius: 3px
  }

  .strongly-recommend-container .recommend-list-item .image-placeholder img[data-v-d079551c] {
    width: 100%
  }

  .strongly-recommend-container .recommend-list-item .activity-desc[data-v-d079551c] {
    font-size: .26rem;
    margin-top: .3rem;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .channel-list-container {
    position: relative;
    height: 100%;
    overflow: hidden
  }

  .channel-list-container .flex {
    overflow: hidden
  }

  .channel-list-container .flex ul {
    position: relative
  }

  .pageTabContainer {
    overflow: hidden
  }

  .channel-container {
    width: 100%;
    height: 100%
  }

  .channel-container .mint-tab-container-wrap {
    height: 100%
  }

  .channel-container .mint-tab-container-item {
    font-size: 0
  }

  .channel-container .nav-container {
    position: relative;
    z-index: 100;
    background: #fff;
    padding: 0 .96rem 0 0;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, .07);
    height: .72rem;
    width: 100%
  }

  .channel-container .nav {
    width: 100%;
    overflow: hidden
  }

  .channel-container .nav ul {
    font-size: 0
  }

  .channel-container .nav li {
    display: inline-block;
    text-align: center;
    white-space: nowrap;
    color: #000;
    font-size: 0;
    position: relative
  }

  .channel-container .nav li span.nav-title {
    font-size: .26rem;
    display: block;
    padding: 0 .25rem;
    line-height: .72rem
  }

  .channel-container .nav li.active {
    color: #1fa2ff
  }

  .channel-container .nav li .cur-line {
    position: absolute;
    top: .65rem;
    width: .2rem;
    height: .04rem;
    border-radius: .02rem;
    background-color: #1fa2ff;
    left: 50%;
    margin-left: -.1rem
  }

  .channel-container .nav .icon {
    position: absolute;
    top: 0;
    right: .3rem;
    width: .66rem;
    height: .72rem;
    text-align: center;
    line-height: .72rem;
    font-size: .3rem;
    background-color: #fff
  }

  .ypl-home-page .headerLine[data-v-5d692276] {
    height: .9rem;
    line-height: .9rem;
    align-items: center;
    -webkit-align-items: center;
    padding: 0 .2rem;
    font-size: .28rem;
    background: #f8f8f8
  }

  .ypl-home-page .headerLine .change-city[data-v-5d692276] {
    align-items: center;
    -webkit-align-items: center;
    max-width: 1.5rem;
    margin-right: .2rem
  }

  .ypl-home-page .headerLine .current-city-name[data-v-5d692276] {
    margin-right: .1rem
  }

  .ypl-home-page .headerLine .icon-sort-down[data-v-5d692276] {
    font-size: 10px
  }

  .ypl-city-check-wrapper {
    width: 100vw;
    height: 100vh;
    overflow: hidden
  }

  .ypl-city-check-wrapper .ypl-city-check-content {
    width: 100vw;
    height: 100vh;
    overflow: auto;
    -webkit-overflow-scrolling: touch
  }

  .ypl-city-check-wrapper .ypl-city-check-content .nationwide {
    padding: .3rem .2rem;
    border-bottom: 1px solid #ddd
  }

  .ypl-city-check-wrapper .ypl-city-check-content .search-city {
    width: 6rem;
    height: .6rem;
    margin: 0 auto;
    text-align: center;
    font-size: 0;
    border: 1px solid #ddd;
    border-radius: .1rem
  }

  .ypl-city-check-wrapper .ypl-city-check-content .search-city input {
    width: 100%;
    height: 100%;
    text-indent: .25rem;
    font-size: .24rem;
    line-height: normal
  }

  .ypl-city-check-wrapper .ypl-city-check-content .mint-indexlist .mint-indexlist-content .mint-indexsection .mint-indexsection-index {
    font-size: .5rem
  }

  .ypl-city-check-wrapper .ypl-city-check-content .mint-indexlist .mint-indexlist-content .mint-indexsection > ul .mint-cell-wrapper .mint-cell-value {
    width: 100%;
    border: none;
    color: #666;
    margin: 0;
    height: 100%
  }

  .ypl-city-check-wrapper .ypl-city-check-content .mint-indexlist .mint-indexlist-content .mint-indexsection > ul .mint-cell-wrapper .mint-cell-value p {
    width: 100%;
    height: 100%
  }

  .ypl-city-check-wrapper .ypl-city-check-content .mint-indexlist .mint-indexlist-nav {
    border: none
  }

  .ypl-headline-page-wrapper {
    padding-top: .9rem
  }

  .ypl-headline-page-wrapper .mint-cell-wrapper {
    background: none;
    padding: 10px 0 20px;
    position: relative
  }

  .ypl-headline-page-wrapper .mint-cell-wrapper:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-headline-page-wrapper .mint-cell-wrapper:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-headline-page-wrapper .mint-cell-wrapper:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-headline-page-wrapper .mint-cell-value {
    width: 100%
  }

  .ypl-headline-page-wrapper .headline-list {
    overflow: hidden
  }

  .ypl-headline-page-wrapper .headline-list .header-list-inner {
    position: relative;
    width: 100%;
    padding: .3rem
  }

  .ypl-headline-page-wrapper .headline-list-item {
    position: relative;
    padding-left: 2.2rem;
    overflow: hidden
  }

  .ypl-headline-page-wrapper .headline-list-item .headline-title {
    height: .95rem;
    letter-spacing: 1px;
    line-height: .36rem
  }

  .ypl-headline-page-wrapper .headline-list-item .img-placeholder {
    position: absolute;
    left: 0;
    top: 0;
    width: 2rem;
    height: 1.5rem;
    background-color: #aaa
  }

  .ypl-headline-page-wrapper .headline-list-item .img-placeholder img {
    width: 100%
  }

  .ypl-page-channel .mint-header .mint-header-button[data-v-35c6cd13] {
    flex: .5
  }

  .ypl-page-channel .channel-list[data-v-35c6cd13] {
    padding: .52rem .22rem .52rem .42rem;
    width: 100%;
    float: left;
    overflow: hidden
  }

  .ypl-page-channel .channel-list > li[data-v-35c6cd13] {
    float: left;
    width: 1.5rem;
    height: .58rem;
    background-color: #f2f2f2;
    text-align: center;
    line-height: .58rem;
    margin-right: .2rem;
    margin-bottom: .2rem;
    border-radius: .04rem;
    position: relative
  }

  .ypl-page-channel .channel-list > li .icon-icon-close-o[data-v-35c6cd13] {
    display: none;
    vertical-align: middle;
    position: absolute;
    right: -.11rem;
    top: -.3rem;
    color: #bcbcbc
  }

  .ypl-page-channel .channel-list > li .icon-plus[data-v-35c6cd13] {
    vertical-align: middle
  }

  .ypl-page-channel .channel-list.status-edit .icon-icon-close-o[data-v-35c6cd13] {
    display: inline-block
  }

  .ypl-page-channel .channel-list.status-edit .default-recommendation[data-v-35c6cd13] {
    background-color: #fff;
    color: #1fa2ff
  }

  .ypl-page-channel .channel-control[data-v-35c6cd13] {
    padding: 0 .45rem 0 .3rem;
    font-size: .28rem
  }

  .ypl-page-channel .channel-control .text-muted[data-v-35c6cd13] {
    font-weight: 400
  }

  .ypl-page-channel .channel-control .mint-button[data-v-35c6cd13] {
    height: .4rem;
    border-radius: .4rem
  }

  .ypl-search-wrapper .ypl-search-content .mint-header .is-left {
    display: none
  }

  .ypl-search-wrapper .ypl-search-content .mint-header .is-right {
    flex: none
  }

  .ypl-search-wrapper .ypl-search-content .mint-header .mint-header-title {
    padding-right: .2rem
  }

  .ypl-search-wrapper .ypl-search-content .searchLine input {
    align-self: center
  }

  .ypl-search-wrapper .ypl-search-content .searchLine .ic-clear, .ypl-search-wrapper .ypl-search-content .searchLine .ic-search {
    padding: 0 .25rem;
    align-self: center
  }

  .ypl-search-wrapper .ypl-search-content .ic-back {
    padding-right: .15rem
  }

  .hotHistorySearch {
    background: #fff
  }

  .hotHistorySearch .item {
    height: .88rem;
    padding: 0 .3rem;
    position: relative
  }

  .hotHistorySearch .item:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #e8e8e8;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .hotHistorySearch .item:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .hotHistorySearch .item:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .hotHistorySearch .item h5 {
    color: #2e2e2e;
    font-size: .32rem;
    margin-right: .2rem;
    align-self: center;
    -webkit-align-items: center
  }

  .hotHistorySearch .item .hotImg {
    width: .24rem;
    height: .3rem;
    align-self: center;
    -webkit-align-items: center
  }

  .hotHistorySearch .item .delImg {
    width: .44rem;
    height: .44rem;
    align-self: center;
    -webkit-align-items: center
  }

  .hotHistorySearch .history {
    justify-content: space-between;
    -webkit-justify-content: space-between
  }

  .hotHistorySearch .searchKey {
    color: #2e2e2e;
    font-size: .28rem;
    line-height: .88rem;
    padding-right: .6rem;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    word-break: break-all
  }

  .ypl-search-wrapper .ypl-search-content .mint-header .is-left {
    display: none
  }

  .ypl-search-wrapper .ypl-search-content .mint-header .is-right {
    flex: none
  }

  .ypl-search-wrapper .ypl-search-content .mint-header .mint-header-title {
    padding-right: .2rem
  }

  .ypl-search-wrapper .ypl-search-content .searchLine input {
    align-self: center
  }

  .ypl-search-wrapper .ypl-search-content .searchLine .ic-clear, .ypl-search-wrapper .ypl-search-content .searchLine .ic-search {
    padding: 0 .25rem;
    align-self: center
  }

  .ypl-search-wrapper .ypl-search-content .ic-back {
    padding-right: .15rem
  }

  .ypl-homesearchlist {
    height: 100%;
    overflow: hidden
  }

  .ypl-homesearchlist .ypl-homesearchlist-header {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    height: .72rem;
    font-size: .28rem;
    background: #fff;
    margin-bottom: .2rem;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, .06)
  }

  .ypl-homesearchlist .ypl-homesearchlist-header-li {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: center;
    position: relative;
    line-height: .72rem
  }

  .ypl-homesearchlist .ypl-homesearchlist-header-li > span {
    position: absolute;
    top: .65rem;
    width: .2rem;
    height: .04rem;
    border-radius: .02rem;
    background-color: #1fa2ff;
    left: 50%;
    margin-left: -.1rem
  }

  .ypl-homesearchlist .ypl-homesearchlist-main {
    height: calc(100vh - 1.63rem);
    overflow: hidden
  }

  .sponsor-page .mint-header .mint-header-button.is-left {
    padding-right: 1rem
  }

  .sponsor-page .mint-header .mint-header-button.is-right {
    width: 0;
    padding-left: 1rem
  }

  .sponsor-page .nav, .sponsor-page .nav-container {
    position: relative;
    z-index: 100;
    background: #fff;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, .07);
    height: .72rem;
    width: 100%
  }

  .sponsor-page .nav {
    overflow: hidden
  }

  .sponsor-page .nav ul {
    font-size: 0
  }

  .sponsor-page .nav li {
    display: inline-block;
    text-align: center;
    white-space: nowrap;
    color: #000;
    font-size: 0;
    position: relative
  }

  .sponsor-page .nav li span.nav-title {
    font-size: .26rem;
    display: block;
    line-height: .72rem
  }

  .sponsor-page .nav li.active {
    color: #1fa2ff
  }

  .sponsor-page .nav li .cur-line {
    position: absolute;
    top: .65rem;
    width: .2rem;
    height: .04rem;
    border-radius: .02rem;
    background-color: #1fa2ff;
    left: 50%;
    margin-left: -.1rem
  }

  .sponsor-detail-page[data-v-75563610] {
    width: 100%;
    overflow: hidden
  }

  .sponsor-detail-page .message-mask-layer[data-v-75563610] {
    z-index: 9999;
    width: 100%;
    height: 100%;
    position: fixed;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background-color: rgba(0, 0, 0, .85);
    text-align: center;
    padding-top: 2rem
  }

  .sponsor-detail-page .message-mask-layer .layer-close-icon[data-v-75563610] {
    position: absolute;
    top: 2.5rem;
    right: 1.5rem;
    color: #fff;
    font-size: .5rem
  }

  .sponsor-detail-page .message-mask-layer .toViewDetailBtn[data-v-75563610] {
    padding: 0 20%;
    margin-top: .7rem
  }

  .sponsor-detail-page .message-mask-layer .toViewDetailBtn .mint-button[data-v-75563610] {
    background: -moz-linear-gradient(linear, left top, right top, from(#bd8f46), to(#dcbc8c));
    background: -webkit-gradient(linear, left top, right top, from(#bd8f46), to(#dcbc8c));
    color: #fff;
    letter-spacing: 5px
  }

  .sponsor-detail-page .message-mask-layer p[data-v-75563610] {
    color: #f9d692;
    font-size: .28rem;
    line-height: .4rem
  }

  .sponsor-detail-page .mint-header[data-v-75563610] {
    z-index: 2
  }

  .sponsor-detail-page-inner[data-v-75563610] {
    padding-top: 4.3rem
  }

  .sponsor-detail-page-top-banner[data-v-75563610] {
    padding: 0 .44rem;
    z-index: 2;
    position: absolute;
    width: 100%;
    top: 0
  }

  .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
    width: 100%;
    height: 3.88rem;
    box-shadow: 0 -2px 24px 0 rgba(0, 110, 188, .21);
    border-radius: .08rem;
    position: relative;
    background: url("/static/images/bgWave.png") bottom no-repeat #fff;
    background-size: 100%;
    text-align: center;
    padding-top: .2rem;
    background-color: #fff;
    margin-top: .3rem
  }

  @media (-o-min-device-pixel-ratio: 3/2),(-webkit-min-device-pixel-ratio: 1.5),(min--moz-device-pixel-ratio: 1.5),(min-resolution: 1.5dppx) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-resolution: 2 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-resolution: 3 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 4),(min-resolution: 4 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 5),(min-resolution: 5 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 6),(min-resolution: 6 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 7),(min-resolution: 7 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 8),(min-resolution: 8 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 9),(min-resolution: 9 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 10),(min-resolution: 10 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 11),(min-resolution: 11 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 12),(min-resolution: 12 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 13),(min-resolution: 13 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 14),(min-resolution: 14 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 15),(min-resolution: 15 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 16),(min-resolution: 16 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 17),(min-resolution: 17 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 18),(min-resolution: 18 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 19),(min-resolution: 19 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 20),(min-resolution: 20 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 21),(min-resolution: 21 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 22),(min-resolution: 22 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 23),(min-resolution: 23 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 24),(min-resolution: 24 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 25),(min-resolution: 25 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 26),(min-resolution: 26 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 27),(min-resolution: 27 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 28),(min-resolution: 28 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 29),(min-resolution: 29 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 30),(min-resolution: 30 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 31),(min-resolution: 31 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 32),(min-resolution: 32 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 33),(min-resolution: 33 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 34),(min-resolution: 34 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 35),(min-resolution: 35 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 36),(min-resolution: 36 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 37),(min-resolution: 37 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 38),(min-resolution: 38 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 39),(min-resolution: 39 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 40),(min-resolution: 40 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 41),(min-resolution: 41 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 42),(min-resolution: 42 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 43),(min-resolution: 43 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 44),(min-resolution: 44 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 45),(min-resolution: 45 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 46),(min-resolution: 46 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 47),(min-resolution: 47 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 48),(min-resolution: 48 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 49),(min-resolution: 49 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 50),(min-resolution: 50 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 51),(min-resolution: 51 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 52),(min-resolution: 52 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 53),(min-resolution: 53 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 54),(min-resolution: 54 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 55),(min-resolution: 55 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 56),(min-resolution: 56 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 57),(min-resolution: 57 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 58),(min-resolution: 58 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 59),(min-resolution: 59 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 60),(min-resolution: 60 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 61),(min-resolution: 61 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 62),(min-resolution: 62 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 63),(min-resolution: 63 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 64),(min-resolution: 64 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 65),(min-resolution: 65 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 66),(min-resolution: 66 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 67),(min-resolution: 67 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 68),(min-resolution: 68 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 69),(min-resolution: 69 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 70),(min-resolution: 70 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 71),(min-resolution: 71 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 72),(min-resolution: 72 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 73),(min-resolution: 73 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 74),(min-resolution: 74 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 75),(min-resolution: 75 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 76),(min-resolution: 76 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 77),(min-resolution: 77 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 78),(min-resolution: 78 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 79),(min-resolution: 79 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 80),(min-resolution: 80 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 81),(min-resolution: 81 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 82),(min-resolution: 82 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 83),(min-resolution: 83 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 84),(min-resolution: 84 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 85),(min-resolution: 85 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 86),(min-resolution: 86 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 87),(min-resolution: 87 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 88),(min-resolution: 88 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 89),(min-resolution: 89 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 90),(min-resolution: 90 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 91),(min-resolution: 91 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 92),(min-resolution: 92 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 93),(min-resolution: 93 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 94),(min-resolution: 94 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 95),(min-resolution: 95 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 96),(min-resolution: 96 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 97),(min-resolution: 97 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 98),(min-resolution: 98 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 99),(min-resolution: 99 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 100),(min-resolution: 100 *96dpi) {
    .sponsor-detail-page-top-banner .sponsor-card[data-v-75563610] {
      background: url(../assets/bgWave@3x.png) bottom no-repeat #fff;
      background-size: 100%
    }
  }

  .sponsor-detail-page-top-banner .sponsor-card-avatar[data-v-75563610] {
    width: 1.42rem;
    height: 1.42rem;
    border-radius: 50%;
    display: inline-block
  }

  .sponsor-detail-page-top-banner .sponsor-card-avatar img[data-v-75563610] {
    width: 1.42rem;
    height: 1.42rem;
    border-radius: 50%
  }

  .sponsor-detail-page-top-banner .sponsor-card .sponsor-name[data-v-75563610] {
    margin-bottom: .16rem;
    margin-top: .2rem
  }

  .sponsor-detail-page-top-banner .sponsor-card .sponsor-desc[data-v-75563610] {
    text-align: center;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    display: -webkit-box !important;
    -webkit-line-clamp: 2;
    -moz-box-orient: vertical;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -moz-box-direction: normal;
    word-break: break-all;
    padding: .05rem 0;
    padding: 0 .3rem;
    line-height: 1.5
  }

  .sponsor-detail-page-top-banner .sponsor-card .sponsor-status[data-v-75563610] {
    position: absolute;
    height: .3rem;
    padding: 0 .1rem;
    font-size: .2rem;
    top: 1.2rem;
    color: #d0a05c;
    border-color: #d0a05c
  }

  .sponsor-detail-page-top-banner .sponsor-card-statics[data-v-75563610] {
    display: table;
    position: absolute;
    bottom: .22rem;
    left: 0;
    width: 100%;
    font-size: .2rem
  }

  .sponsor-detail-page-top-banner .sponsor-card-statics-item[data-v-75563610] {
    display: table-cell;
    text-align: center
  }

  .sponsor-detail-page-content[data-v-75563610] {
    position: relative
  }

  .sponsor-detail-page-content .top-banner-bg[data-v-75563610] {
    position: absolute;
    width: 35rem;
    height: 35rem;
    left: -13.75rem;
    top: -33rem;
    background-color: #1fa2ff;
    border-radius: 50%;
    z-index: 1
  }

  .sponsor-detail-page-content .titleLine[data-v-75563610] {
    padding: .2rem .3rem;
    align-items: center;
    -webkit-align-items: center;
    justify-content: space-between;
    -webkit-justify-content: space-between
  }

  .sponsor-detail-page-content .titleLine .consult img[data-v-75563610] {
    height: .6rem;
    align-self: center
  }

  .sponsor-detail-page-content .titleLine .follow-btn[data-v-75563610] {
    height: .6rem;
    line-height: .6rem;
    align-self: center;
    font-size: .28rem;
    letter-spacing: .01rem;
    color: #1fa2ff;
    padding: 0 .2rem;
    border: 1px solid #1fa2ff;
    border-radius: 4px;
    background-color: #fff;
    margin-left: .24rem
  }

  .sponsor-detail-page-content .titleLine .follow-btn img[data-v-75563610] {
    width: .24rem;
    height: .24rem;
    align-self: center;
    margin-right: .08rem
  }

  .sponsor-detail-page-content .titleLine .follow-btn .iconfont[data-v-75563610] {
    line-height: .27rem;
    height: .27rem;
    font-size: .2rem
  }

  .sponsor-detail-page-content .titleLine .follow-btn.isFollowed[data-v-75563610] {
    background-color: #1fa2ff;
    border-radius: 4px;
    color: #fff
  }

  .sponsor-detail-page-content .noData-defaultImg[data-v-75563610] {
    align-items: center;
    justify-content: center;
    margin-top: .5rem
  }

  .sponsor-detail-page-content .noData-defaultImg img[data-v-75563610] {
    width: 2.72rem;
    height: 2.96rem
  }

  .sponsor-detail-page .activity-list-item[data-v-75563610] {
    padding: .2rem 2.84rem .2rem .3rem;
    background-color: #fff;
    margin-bottom: .2rem;
    position: relative;
    min-height: 1.85rem
  }

  .sponsor-detail-page .activity-list-item .activity-title[data-v-75563610] {
    line-height: .36rem
  }

  .sponsor-detail-page .activity-list-item .image-placeholder[data-v-75563610] {
    width: 2.54rem;
    height: 1.44rem;
    position: absolute;
    right: .3rem;
    top: .2rem;
    border-radius: .02rem
  }

  .sponsor-detail-page .activity-list-item .image-placeholder img[data-v-75563610] {
    width: 2.54rem;
    height: 1.44rem
  }

  .sponsor-detail-page.authenticated[data-v-75563610] {
    min-height: 100%
  }

  .sponsor-detail-page.authenticated .sponsor-status[data-v-75563610], .sponsor-detail-page.authenticated .top-banner-bg[data-v-75563610] {
    display: none;
    visibility: hidden
  }

  .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
    background: url("../assets/auth_bg@3x.png") top no-repeat;
    background-size: 100%;
    margin-top: .9rem
  }

  @media (-o-min-device-pixel-ratio: 3/2),(-webkit-min-device-pixel-ratio: 1.5),(min--moz-device-pixel-ratio: 1.5),(min-resolution: 1.5dppx) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(../assets/auth_bg@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-resolution: 2 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(../assets/auth_bg@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-resolution: 3 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(../assets/auth_bg@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 4),(min-resolution: 4 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(../assets/auth_bg@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 5),(min-resolution: 5 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(../assets/auth_bg@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 6),(min-resolution: 6 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@6x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 7),(min-resolution: 7 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@7x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 8),(min-resolution: 8 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@8x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 9),(min-resolution: 9 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@9x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 10),(min-resolution: 10 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@10x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 11),(min-resolution: 11 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@11x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 12),(min-resolution: 12 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@12x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 13),(min-resolution: 13 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@13x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 14),(min-resolution: 14 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@14x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 15),(min-resolution: 15 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@15x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 16),(min-resolution: 16 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@16x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 17),(min-resolution: 17 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@17x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 18),(min-resolution: 18 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@18x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 19),(min-resolution: 19 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@19x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 20),(min-resolution: 20 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@20x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 21),(min-resolution: 21 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@21x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 22),(min-resolution: 22 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@22x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 23),(min-resolution: 23 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@23x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 24),(min-resolution: 24 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@24x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 25),(min-resolution: 25 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@25x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 26),(min-resolution: 26 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@26x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 27),(min-resolution: 27 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@27x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 28),(min-resolution: 28 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@28x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 29),(min-resolution: 29 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@29x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 30),(min-resolution: 30 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@30x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 31),(min-resolution: 31 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@31x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 32),(min-resolution: 32 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@32x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 33),(min-resolution: 33 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@33x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 34),(min-resolution: 34 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@34x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 35),(min-resolution: 35 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@35x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 36),(min-resolution: 36 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@36x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 37),(min-resolution: 37 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@37x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 38),(min-resolution: 38 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@38x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 39),(min-resolution: 39 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@39x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 40),(min-resolution: 40 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@40x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 41),(min-resolution: 41 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@41x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 42),(min-resolution: 42 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@42x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 43),(min-resolution: 43 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@43x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 44),(min-resolution: 44 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@44x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 45),(min-resolution: 45 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@45x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 46),(min-resolution: 46 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@46x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 47),(min-resolution: 47 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@47x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 48),(min-resolution: 48 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@48x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 49),(min-resolution: 49 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@49x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 50),(min-resolution: 50 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@50x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 51),(min-resolution: 51 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@51x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 52),(min-resolution: 52 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@52x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 53),(min-resolution: 53 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@53x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 54),(min-resolution: 54 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@54x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 55),(min-resolution: 55 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@55x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 56),(min-resolution: 56 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@56x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 57),(min-resolution: 57 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@57x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 58),(min-resolution: 58 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@58x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 59),(min-resolution: 59 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@59x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 60),(min-resolution: 60 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@60x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 61),(min-resolution: 61 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@61x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 62),(min-resolution: 62 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@62x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 63),(min-resolution: 63 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@63x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 64),(min-resolution: 64 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@64x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 65),(min-resolution: 65 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@65x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 66),(min-resolution: 66 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@66x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 67),(min-resolution: 67 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@67x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 68),(min-resolution: 68 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@68x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 69),(min-resolution: 69 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@69x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 70),(min-resolution: 70 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@70x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 71),(min-resolution: 71 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@71x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 72),(min-resolution: 72 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@72x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 73),(min-resolution: 73 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@73x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 74),(min-resolution: 74 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@74x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 75),(min-resolution: 75 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@75x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 76),(min-resolution: 76 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@76x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 77),(min-resolution: 77 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@77x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 78),(min-resolution: 78 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@78x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 79),(min-resolution: 79 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@79x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 80),(min-resolution: 80 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@80x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 81),(min-resolution: 81 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@81x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 82),(min-resolution: 82 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@82x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 83),(min-resolution: 83 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@83x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 84),(min-resolution: 84 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@84x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 85),(min-resolution: 85 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@85x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 86),(min-resolution: 86 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@86x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 87),(min-resolution: 87 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@87x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 88),(min-resolution: 88 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@88x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 89),(min-resolution: 89 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@89x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 90),(min-resolution: 90 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@90x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 91),(min-resolution: 91 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@91x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 92),(min-resolution: 92 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@92x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 93),(min-resolution: 93 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@93x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 94),(min-resolution: 94 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@94x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 95),(min-resolution: 95 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@95x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 96),(min-resolution: 96 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@96x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 97),(min-resolution: 97 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@97x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 98),(min-resolution: 98 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@98x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 99),(min-resolution: 99 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@99x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 100),(min-resolution: 100 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-detail-page-top-banner[data-v-75563610] {
      background: url(/static/images/auth_bg@100x.png) top no-repeat;
      background-size: 100%
    }
  }

  .sponsor-detail-page.authenticated .sponsor-detail-page-inner[data-v-75563610] {
    padding-top: 5.6rem;
  }

  .sponsor-detail-page.authenticated .public-activity[data-v-75563610] {
    margin-top: -.8rem
  }

  .sponsor-detail-page.authenticated .public-activity .titleLine .title[data-v-75563610] {
    color: #000
  }

  .sponsor-detail-page.authenticated .public-activity .titleLine .follow-btn[data-v-75563610] {
    color: #caa264;
    border: 1px solid #caa264;
    background-color: #fff
  }

  .sponsor-detail-page.authenticated .public-activity .titleLine .follow-btn.isFollowed[data-v-75563610] {
    border: 1px solid #aaa;
    border-radius: 4px;
    color: #fff;
    background-color: #fff
  }

  .sponsor-detail-page.authenticated .sponsor-card[data-v-75563610] {
    background: none;
    color: #000;
    position: relative;
    padding-top: .8rem;
    margin-top: 0
  }

  .sponsor-detail-page.authenticated .sponsor-card .sponsor-name[data-v-75563610] {
    margin: 0
  }

  .sponsor-detail-page.authenticated .sponsor-card .sponsor-desc[data-v-75563610] {
    color: #fff8e0;
    padding: 0 .4rem;
    margin-top: .1rem;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    display: -webkit-box !important;
    -webkit-line-clamp: 3;
    -moz-box-orient: vertical;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -moz-box-direction: normal;
    word-break: break-all;
    padding: .05rem 0
  }

  .sponsor-detail-page.authenticated .sponsor-card-avatar[data-v-75563610] {
    left: 50%;
    margin-left: -.71rem;
    position: absolute;
    top: -.8rem
  }

  .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
    width: 1.3rem;
    height: .54rem;
    position: absolute;
    top: 1.1rem;
    left: .05rem;
    background: url("/static/images/badge.png") top no-repeat;
    background-size: 100%
  }

  @media (-o-min-device-pixel-ratio: 3/2),(-webkit-min-device-pixel-ratio: 1.5),(min--moz-device-pixel-ratio: 1.5),(min-resolution: 1.5dppx) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-resolution: 2 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-resolution: 3 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 4),(min-resolution: 4 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 5),(min-resolution: 5 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 6),(min-resolution: 6 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 7),(min-resolution: 7 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 8),(min-resolution: 8 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 9),(min-resolution: 9 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 10),(min-resolution: 10 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 11),(min-resolution: 11 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 12),(min-resolution: 12 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 13),(min-resolution: 13 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 14),(min-resolution: 14 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 15),(min-resolution: 15 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 16),(min-resolution: 16 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 17),(min-resolution: 17 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 18),(min-resolution: 18 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 19),(min-resolution: 19 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 20),(min-resolution: 20 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 21),(min-resolution: 21 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 22),(min-resolution: 22 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 23),(min-resolution: 23 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 24),(min-resolution: 24 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 25),(min-resolution: 25 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 26),(min-resolution: 26 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 27),(min-resolution: 27 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 28),(min-resolution: 28 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 29),(min-resolution: 29 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 30),(min-resolution: 30 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 31),(min-resolution: 31 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 32),(min-resolution: 32 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 33),(min-resolution: 33 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 34),(min-resolution: 34 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 35),(min-resolution: 35 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 36),(min-resolution: 36 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 37),(min-resolution: 37 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 38),(min-resolution: 38 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 39),(min-resolution: 39 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 40),(min-resolution: 40 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 41),(min-resolution: 41 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 42),(min-resolution: 42 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 43),(min-resolution: 43 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 44),(min-resolution: 44 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 45),(min-resolution: 45 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 46),(min-resolution: 46 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 47),(min-resolution: 47 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 48),(min-resolution: 48 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 49),(min-resolution: 49 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 50),(min-resolution: 50 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 51),(min-resolution: 51 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 52),(min-resolution: 52 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 53),(min-resolution: 53 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 54),(min-resolution: 54 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 55),(min-resolution: 55 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 56),(min-resolution: 56 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 57),(min-resolution: 57 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 58),(min-resolution: 58 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 59),(min-resolution: 59 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 60),(min-resolution: 60 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 61),(min-resolution: 61 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 62),(min-resolution: 62 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 63),(min-resolution: 63 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 64),(min-resolution: 64 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 65),(min-resolution: 65 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 66),(min-resolution: 66 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 67),(min-resolution: 67 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 68),(min-resolution: 68 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 69),(min-resolution: 69 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 70),(min-resolution: 70 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 71),(min-resolution: 71 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 72),(min-resolution: 72 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 73),(min-resolution: 73 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 74),(min-resolution: 74 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 75),(min-resolution: 75 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 76),(min-resolution: 76 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 77),(min-resolution: 77 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 78),(min-resolution: 78 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 79),(min-resolution: 79 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 80),(min-resolution: 80 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 81),(min-resolution: 81 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 82),(min-resolution: 82 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 83),(min-resolution: 83 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 84),(min-resolution: 84 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 85),(min-resolution: 85 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 86),(min-resolution: 86 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 87),(min-resolution: 87 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 88),(min-resolution: 88 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 89),(min-resolution: 89 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 90),(min-resolution: 90 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 91),(min-resolution: 91 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 92),(min-resolution: 92 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 93),(min-resolution: 93 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 94),(min-resolution: 94 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 95),(min-resolution: 95 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 96),(min-resolution: 96 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 97),(min-resolution: 97 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 98),(min-resolution: 98 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 99),(min-resolution: 99 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 100),(min-resolution: 100 *96dpi) {
    .sponsor-detail-page.authenticated .sponsor-card-avatar .sponsor-badge[data-v-75563610] {
      background: url(../assets/badge@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  .sponsor-detail-page.authenticated .sponsor-card-statics[data-v-75563610] {
    bottom: .5rem
  }

  .sponsor-detail-page.authenticated .sponsor-card-statics-item[data-v-75563610] {
    font-size: .19rem;
    color: #fff0d3
  }

  .sponsor-detail-page.authenticated .sponsor-card-statics-item .iconfont[data-v-75563610] {
    display: none
  }

  .sponsor-detail-page.authenticated .sponsor-card-statics-item .text-info[data-v-75563610] {
    display: block;
    font-size: .38rem;
    line-height: .54rem;
    color: #fff;
    text-shadow: 0 3px 2px #a47223
  }

  .sponsor-detail-page.authenticated .image-placeholder[data-v-75563610] {
    width: 2.54rem;
    height: 1.44rem
  }

  .sponsor-detail-page.authenticated .image-placeholder img[data-v-75563610] {
    border: .02rem solid #dfaf5e
  }

  .sponsor-detail-page.authenticated .activity-list[data-v-75563610] {
    padding: 0 .3rem
  }

  .sponsor-detail-page.authenticated .activity-list-item[data-v-75563610] {
    background-color: transparent;
    border-bottom: 1px solid #f2f2f2;
    padding: .2rem 2.54rem .2rem 0
  }

  .sponsor-detail-page.authenticated .activity-list-item .image-placeholder[data-v-75563610] {
    right: 0
  }

  .sponsor-detail-page.authenticated .activity-list-item .activity-title[data-v-75563610] {
    color: #000
  }

  .sponsor-login-btn {
    color: #fff;
    height: .8rem;
    line-height: .8rem;
    text-align: center;
    font-size: .34rem;
    margin: 1.72rem 1.05rem;
    background: #3498db;
    border-radius: .04rem
  }

  .sponsor-login-btn {
    color: #fff;
    height: .8rem;
    line-height: .8rem;
    text-align: center;
    font-size: .34rem;
    margin: 1.72rem 1.05rem;
    background: #3498db;
    border-radius: .04rem
  }

  .fade-enter-active[data-v-db836fd8], .fade-leave-active[data-v-db836fd8] {
    transition: opacity .3s
  }

  .fade-enter[data-v-db836fd8], .fade-leave-to[data-v-db836fd8] {
    opacity: 0
  }

  .appletDialogContent[data-v-db836fd8] {
    position: fixed;
    top: 50%;
    left: 50%;
    z-index: 10;
    opacity: 1;
    -webkit-transform: translate3d(-50%, -50%, 0);
    transform: translate3d(-50%, -50%, 0);
    background: #fff;
    width: 85%;
    border-radius: 3px;
    font-size: 16px;
    -webkit-user-select: none;
    overflow: hidden;
    -webkit-backface-visibility: hidden;
    backface-visibility: hidden;
    -webkit-transition: .2s;
    transition: .2s;
    padding: .4rem
  }

  .appletDialogContent .icon[data-v-db836fd8] {
    position: absolute;
    top: .1rem;
    right: .1rem;
    padding: .2rem
  }

  .appletDialogContent .icon i[data-v-db836fd8] {
    width: .4rem;
    height: .4rem
  }

  .appletDialogContent h5[data-v-db836fd8] {
    color: #2e2e2e;
    height: .8rem;
    line-height: .8rem;
    font-size: .36rem;
    text-align: center
  }

  .appletDialogContent img[data-v-db836fd8] {
    width: 3.5rem;
    height: 3.5rem
  }

  .appletDialogContent p[data-v-db836fd8] {
    color: #2e2e2e;
    font-size: .28rem;
    line-height: .36rem;
    text-align: center;
    margin-top: .32rem
  }

  .appletDialogContent .img-con[data-v-db836fd8] {
    margin: .3rem 0;
    justify-content: center
  }

  .appletDialogContent .slogan[data-v-db836fd8] {
    font-size: .32rem;
    font-weight: 700;
    margin-top: .5rem
  }

  .appletDialogContent .desc[data-v-db836fd8] {
    text-align: left;
    margin-left: .5rem;
    margin-top: .1rem
  }

  .appletDialogContent .btn-dialog[data-v-db836fd8] {
    color: #fff;
    font-size: .32rem;
    height: .8rem;
    line-height: .8rem;
    text-align: center;
    background: #1fa2ff;
    margin-top: .56rem;
    border-radius: .08rem
  }

  .bg-dialog[data-v-db836fd8] {
    position: fixed;
    top: 0;
    left: 0;
    z-index: 9;
    width: 100%;
    height: 100%;
    opacity: .6;
    background: #000
  }

  .ypl-tools-page .flex {
    overflow: hidden
  }

  .ypl-tools-page .top-banner {
    height: 4.16rem;
    background: url("/static/images/toolsBanner.png") top no-repeat;
    background-size: 100%
  }

  @media (-o-min-device-pixel-ratio: 3/2),(-webkit-min-device-pixel-ratio: 1.5),(min--moz-device-pixel-ratio: 1.5),(min-resolution: 1.5dppx) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@2x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-resolution: 2 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@2x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-resolution: 3 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@3x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 4),(min-resolution: 4 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@4x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 5),(min-resolution: 5 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@5x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 6),(min-resolution: 6 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@6x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 7),(min-resolution: 7 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@7x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 8),(min-resolution: 8 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@8x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 9),(min-resolution: 9 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@9x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 10),(min-resolution: 10 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@10x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 11),(min-resolution: 11 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@11x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 12),(min-resolution: 12 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@12x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 13),(min-resolution: 13 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@13x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 14),(min-resolution: 14 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@14x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 15),(min-resolution: 15 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@15x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 16),(min-resolution: 16 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@16x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 17),(min-resolution: 17 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@17x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 18),(min-resolution: 18 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@18x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 19),(min-resolution: 19 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@19x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 20),(min-resolution: 20 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@20x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 21),(min-resolution: 21 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@21x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 22),(min-resolution: 22 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@22x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 23),(min-resolution: 23 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@23x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 24),(min-resolution: 24 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@24x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 25),(min-resolution: 25 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@25x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 26),(min-resolution: 26 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@26x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 27),(min-resolution: 27 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@27x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 28),(min-resolution: 28 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@28x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 29),(min-resolution: 29 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@29x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 30),(min-resolution: 30 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@30x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 31),(min-resolution: 31 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@31x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 32),(min-resolution: 32 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@32x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 33),(min-resolution: 33 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@33x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 34),(min-resolution: 34 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@34x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 35),(min-resolution: 35 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@35x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 36),(min-resolution: 36 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@36x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 37),(min-resolution: 37 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@37x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 38),(min-resolution: 38 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@38x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 39),(min-resolution: 39 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@39x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 40),(min-resolution: 40 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@40x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 41),(min-resolution: 41 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@41x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 42),(min-resolution: 42 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@42x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 43),(min-resolution: 43 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@43x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 44),(min-resolution: 44 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@44x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 45),(min-resolution: 45 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@45x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 46),(min-resolution: 46 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@46x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 47),(min-resolution: 47 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@47x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 48),(min-resolution: 48 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@48x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 49),(min-resolution: 49 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@49x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 50),(min-resolution: 50 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@50x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 51),(min-resolution: 51 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@51x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 52),(min-resolution: 52 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@52x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 53),(min-resolution: 53 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@53x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 54),(min-resolution: 54 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@54x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 55),(min-resolution: 55 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@55x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 56),(min-resolution: 56 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@56x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 57),(min-resolution: 57 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@57x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 58),(min-resolution: 58 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@58x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 59),(min-resolution: 59 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@59x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 60),(min-resolution: 60 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@60x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 61),(min-resolution: 61 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@61x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 62),(min-resolution: 62 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@62x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 63),(min-resolution: 63 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@63x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 64),(min-resolution: 64 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@64x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 65),(min-resolution: 65 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@65x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 66),(min-resolution: 66 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@66x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 67),(min-resolution: 67 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@67x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 68),(min-resolution: 68 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@68x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 69),(min-resolution: 69 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@69x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 70),(min-resolution: 70 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@70x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 71),(min-resolution: 71 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@71x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 72),(min-resolution: 72 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@72x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 73),(min-resolution: 73 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@73x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 74),(min-resolution: 74 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@74x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 75),(min-resolution: 75 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@75x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 76),(min-resolution: 76 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@76x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 77),(min-resolution: 77 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@77x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 78),(min-resolution: 78 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@78x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 79),(min-resolution: 79 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@79x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 80),(min-resolution: 80 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@80x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 81),(min-resolution: 81 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@81x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 82),(min-resolution: 82 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@82x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 83),(min-resolution: 83 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@83x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 84),(min-resolution: 84 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@84x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 85),(min-resolution: 85 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@85x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 86),(min-resolution: 86 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@86x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 87),(min-resolution: 87 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@87x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 88),(min-resolution: 88 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@88x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 89),(min-resolution: 89 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@89x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 90),(min-resolution: 90 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@90x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 91),(min-resolution: 91 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@91x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 92),(min-resolution: 92 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@92x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 93),(min-resolution: 93 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@93x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 94),(min-resolution: 94 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@94x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 95),(min-resolution: 95 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@95x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 96),(min-resolution: 96 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@96x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 97),(min-resolution: 97 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@97x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 98),(min-resolution: 98 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@98x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 99),(min-resolution: 99 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@99x.png) top no-repeat;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 100),(min-resolution: 100 *96dpi) {
    .ypl-tools-page .top-banner {
      background: url(/static/images/toolsBanner@100x.png) top no-repeat;
      background-size: 100%
    }
  }

  .ypl-tools-page .un-read {
    font-weight: 700
  }

  .ypl-tools-page .tools-card {
    padding: 0 .3rem
  }

  .ypl-tools-page .tools-card .card-title {
    font-size: .34rem;
    padding: .3rem 0;
    letter-spacing: 1px;
    font-weight: 400
  }

  .ypl-tools-page .tools-card .card-content {
    width: 100%;
    overflow: hidden
  }

  .ypl-tools-page .tools-card .card-content.border-bottom {
    border-bottom: 1px solid #efefef
  }

  .ypl-tools-page .useful-tools-list {
    overflow: hidden
  }

  .ypl-tools-page .useful-tools-list > li {
    float: left;
    margin-right: .3rem;
    margin-left: .15rem
  }

  .ypl-tools-page .useful-tools-list > li.last-child {
    margin-right: 0
  }

  .ypl-tools-page .group-purchase-list {
    width: 30rem;
    display: flex;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex
  }

  .ypl-tools-page .group-purchase-list .image-placeholder {
    width: 3.1rem;
    height: 1.84rem;
    background-color: #aaa;
    border-radius: 3px
  }

  .ypl-tools-page .group-purchase-list > li {
    float: left
  }

  .ypl-tools-page .group-purchase-list > li:not(:last-child) {
    margin-right: .15rem
  }

  .ypl-tools-page .group-purchase-list > li .group-name {
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    display: -webkit-box !important;
    -webkit-line-clamp: 2;
    -moz-box-orient: vertical;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -moz-box-direction: normal;
    word-break: break-all;
    padding: .05rem 0
  }

  .ypl-tools-page .group-purchase-list > li .text-price {
    color: #fb403d
  }

  .ypl-tools-page .vote-list {
    margin-top: 0
  }

  .ypl-tools-page .vote-list > li {
    position: relative;
    padding-left: 2.53rem;
    height: 1.44rem;
    margin: .3rem 0;
    letter-spacing: 1px;
    line-height: .36rem
  }

  .ypl-tools-page .vote-list > li:first-child {
    margin-top: 0
  }

  .ypl-tools-page .vote-list > li .image-placeholder {
    position: absolute;
    width: 2.53rem;
    height: 1.44rem;
    left: 0;
    background-color: #aaa
  }

  .ypl-tools-page .vote-list .progress-bar {
    height: .4rem;
    display: table
  }

  .ypl-tools-page .vote-list .progress-bar .progress-bar-graph {
    width: 3.2rem;
    padding-right: .2rem
  }

  .ypl-tools-page .vote-list .progress-bar .progress-bar-graph, .ypl-tools-page .vote-list .progress-bar .progress-bar-percent {
    display: table-cell;
    vertical-align: middle
  }

  .ypl-tools-page .vote-list .progress-bar .progress-bar-percent {
    color: #ff4800
  }

  .ypl-tools-page .vote-list .progress-bar .mt-progress-runway {
    background-color: #ededed;
    border-radius: 6px
  }

  .ypl-tools-page .vote-list .progress-bar .mt-progress-progress {
    background: linear-gradient(-90deg, red, #ff9300);
    border-radius: 6px
  }

  .ym-groupBuylist[data-v-0b2ac2ce] {
    height: 100%;
    width: 100%;
    background: #f7f7f7;
    overflow: hidden
  }

  .ym-groupBuylist .ym-groupBuylist-header[data-v-0b2ac2ce] {
    position: absolute;
    z-index: 2;
    display: flex;
    padding-bottom: 1rem;
    border: .02rem solid #f94233;
    background: #fff;
    font-size: .28rem;
    width: 100%;
    border-top: none;
    top: .89rem;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap
  }

  .ym-groupBuylist .ym-groupBuylist-header > li[data-v-0b2ac2ce] {
    height: .54rem;
    width: 1.62rem;
    font-size: .28rem;
    text-align: center;
    color: #f94233;
    border: .02rem solid #f94233;
    line-height: .54rem;
    margin-top: .74rem;
    margin-left: .2rem
  }

  .ym-groupBuylist .ym-groupBuylist-header .Release[data-v-0b2ac2ce] {
    float: left;
    width: 22.5%;
    height: .54rem;
    margin-left: 2%;
    margin-top: .44rem
  }

  .ym-groupBuylist .ym-groupBuylist-header .hoverstyle[data-v-0b2ac2ce] {
    color: #fff;
    background: #f94233
  }

  .ym-groupBuylist .ym-groupBuylist-top[data-v-0b2ac2ce] {
    background: #fff;
    height: 1.32rem;
    width: 100%;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    position: relative;
    -webkit-justify-content: space-around;
    justify-content: space-around
  }

  .ym-groupBuylist .ym-groupBuylist-top .ym-groupBuylist-toptags[data-v-0b2ac2ce] {
    background-size: 100% 100%;
    font-size: .34rem;
    width: 2rem;
    height: .72rem;
    text-align: center;
    line-height: .72rem;
    margin-top: .34rem;
    color: #ababab
  }

  .ym-groupBuylist .ym-groupBuylist-top .hovertoptags[data-v-0b2ac2ce] {
    background-image: url("/static/images/icon_shiney/Rectangle.png");
    background-repeat: no-repeat;
    color: #fff
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-groupBuylist .ym-groupBuylist-top .hovertoptags[data-v-0b2ac2ce] {
      background-image: url("/static/images/icon_shiney/Rectangle@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-groupBuylist .ym-groupBuylist-top .hovertoptags[data-v-0b2ac2ce] {
      background-image: url("/static/images/icon_shiney/Rectangle@3x.png")
    }
  }

  .ym-groupBuylist .ym-groupBuylist-main[data-v-0b2ac2ce] {
    font-size: 0;
    height: calc(100% - 2.23rem);
    padding-bottom: .3rem;
    overflow: hidden
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body[data-v-0b2ac2ce] {
    width: 100%;
    height: 100%
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li[data-v-0b2ac2ce] {
    padding: .3rem;
    position: relative;
    margin-top: .2rem;
    width: 100%;
    height: 2.5rem;
    background: #fff
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-header[data-v-0b2ac2ce] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-header .ym-groupBuylist-bodylist-img[data-v-0b2ac2ce] {
    width: 2.54rem;
    height: 1.44rem
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-header .ym-groupBuylist-bodylist-text[data-v-0b2ac2ce] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-size: .24rem;
    margin-left: .2rem;
    height: 1.44rem;
    overflow: hidden
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-header .ym-groupBuylist-bodylist-text .ym-groupBuylist-bodylist-textp[data-v-0b2ac2ce] {
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0;
    font-size: .26rem;
    color: #2e2e2e
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-header .ym-groupBuylist-bodylist-text .ym-groupBuylist-bodylist-textadress[data-v-0b2ac2ce] {
    margin-top: .6rem;
    color: #ababab;
    font-size: .24rem
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-texttime[data-v-0b2ac2ce] {
    color: #ababab;
    font-size: .24rem;
    margin-top: .3rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-texttime .ym-groupBuylist-bodylist-texttimekLeft[data-v-0b2ac2ce] {
    font-size: .24rem;
    color: #ababab;
    -webkit-box-flex: 4;
    -moz-box-flex: 4;
    -webkit-flex: 4;
    -ms-flex: 4;
    flex: 4
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-texttime .ym-groupBuylist-bodylist-texttimekLeft .ym-mineTicket-bodylist-texttimeSpan[data-v-0b2ac2ce] {
    color: #f5a623
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-texttime .ym-groupBuylist-bodylist-texttimekRight[data-v-0b2ac2ce] {
    font-size: .24rem;
    color: #fb403d;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-bodylist-texttime .ym-groupBuylist-bodylist-texttimekRight_[data-v-0b2ac2ce] {
    font-size: .24rem;
    color: #666;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist > li .ym-groupBuylist-omplimentary[data-v-0b2ac2ce] {
    width: .64rem;
    height: .7rem;
    font-size: .28rem;
    color: #fff;
    background: linear-gradient(-147.8deg, #fffd94, #ff1f1f);
    line-height: .7rem;
    text-indent: .25rem;
    position: absolute;
    bottom: 0;
    right: 0;
    border-radius: .7rem 0 0 0
  }

  .ym-groupBuylist .ym-groupBuylist-main .ym-groupBuylist-body .ym-groupBuylist-bodylist .ym-voteList-loadMore[data-v-0b2ac2ce] {
    height: 1rem;
    width: 100%;
    color: #000;
    text-align: center;
    font-size: .24rem;
    line-height: 1rem
  }

  .maskmail[data-v-b0f7c802] {
    margin: 4rem auto;
    width: 6.2rem;
    height: 4.8rem;
    background: #fff;
    text-align: center;
    border-radius: .1rem
  }

  .maskmail .img[data-v-b0f7c802] {
    position: relative;
    width: 100%;
    height: .73rem
  }

  .maskmail .img img[data-v-b0f7c802] {
    position: absolute;
    width: 1.98rem;
    height: 2.05rem;
    left: 35%;
    top: -1.1rem
  }

  .maskmail .img i[data-v-b0f7c802] {
    position: absolute;
    right: .15rem;
    text-align: right;
    font-size: .55rem;
    color: #ccc;
    top: .1rem;
    font-style: inherit
  }

  .maskmail input[data-v-b0f7c802] {
    width: 4.8rem;
    height: .88rem;
    padding: .25rem;
    border-radius: 3px;
    border: 1px solid #aaa;
    outline: none;
    font-size: .36rem;
    margin-top: .63rem;
    color: #aaa
  }

  .maskmail .text[data-v-b0f7c802] {
    font-size: .24rem;
    text-align: left;
    padding-left: .7rem;
    margin-top: .2rem;
    color: #aaa
  }

  .maskmail button[data-v-b0f7c802] {
    width: 5.4rem;
    height: .8rem;
    background: #3498db;
    border-radius: .03rem;
    font-size: .34rem;
    border: none;
    color: #fff;
    margin-top: .74rem
  }

  .ym-groupTicket {
    height: 100%;
    overflow: hidden;
    background: #2b2b2b
  }

  .ym-groupTicket .ym-groupTicket-main {
    height: calc(100% - .89rem);
    overflow: hidden;
    width: 100%
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content {
    height: 100%;
    overflow-y: auto;
    margin: .29rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg {
    position: relative;
    height: 7.9rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .mint-swipe {
    overflow: initial
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .mint-swipe .mint-swipe, .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .mint-swipe .mint-swipe-items-wrap {
    overflow: initial !important
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader {
    height: 2.6rem;
    background-image: url("/static/images/icon_shiney/backc.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    padding: .44rem .3rem .38rem;
    overflow: hidden
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader {
      background-image: url("/static/images/icon_shiney/backc@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader {
      background-image: url("/static/images/icon_shiney/backc@3x.png")
    }
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader .ym-groupTicket-contentheaderP {
    font-size: .36rem;
    color: #fff;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader .ym-groupTicket-contentheaderAdress {
    font-size: .28rem;
    margin-top: .15rem;
    color: #fff;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    display: -webkit-box !important;
    -webkit-line-clamp: 2;
    -moz-box-orient: vertical;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -moz-box-direction: normal;
    word-break: break-all;
    padding: .05rem 0
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader .ym-groupTicket-contentheaderAdress > i {
    margin-right: .18rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader .ym-groupTicket-contentheaderTime {
    font-size: .28rem;
    color: #fff;
    margin-top: .14rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader .ym-groupTicket-contentheaderTime > i {
    margin-right: .18rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader .ym-groupTicket-contentheaderTime .ym-groupTicket-contentheaderSpan {
    font-size: .15rem;
    color: #fff
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentheader .ym-groupTicket-contentheaderTime .ym-groupTicket-contentheaderSpan .chlid {
    font-size: .4rem;
    color: #fff
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody {
    height: 5.32rem;
    padding: .2rem .3rem .28rem;
    background: #fff
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBodyHeader {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    -webkit-justify-content: space-between;
    -moz-justify-content: space-between;
    -ms-justify-content: space-between;
    -o-justify-content: space-between;
    justify-content: space-between
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBodyHeader .ym-groupTicket-contentBodyHeader-Left {
    font-size: .34rem;
    color: #2e2e2e;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0;
    flex: 2
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBodyHeader .ym-groupTicket-contentBodyHeader-Left > i {
    font-size: .35rem;
    margin-right: .18rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBodyHeader .ym-groupTicket-contentBodyHeader-Right {
    font-size: .34rem;
    color: #2e2e2e
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBodyHeader .ym-groupTicket-contentBodyHeader-Right > i {
    margin-left: .18rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-chair {
    text-align: right;
    font-size: .24rem;
    color: #2e2e2e;
    margin-top: .1rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-img {
    width: 100%;
    height: 2.56rem;
    text-align: center;
    position: relative
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-img > img {
    width: 2.56rem;
    height: 2.56rem;
    text-align: center
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-img .ym-groupTicket-contentBody-imgSuccess {
    width: 2.56rem;
    height: 2.56rem;
    position: absolute;
    z-index: 3;
    background: hsla(0, 0%, 100%, .8);
    top: 0;
    left: calc(50% - 1.28rem)
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-img .ym-groupTicket-contentBody-imgSuccess .ym-groupTicket-contentBody-imgSuccessIMG {
    width: .72rem;
    height: .72rem;
    background-image: url("/static/images/icon_shiney/ic_wdcj_right_default.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    text-align: center;
    display: inline-block;
    margin-top: .72rem
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-img .ym-groupTicket-contentBody-imgSuccess .ym-groupTicket-contentBody-imgSuccessIMG {
      background-image: url("/static/images/icon_shiney/ic_wdcj_right_default@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-img .ym-groupTicket-contentBody-imgSuccess .ym-groupTicket-contentBody-imgSuccessIMG {
      background-image: url("/static/images/icon_shiney/ic_wdcj_right_default@3x.png")
    }
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-img .ym-groupTicket-contentBody-imgSuccess .ym-groupTicket-contentBody-imgSuccessP {
    text-align: center;
    margin-top: .24rem;
    font-size: .34rem;
    color: #1fa2ff
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-number {
    font-size: .34rem;
    color: #2e2e2e;
    text-align: center
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBody .ym-groupTicket-contentBody-text {
    font-size: .28rem;
    color: #2e2e2e;
    text-align: center;
    margin-top: .2rem
  }

  .ym-groupTicket .ym-groupTicket-main .ym-groupTicket-content .loopImg .ym-groupTicket-contentBodyButton {
    position: absolute;
    bottom: -2rem
  }

  .ym-groupTicket .bodyMask {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    position: absolute;
    z-index: 5;
    width: 100%;
    left: 0;
    top: 0;
    bottom: 0;
    background: rgba(0, 0, 0, .7)
  }

  .maskmail[data-v-4879235e] {
    right: .5rem;
    width: 3.76rem;
    height: 3.1rem;
    background-image: url("/static/images/icon_shiney/fx.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    position: absolute
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .maskmail[data-v-4879235e] {
      background-image: url("/static/images/icon_shiney/fx@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .maskmail[data-v-4879235e] {
      background-image: url("/static/images/icon_shiney/fx@3x.png")
    }
  }

  .maskmail .maskmailtab-button[data-v-4879235e] {
    position: absolute;
    background: none;
    font-size: .24rem;
    color: #fff;
    top: 5.66rem;
    border: none;
    width: 100%
  }

  .ym-vgroupManagement[data-v-1cd79bfa] {
    height: 100%;
    width: 100%;
    background: #fff;
    overflow: hidden
  }

  .ym-vgroupManagement .ym-vgroupManagement-body[data-v-1cd79bfa] {
    height: calc(100% - .89rem);
    overflow: hidden;
    width: 100%
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header[data-v-1cd79bfa] {
    height: 1.5rem;
    width: 100%;
    background: #fff;
    box-shadow: 0 4px 8px 0 hsla(0, 0%, 91%, .13);
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding: .44rem 0;
    font-size: .24rem
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header .ym-vgroupManagement-header-tags[data-v-1cd79bfa] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: center;
    position: relative
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header .ym-vgroupManagement-header-tags[data-v-1cd79bfa]:first-child, .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header .ym-vgroupManagement-header-tags[data-v-1cd79bfa]:nth-child(2), .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header .ym-vgroupManagement-header-tags[data-v-1cd79bfa]:nth-child(3) {
    border-right: .02rem solid #efefef
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-main[data-v-1cd79bfa] {
    border-top: .2rem solid #f7f7f7;
    background: #fff;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
    padding-bottom: .72rem
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-main > li[data-v-1cd79bfa] {
    width: 50%;
    background: #fff;
    text-align: center;
    padding-top: .72rem;
    font-size: .32rem
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-main > li > i[data-v-1cd79bfa] {
    font-size: .4rem
  }

  .maskSuccess[data-v-7e320d11] {
    margin: auto;
    width: 5.94rem;
    height: 6.92rem;
    background: hsla(0, 0%, 100%, .5);
    background-image: url("/static/images/icon_shiney/p.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    top: 2.8rem;
    position: relative
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .maskSuccess[data-v-7e320d11] {
      background-image: url("/static/images/icon_shiney/p@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .maskSuccess[data-v-7e320d11] {
      background-image: url("/static/images/icon_shiney/p@3x.png")
    }
  }

  .maskSuccess .maskSuccesstab-img[data-v-7e320d11] {
    position: absolute;
    width: 1.28rem;
    height: 1.28rem;
    top: 2.58rem;
    background: #000;
    left: 2.38rem
  }

  .maskSuccess .maskSuccesstab-button[data-v-7e320d11] {
    position: absolute;
    background: none;
    font-size: .24rem;
    color: #fff;
    top: 5.66rem;
    border: none;
    width: 100%
  }

  .groupActivityDataPage .dataList .item[data-v-489ceb16] {
    margin-bottom: .2rem;
    background: #fff
  }

  .groupActivityDataPage .dataList .item .mainItem[data-v-489ceb16] {
    align-items: center;
    -webkit-align-items: center;
    padding: .2rem .3rem;
    box-shadow: 0 4px 16px 0 #eee
  }

  .groupActivityDataPage .dataList .item .mainItem .avatar[data-v-489ceb16] {
    width: .6rem;
    height: .6rem;
    border-radius: 100%;
    margin-right: .3rem
  }

  .groupActivityDataPage .dataList .item .mainItem .name[data-v-489ceb16] {
    color: #252631;
    font-size: .28rem;
    margin-right: .3rem
  }

  .groupActivityDataPage .dataList .item .mainItem .time[data-v-489ceb16] {
    color: #aaa;
    font-size: .28rem
  }

  .groupActivityDataPage .dataList .item .mainItem .icon[data-v-489ceb16] {
    width: .52rem;
    height: .46rem;
    margin-left: .2rem
  }

  .groupActivityDataPage .dataList .item .expandedItem[data-v-489ceb16] {
    padding: 0 .3rem
  }

  .groupActivityDataPage .dataList .item .expandedItem .item1[data-v-489ceb16] {
    color: #252631;
    font-size: .28rem;
    height: .88rem;
    line-height: .88rem;
    border-top: .01rem solid #eee
  }

  .groupActivityDataPage .dataList .item .expandedItem .item1 p[data-v-489ceb16] {
    margin-left: .5rem
  }

  .groupActivityDataPage .dataList .item .expandedItem .item1 .name[data-v-489ceb16] {
    width: 0;
    margin-left: 0
  }

  .groupActivityDataPage .footer[data-v-489ceb16] {
    height: .9rem
  }

  .groupActivityDataPage .footer a[data-v-489ceb16] {
    height: .9rem;
    line-height: .9rem;
    text-align: center;
    color: #fff;
    font-size: .32rem;
    background: #1fa2ff
  }

  .groupActivityDataPage .footer .btn-w[data-v-489ceb16] {
    color: #1fa2ff;
    font-size: .32rem;
    background: #fff
  }

  .groupActivityDataPage .footer .btn-b[data-v-489ceb16] {
    color: #fff;
    font-size: .32rem;
    background: #1fa2ff
  }

  .myVoteListPage[data-v-6afe83b0] {
    background: #f6f6f6
  }

  .myVoteListPage .header[data-v-6afe83b0] {
    top: 0;
    left: 0;
    width: 100%;
    position: fixed
  }

  .myVoteListPage .filters[data-v-6afe83b0] {
    position: fixed;
    top: .89rem;
    left: 0;
    width: 100%;
    background: #fff;
    font-size: .28rem;
    padding: .6rem 0;
    border: 1px solid #1fa2ff
  }

  .myVoteListPage .filters .selected[data-v-6afe83b0] {
    color: #fff;
    margin-left: .24rem;
    background: #1fa2ff;
    padding: .1rem .5rem;
    border-radius: .08rem
  }

  .myVoteListPage .filters .unSelected[data-v-6afe83b0] {
    color: #1fa2ff;
    background: #fff;
    margin-left: .24rem;
    padding: .1rem .5rem;
    border-radius: .08rem;
    border: 1px solid #1fa2ff
  }

  .myVoteListPage .switchBtns[data-v-6afe83b0] {
    font-size: .34rem;
    text-align: center;
    background: #fff;
    padding: .3rem 0;
    justify-content: center;
    -webkit-justify-content: center;
    box-shadow: 0 2px 0 1px hsla(0, 0%, 91%, .2)
  }

  .myVoteListPage .switchBtns .selected[data-v-6afe83b0] {
    color: #fff;
    padding: .15rem .5rem;
    border-radius: .36rem;
    background: url("/static/images/icon_shiney/Rect@2x.png") no-repeat 50%
  }

  .myVoteListPage .switchBtns .unSelected[data-v-6afe83b0] {
    color: #ababab
  }

  .myVoteListPage .switchBtns .switch[data-v-6afe83b0] {
    height: .72rem;
    line-height: .72rem
  }

  .myVoteListPage .list[data-v-6afe83b0] {
    margin-top: 2.2rem;
    margin-bottom: 1rem
  }

  .myVoteListPage .list .listItem[data-v-6afe83b0] {
    background: #fff;
    margin-top: .2rem;
    padding: .3rem .3rem .2rem
  }

  .myVoteListPage .list .listItem img[data-v-6afe83b0] {
    width: 2.54rem;
    height: 1.44rem;
    margin-right: .3rem
  }

  .myVoteListPage .list .listItem .name[data-v-6afe83b0] {
    color: #2e2e2e;
    font-weight: 500;
    font-size: .26rem;
    max-height: .72rem;
    line-height: .36rem;
    overflow: hidden;
    word-break: break-all;
    text-overflow: ellipsis
  }

  .myVoteListPage .list .listItem .personNum[data-v-6afe83b0] {
    color: #ababab;
    font-weight: 400;
    font-size: .24rem;
    margin-top: .2rem
  }

  .myVoteListPage .list .listItem .statusLine[data-v-6afe83b0] {
    margin-top: .2rem;
    justify-content: space-between;
    -webkit-justify-content: space-between
  }

  .myVoteListPage .list .listItem .statusLine .endTime[data-v-6afe83b0] {
    color: #606060;
    font-weight: 400;
    font-size: .24rem
  }

  .myVoteListPage .list .listItem .statusLine .status[data-v-6afe83b0] {
    color: #ababab;
    font-weight: 400;
    font-size: .24rem
  }

  .ym-voteData-body[data-v-e2b818e2] {
    height: 100%;
    width: 100%;
    overflow: hidden;
    background: #f6f6f6
  }

  .ym-voteData-body .my-header-a[data-v-e2b818e2] {
    color: #000;
    font-size: .32rem
  }

  .ym-voteData-body .ym-voteData-warrp[data-v-e2b818e2] {
    height: calc(100% - .89rem);
    overflow: hidden;
    width: 100%
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main[data-v-e2b818e2] {
    font-size: .24rem
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li[data-v-e2b818e2] {
    margin-top: .28rem;
    background: #fff
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list[data-v-e2b818e2] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    height: 1.26rem;
    width: 100%;
    padding: .3rem;
    position: relative
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list img[data-v-e2b818e2] {
    width: .66rem;
    height: .66rem;
    border-radius: 100%
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list .icon-down[data-v-e2b818e2] {
    width: .3rem;
    height: .18rem;
    align-self: center
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list .ym-voteData-main-li-list-call[data-v-e2b818e2], .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list .ym-voteData-main-li-list-name[data-v-e2b818e2] {
    line-height: .66rem;
    margin-left: .2rem;
    color: #333;
    font-size: .24rem;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list .ym-voteData-main-li-list-call[data-v-e2b818e2] {
    text-align: right
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list .ym-voteData-main-li-list-time[data-v-e2b818e2] {
    line-height: .66rem;
    margin: 0 .2rem;
    color: #aaa;
    text-align: right;
    font-size: .2rem;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-list .transformi[data-v-e2b818e2] {
    transform: rotate(180deg);
    -ms-transform: rotate(180deg);
    -moz-transform: rotate(180deg);
    -webkit-transform: rotate(180deg);
    -o-transform: rotate(180deg)
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-content[data-v-e2b818e2] {
    width: 100%;
    background: #fff;
    position: relative
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-content .ym-voteData-main-li-list-li[data-v-e2b818e2] {
    padding: .29rem .32rem
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-main-li .ym-voteData-main-li-content[data-v-e2b818e2]:before {
    content: " ";
    position: absolute;
    left: 0;
    top: 0;
    width: 100%;
    height: 1px;
    border-top: 1px solid #f0f0f0;
    -webkit-transform-origin: 0 0;
    transform-origin: 0 0;
    -webkit-transform: scaleY(.2);
    transform: scaleY(.2)
  }

  .ym-voteData-body .ym-voteData-warrp .ym-voteData-main .ym-voteData-loadMore[data-v-e2b818e2] {
    height: 1rem;
    width: 100%;
    color: #000;
    text-align: center;
    font-size: .24rem;
    line-height: 1rem
  }

  .ym-voteManagement[data-v-45601d54] {
    height: 100%;
    width: 100%;
    background: #fff;
    overflow: hidden
  }

  .ym-voteManagement .ym-voteManagement-body[data-v-45601d54] {
    height: calc(100% - .89rem);
    overflow: hidden;
    width: 100%
  }

  .ym-voteManagement .ym-voteManagement-body .ym-voteManagement-header[data-v-45601d54] {
    height: 1.5rem;
    width: 100%;
    background: #fff;
    box-shadow: 0 4px 8px 0 hsla(0, 0%, 91%, .13);
    display: flex;
    padding: .44rem 0;
    font-size: .24rem
  }

  .ym-voteManagement .ym-voteManagement-body .ym-voteManagement-header .ym-voteManagement-header-tags[data-v-45601d54] {
    flex: 1;
    text-align: center;
    position: relative
  }

  .ym-voteManagement .ym-voteManagement-body .ym-voteManagement-header .ym-voteManagement-header-tags[data-v-45601d54]:first-child, .ym-voteManagement .ym-voteManagement-body .ym-voteManagement-header .ym-voteManagement-header-tags[data-v-45601d54]:nth-child(2) {
    border-right: .02rem solid #efefef
  }

  .ym-voteManagement .ym-voteManagement-body .ym-voteManagement-main[data-v-45601d54] {
    border-top: .2rem solid #f7f7f7;
    background: #fff;
    display: -webkit-flex;
    display: flex;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
    padding-bottom: .72rem
  }

  .ym-voteManagement .ym-voteManagement-body .ym-voteManagement-main > li[data-v-45601d54] {
    width: 50%;
    background: #fff;
    text-align: center;
    padding-top: .72rem;
    font-size: .32rem
  }

  .ym-voteManagement .ym-voteManagement-body .ym-voteManagement-main > li > i[data-v-45601d54] {
    font-size: .4rem
  }

  .ym-crowdFundingLIst {
    height: 100%;
    width: 100%;
    background: #f7f7f7;
    overflow: hidden
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-header {
    position: absolute;
    z-index: 2;
    display: flex;
    padding-bottom: 1rem;
    border: .02rem solid #f8662b;
    background: #fff;
    font-size: .28rem;
    width: 100%;
    border-top: none;
    top: .89rem;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-header > li {
    height: .54rem;
    width: 1.62rem;
    font-size: .28rem;
    text-align: center;
    color: #f94233;
    border: .02rem solid #f8662b;
    line-height: .54rem;
    margin-top: .74rem;
    margin-left: .2rem
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-header .Release {
    float: left;
    width: 22.5%;
    height: .54rem;
    margin-left: 2%;
    margin-top: .44rem
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-header .hoverstyle {
    color: #fff;
    background: #f94233
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-top {
    background: #fff;
    height: 1.32rem;
    width: 100%;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    position: relative;
    -webkit-justify-content: space-around;
    justify-content: space-around
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-top .ym-crowdFundingLIst-toptags {
    background-size: 100% 100%;
    font-size: .34rem;
    width: 2rem;
    height: .72rem;
    text-align: center;
    line-height: .72rem;
    margin-top: .34rem;
    color: #ababab
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-top .hovertoptags {
    background-image: url("/static/images/icon_shiney/Rectangle Copy.png");
    background-repeat: no-repeat;
    color: #fff
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-crowdFundingLIst .ym-crowdFundingLIst-top .hovertoptags {
      background-image: url("/static/images/icon_shiney/Rectangle Copy@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-crowdFundingLIst .ym-crowdFundingLIst-top .hovertoptags {
      background-image: url("/static/images/icon_shiney/Rectangle Copy@3x.png")
    }
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main {
    font-size: 0;
    height: calc(100% - 2.23rem);
    padding-bottom: .3rem;
    overflow: hidden
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body {
    width: 100%;
    height: 100%
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li {
    padding: .3rem;
    position: relative;
    margin-top: .2rem;
    width: 100%;
    height: 2.5rem;
    background: #fff
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-header {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-header .ym-crowdFundingLIst-bodylist-img {
    width: 2.54rem;
    height: 1.44rem
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-header .ym-crowdFundingLIst-bodylist-text {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-size: .24rem;
    margin-left: .2rem;
    height: 1.44rem;
    overflow: hidden
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-header .ym-crowdFundingLIst-bodylist-text .ym-crowdFundingLIst-bodylist-textp {
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0;
    font-size: .26rem;
    color: #2e2e2e
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-header .ym-crowdFundingLIst-bodylist-text .ym-crowdFundingLIst-bodylist-textadress {
    margin-top: .7rem;
    color: #ababab;
    font-size: .24rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-header .ym-crowdFundingLIst-bodylist-text .ym-crowdFundingLIst-bodylist-textadress .ym-crowdFundingLIst-bodylist-texttimekRight {
    font-size: .24rem;
    color: #ff4800;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-header .ym-crowdFundingLIst-bodylist-text .ym-crowdFundingLIst-bodylist-textadress .ym-crowdFundingLIst-bodylist-texttimekRight_ {
    font-size: .24rem;
    color: #666;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-texttime {
    color: #ababab;
    font-size: .24rem;
    margin-top: .3rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-texttime .ym-crowdFundingLIst-bodylist-texttimekLeft {
    font-size: .24rem;
    color: #ababab;
    -webkit-box-flex: 4;
    -moz-box-flex: 4;
    -webkit-flex: 4;
    -ms-flex: 4;
    flex: 4
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-texttime .ym-crowdFundingLIst-bodylist-texttimekLeft .ym-mineTicket-bodylist-texttimeSpan {
    color: #f5a623
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-texttime .ym-crowdFundingLIst-bodylist-texttimekRight {
    font-size: .24rem;
    color: #ababab;
    width: 100%;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    -webkit-justify-content: space-between;
    justify-content: space-between;
    display: flex
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-texttime .ym-crowdFundingLIst-bodylist-texttimekRight > span {
    flex: 1;
    display: inline-block
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-texttime .ym-crowdFundingLIst-bodylist-texttimekRight > span:nth-child(2) {
    text-align: right
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-bodylist-texttime .ym-crowdFundingLIst-bodylist-texttimekRight_ {
    font-size: .24rem;
    color: #666;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist > li .ym-crowdFundingLIst-omplimentary {
    width: .64rem;
    height: .7rem;
    font-size: .28rem;
    color: #fff;
    background: linear-gradient(-147.8deg, #fffd94, #ff1f1f);
    line-height: .7rem;
    text-indent: .25rem;
    position: absolute;
    bottom: 0;
    right: 0;
    border-radius: .7rem 0 0 0
  }

  .ym-crowdFundingLIst .ym-crowdFundingLIst-main .ym-crowdFundingLIst-body .ym-crowdFundingLIst-bodylist .ym-voteList-loadMore {
    height: 1rem;
    width: 100%;
    color: #000;
    text-align: center;
    font-size: .24rem;
    line-height: 1rem
  }

  .ypl-cssRound-wrap {
    margin-left: .8rem;
    position: relative;
    width: 1.1rem;
    height: 1.1rem;
    border-radius: 50%;
    background: #ccc;
    text-align: center
  }

  .ypl-cssRound-wrap .right-part, .ypl-cssRound-wrap .right-part .right {
    width: 1.1rem;
    height: 1.1rem;
    position: absolute;
    clip: rect(0, auto, auto, .6rem)
  }

  .ypl-cssRound-wrap .right-part .right {
    border-radius: 50%;
    background: #2bc3c5
  }

  .ypl-cssRound-wrap .right-part .r-shadow {
    width: 9rem;
    height: 9rem;
    border-radius: 50%;
    background: #fff;
    position: absolute;
    left: .1rem;
    top: .1rem
  }

  .ypl-cssRound-wrap .left-part {
    width: 1.1rem;
    height: 1.1rem;
    position: absolute;
    clip: rect(0, 1rem, auto, 0)
  }

  .ypl-cssRound-wrap .left-part .left {
    width: 1.1rem;
    height: 1.1rem;
    position: absolute;
    border-radius: 50%;
    background: #2bc3c5;
    clip: rect(0, .6rem, auto, 0)
  }

  .ypl-cssRound-wrap .left-part .l-shadow {
    width: .9rem;
    height: .9rem;
    border-radius: 50%;
    background: #fff;
    position: absolute;
    left: .1rem;
    top: .1rem
  }

  .ypl-cssRound-wrap #desc {
    display: inline-block;
    width: 1.1rem;
    height: 1.1rem;
    line-height: 1.1rem;
    font-size: .28rem;
    position: absolute;
    left: 0
  }

  .ypl-crowdFundingMyJoin-main {
    height: 100%;
    width: 100%;
    overflow: hidden;
    background: #f6f6f6
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-main-top {
    background: #fff
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content {
    margin-top: .2rem;
    width: 100%;
    overflow: hidden
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-header {
    height: 1.7rem;
    width: 100%;
    background: #fff;
    box-shadow: 0 4px 8px 0 hsla(0, 0%, 91%, .13);
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding: .44rem 0;
    font-size: .24rem
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-header .ypl-crowdFundingMyJoin-content-header-tags {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: center;
    position: relative
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-header .ypl-crowdFundingMyJoin-content-header-tags:first-child {
    border-right: .02rem solid #efefef
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-content-list {
    background: #fff;
    margin-top: .2rem;
    padding: 0 .3rem .55rem
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-content-list > li {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding-top: .55rem
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-content-list > li .ypl-crowdFundingMyJoin-content-content-list-left {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-size: .24rem;
    text-align: right;
    color: #999
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-content-list > li .ypl-crowdFundingMyJoin-content-content-list-right {
    -webkit-box-flex: 3;
    -moz-box-flex: 3;
    -webkit-flex: 3;
    -ms-flex: 3;
    flex: 3;
    font-size: .28rem;
    margin-left: .35rem;
    color: #333
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-progress {
    margin-top: .3rem;
    background: #fff;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    font-size: .24rem
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-progress .ypl-crowdFundingMyJoin-content-progress-left {
    padding: .2rem 0;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1
  }

  .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-progress .ypl-crowdFundingMyJoin-content-progress-middle, .ypl-crowdFundingMyJoin-main .ypl-crowdFundingMyJoin-content .ypl-crowdFundingMyJoin-content-progress .ypl-crowdFundingMyJoin-content-progress-right {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: center;
    padding: .41rem 0
  }

  .ym-vgroupManagement[data-v-70741216] {
    height: 100%;
    width: 100%;
    background: #fff;
    overflow: hidden
  }

  .ym-vgroupManagement .ym-vgroupManagement-body[data-v-70741216] {
    height: calc(100% - .89rem);
    overflow: hidden;
    width: 100%
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header[data-v-70741216] {
    height: 1.5rem;
    width: 100%;
    background: #fff;
    box-shadow: 0 4px 8px 0 hsla(0, 0%, 91%, .13);
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding: .44rem 0;
    font-size: .24rem
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header .ym-vgroupManagement-header-tags[data-v-70741216] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: center;
    position: relative
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header .ym-vgroupManagement-header-tags[data-v-70741216]:first-child, .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-header .ym-vgroupManagement-header-tags[data-v-70741216]:nth-child(2) {
    border-right: .02rem solid #efefef
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-main[data-v-70741216] {
    border-top: .2rem solid #f7f7f7;
    background: #fff;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
    padding-bottom: .72rem
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-main > li[data-v-70741216] {
    width: 50%;
    background: #fff;
    text-align: center;
    padding-top: .72rem;
    font-size: .32rem
  }

  .ym-vgroupManagement .ym-vgroupManagement-body .ym-vgroupManagement-main > li > i[data-v-70741216] {
    font-size: .4rem
  }

  .ym-activitylist[data-v-d4690c40] {
    height: 100%;
    width: 100%;
    overflow: hidden
  }

  .ym-activitylist .ym-activitylist-main[data-v-d4690c40] {
    width: 100%;
    padding-left: 0;
    background: #fff;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    overflow: hidden
  }

  .ym-activitylist .ym-activitylist-main .list[data-v-d4690c40] {
    width: 100%;
    background: #fff;
    padding: 0 .3rem
  }

  .ym-activitylist .ym-activitylist-main .list li.list-crowdfunding-header[data-v-d4690c40] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding-top: .32rem
  }

  .ym-activitylist .ym-activitylist-main .list li.list-crowdfunding-header > div[data-v-d4690c40] {
    -webkit-box-flex: 2;
    -moz-box-flex: 2;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
    color: #999;
    font-size: .24rem;
    text-align: left;
    padding-right: .15rem
  }

  .ym-activitylist .ym-activitylist-main .list li.list-crowdfunding-header > div.num[data-v-d4690c40] {
    flex: 1
  }

  .ym-activitylist .ym-activitylist-main .list li.list-crowdfunding-header-content[data-v-d4690c40] {
    margin-top: .5rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ym-activitylist .ym-activitylist-main .list li.list-crowdfunding-header-content > div[data-v-d4690c40] {
    -webkit-box-flex: 2;
    -moz-box-flex: 2;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
    padding-right: .15rem;
    color: #333;
    font-size: .28rem;
    text-align: left;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ym-activitylist .ym-activitylist-main .list li.list-crowdfunding-header-content > div.num[data-v-d4690c40] {
    flex: 1
  }

  .ypl-personal-center .banner[data-v-5d24e163] {
    position: relative;
    height: 4.85rem;
    background: url("/static/images/personal-center-bg.png") bottom no-repeat #1fa2ff;
    background-size: 100%;
    background-color: #1fa2ff
  }

  @media (-o-min-device-pixel-ratio: 3/2),(-webkit-min-device-pixel-ratio: 1.5),(min--moz-device-pixel-ratio: 1.5),(min-resolution: 1.5dppx) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@2x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-resolution: 2 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@2x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-resolution: 3 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@3x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 4),(min-resolution: 4 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@4x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 5),(min-resolution: 5 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@5x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 6),(min-resolution: 6 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@6x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 7),(min-resolution: 7 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@7x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 8),(min-resolution: 8 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@8x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 9),(min-resolution: 9 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@9x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 10),(min-resolution: 10 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@10x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 11),(min-resolution: 11 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@11x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 12),(min-resolution: 12 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@12x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 13),(min-resolution: 13 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@13x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 14),(min-resolution: 14 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@14x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 15),(min-resolution: 15 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@15x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 16),(min-resolution: 16 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@16x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 17),(min-resolution: 17 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@17x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 18),(min-resolution: 18 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@18x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 19),(min-resolution: 19 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@19x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 20),(min-resolution: 20 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@20x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 21),(min-resolution: 21 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@21x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 22),(min-resolution: 22 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@22x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 23),(min-resolution: 23 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@23x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 24),(min-resolution: 24 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@24x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 25),(min-resolution: 25 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@25x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 26),(min-resolution: 26 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@26x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 27),(min-resolution: 27 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@27x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 28),(min-resolution: 28 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@28x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 29),(min-resolution: 29 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@29x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 30),(min-resolution: 30 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@30x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 31),(min-resolution: 31 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@31x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 32),(min-resolution: 32 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@32x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 33),(min-resolution: 33 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@33x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 34),(min-resolution: 34 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@34x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 35),(min-resolution: 35 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@35x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 36),(min-resolution: 36 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@36x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 37),(min-resolution: 37 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@37x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 38),(min-resolution: 38 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@38x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 39),(min-resolution: 39 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@39x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 40),(min-resolution: 40 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@40x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 41),(min-resolution: 41 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@41x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 42),(min-resolution: 42 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@42x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 43),(min-resolution: 43 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@43x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 44),(min-resolution: 44 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@44x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 45),(min-resolution: 45 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@45x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 46),(min-resolution: 46 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@46x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 47),(min-resolution: 47 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@47x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 48),(min-resolution: 48 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@48x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 49),(min-resolution: 49 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@49x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 50),(min-resolution: 50 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@50x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 51),(min-resolution: 51 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@51x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 52),(min-resolution: 52 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@52x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 53),(min-resolution: 53 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@53x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 54),(min-resolution: 54 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@54x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 55),(min-resolution: 55 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@55x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 56),(min-resolution: 56 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@56x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 57),(min-resolution: 57 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@57x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 58),(min-resolution: 58 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@58x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 59),(min-resolution: 59 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@59x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 60),(min-resolution: 60 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@60x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 61),(min-resolution: 61 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@61x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 62),(min-resolution: 62 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@62x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 63),(min-resolution: 63 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@63x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 64),(min-resolution: 64 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@64x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 65),(min-resolution: 65 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@65x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 66),(min-resolution: 66 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@66x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 67),(min-resolution: 67 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@67x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 68),(min-resolution: 68 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@68x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 69),(min-resolution: 69 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@69x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 70),(min-resolution: 70 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@70x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 71),(min-resolution: 71 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@71x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 72),(min-resolution: 72 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@72x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 73),(min-resolution: 73 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@73x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 74),(min-resolution: 74 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@74x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 75),(min-resolution: 75 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@75x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 76),(min-resolution: 76 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@76x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 77),(min-resolution: 77 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@77x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 78),(min-resolution: 78 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@78x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 79),(min-resolution: 79 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@79x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 80),(min-resolution: 80 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@80x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 81),(min-resolution: 81 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@81x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 82),(min-resolution: 82 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@82x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 83),(min-resolution: 83 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@83x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 84),(min-resolution: 84 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@84x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 85),(min-resolution: 85 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@85x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 86),(min-resolution: 86 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@86x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 87),(min-resolution: 87 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@87x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 88),(min-resolution: 88 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@88x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 89),(min-resolution: 89 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@89x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 90),(min-resolution: 90 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@90x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 91),(min-resolution: 91 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@91x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 92),(min-resolution: 92 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@92x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 93),(min-resolution: 93 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@93x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 94),(min-resolution: 94 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@94x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 95),(min-resolution: 95 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@95x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 96),(min-resolution: 96 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@96x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 97),(min-resolution: 97 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@97x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 98),(min-resolution: 98 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@98x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 99),(min-resolution: 99 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@99x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  @media (-webkit-min-device-pixel-ratio: 100),(min-resolution: 100 *96dpi) {
    .ypl-personal-center .banner[data-v-5d24e163] {
      background: url(/static/images/personal-center-bg@100x.png) bottom no-repeat #1fa2ff;
      background-size: 100%
    }
  }

  .ypl-personal-center .banner .msg[data-v-5d24e163] {
    width: .4rem;
    height: .4rem;
    top: .4rem;
    right: .4rem;
    position: absolute
  }

  .ypl-personal-center .banner .msg-unread[data-v-5d24e163] {
    width: .5rem;
    height: .5rem;
    top: .3rem;
    right: .3rem;
    position: absolute
  }

  .ypl-personal-center .banner .center[data-v-5d24e163] {
    align-items: center;
    -webkit-align-items: center;
    text-align: center
  }

  .ypl-personal-center .banner .center .avatar img[data-v-5d24e163] {
    width: 1.4rem;
    height: 1.4rem;
    border-radius: 50%;
    border: 2px solid #fff;
    margin-top: 1rem
  }

  .ypl-personal-center .banner .center .unlogin-button[data-v-5d24e163] {
    border: 1px solid #fff;
    color: #fff;
    height: .58rem;
    border-radius: .04rem
  }

  .ypl-personal-center .cell-mine[data-v-5d24e163] {
    height: 1rem;
    align-items: center;
    -webkit-align-items: center;
    background: #fff;
    padding: 0 .3rem;
    position: relative
  }

  .ypl-personal-center .cell-mine[data-v-5d24e163]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-personal-center .cell-mine[data-v-5d24e163]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-personal-center .cell-mine[data-v-5d24e163]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-personal-center .cell-mine i[data-v-5d24e163], .ypl-personal-center .cell-mine img[data-v-5d24e163] {
    width: .4rem;
    height: .4rem;
    margin-right: .3rem
  }

  .ypl-personal-center .cell-mine .text[data-v-5d24e163] {
    font-size: .3rem;
    color: #2e2e2e;
    background: url("/static/images/rightArrow@2x.png") 100% no-repeat;
    background-size: .14rem .25rem
  }

  .msgHomePage[data-v-70b0d692] {
    background: #fff;
    padding: 0 .3rem
  }

  .msgHomePage .msgItem[data-v-70b0d692] {
    padding: .3rem 0;
    box-shadow: 0 1px 0 0 #eee
  }

  .msgHomePage .msgItem .penglai[data-v-70b0d692], .msgHomePage .msgItem img[data-v-70b0d692] {
    width: .9rem;
    height: .9rem;
    margin-right: .45rem;
    align-self: center
  }

  .msgHomePage .msgItem .penglai[data-v-70b0d692] {
    line-height: .8rem;
    color: #fff;
    font-size: .32rem;
    text-align: center;
    border-radius: 50%;
    background: linear-gradient(211deg, #04befe, #4481eb)
  }

  .msgHomePage .msgItem .avatar[data-v-70b0d692] {
    width: .9rem;
    height: .9rem;
    position: relative;
    align-self: center;
    margin-right: .45rem
  }

  .msgHomePage .msgItem .avatar img[data-v-70b0d692] {
    border-radius: 50%
  }

  .msgHomePage .msgItem .avatar .vip[data-v-70b0d692] {
    width: .32rem;
    height: .32rem;
    right: -.5rem;
    bottom: 0;
    position: absolute
  }

  .msgHomePage .msgItem .content[data-v-70b0d692] {
    width: 0;
    margin-right: .3rem
  }

  .msgHomePage .msgItem .title[data-v-70b0d692] {
    color: #2e2e2e;
    font-size: .28rem;
    align-self: center;
    min-height: .4rem;
    max-height: .8rem;
    line-height: .4rem
  }

  .msgHomePage .msgItem .desc[data-v-70b0d692] {
    height: .34rem;
    line-height: .34rem;
    color: #ababab;
    font-size: .24rem;
    margin-top: .16rem
  }

  .msgHomePage .msgItem .date[data-v-70b0d692] {
    color: #ababab;
    font-size: .24rem;
    text-align: right
  }

  .msgHomePage .msgItem .badge[data-v-70b0d692] {
    color: #fff;
    font-size: .2rem;
    margin-top: .2rem;
    background: #fd6369;
    border-radius: .2rem;
    padding: .1rem .15rem;
    float: right
  }

  .sysMsgList[data-v-c85482ae] {
    margin: .9rem 0;
    padding: 0 .3rem;
    background: #fff
  }

  .sysMsgList .item[data-v-c85482ae] {
    padding: .3rem 0;
    box-shadow: 0 1px 0 0 #eee
  }

  .sysMsgList .item .redPoint[data-v-c85482ae] {
    width: .1rem;
    height: .1rem;
    border-radius: 50%;
    align-self: center;
    margin-right: .14rem;
    background: #f94b6d
  }

  .sysMsgList .item .title[data-v-c85482ae] {
    width: 0;
    color: #2e2e2e;
    font-size: .28rem;
    margin-right: .36rem
  }

  .sysMsgList .item .date[data-v-c85482ae] {
    color: #ababab;
    font-size: .24rem;
    align-self: center
  }

  .sysMsgDetail[data-v-63cef824] {
    background: #fff;
    padding: .3rem .44rem
  }

  .sysMsgDetail h5[data-v-63cef824] {
    color: #333;
    font-size: .42rem;
    text-align: center
  }

  .sysMsgDetail div[data-v-63cef824] {
    color: #108ee9;
    font-size: .28rem;
    margin-top: .4rem
  }

  .sysMsgDetail span[data-v-63cef824] {
    color: #9b9b9b;
    margin-left: .24rem;
    padding-left: .24rem;
    border-left: .01rem solid #9b9b9b
  }

  .sysMsgDetail p[data-v-63cef824] {
    color: #333;
    font-size: .32rem;
    margin-top: .24rem;
    line-height: .64rem;
    word-break: break-all
  }

  .penglaiMsgList[data-v-21508134] {
    padding: .9rem .3rem;
    background: #f6f6f6
  }

  .penglaiMsgList .item .time[data-v-21508134] {
    font-size: 0;
    margin-top: .5rem;
    text-align: center
  }

  .penglaiMsgList .item .time span[data-v-21508134] {
    color: #fff;
    font-size: .24rem;
    border-radius: .08rem;
    padding: .05rem .1rem;
    background: #ccc
  }

  .penglaiMsgList .item .content[data-v-21508134] {
    background: #fff;
    margin-top: .5rem;
    padding: .3rem .4rem;
    border-radius: .08rem;
    border: .01rem solid #eee
  }

  .penglaiMsgList .item .content h5[data-v-21508134] {
    color: #252631;
    font-size: .32rem
  }

  .penglaiMsgList .item .content p[data-v-21508134] {
    color: #ababab;
    font-size: .24rem;
    margin-top: .2rem
  }

  .penglaiMsgList .item .content img[data-v-21508134] {
    width: 100%;
    height: 2.84rem;
    margin-top: .24rem;
    border-radius: .08rem
  }

  .penglaiMsgDetail img[data-v-1bb9575f] {
    width: 100%;
    height: 3.66rem
  }

  .penglaiMsgDetail .content[data-v-1bb9575f] {
    padding: .4rem .44rem;
    background: #fff
  }

  .penglaiMsgDetail .content h5[data-v-1bb9575f] {
    color: #333;
    font-size: .42rem
  }

  .penglaiMsgDetail .content p[data-v-1bb9575f] {
    color: #333;
    margin-top: .4rem;
    font-size: .32rem;
    line-height: .64rem;
    word-break: break-all
  }

  .userMsgDetailPage .msgList .item[data-v-6738f2c2] {
    padding: .3rem .32rem;
    background: #fff;
    border-bottom: .01rem solid #eee
  }

  .userMsgDetailPage .msgList .item img[data-v-6738f2c2] {
    width: .6rem;
    height: .6rem;
    border-radius: 100%;
    margin-right: .32rem
  }

  .userMsgDetailPage .msgList .item .content[data-v-6738f2c2] {
    color: #2e2e2e;
    font-size: .28rem;
    line-height: .4rem;
    word-break: break-all
  }

  .userMsgDetailPage .msgList .item .time[data-v-6738f2c2] {
    color: #ababab;
    font-size: .24rem;
    margin-top: .18rem
  }

  .userMsgDetailPage .consultBtn[data-v-6738f2c2] {
    height: .9rem;
    line-height: .9rem;
    text-align: center;
    color: #fff;
    font-size: .32rem;
    background: #1fa2ff
  }

  .userMsgDetailPage .msgInput[data-v-6738f2c2] {
    background: #fff;
    padding: .12rem 0 .12rem .32rem
  }

  .userMsgDetailPage .msgInput textarea[data-v-6738f2c2] {
    height: 1.32rem;
    font-size: .32rem;
    line-height: .44rem;
    padding: .14rem .24rem;
    background: rgba(0, 0, 0, .03);
    border-radius: .36rem;
    border: .01rem solid rgba(0, 0, 0, .12)
  }

  .userMsgDetailPage .msgInput button[data-v-6738f2c2] {
    color: #1fa2ff;
    font-size: .32rem;
    padding: 0 .36rem;
    background: #fff
  }

  .massMsgList .item[data-v-1bb8f322] {
    align-items: center;
    -webkit-align-items: center;
    padding: .26rem .3rem;
    background: #fff;
    box-shadow: 0 .02rem 0 0 #eee
  }

  .massMsgList .item .checkbox[data-v-1bb8f322] {
    width: .3rem;
    height: .3rem;
    margin-right: .32rem;
    border-radius: 100%
  }

  .massMsgList .item .avatar[data-v-1bb8f322] {
    width: .88rem;
    height: .88rem;
    margin-right: .3rem;
    border-radius: 100%
  }

  .massMsgList .item p[data-v-1bb8f322] {
    width: 0;
    color: #252631;
    font-size: .28rem
  }

  .massMsgFooter .btn-w[data-v-1bb8f322] {
    height: .9rem;
    color: #1fa2ff;
    font-size: .32rem;
    background: #fff
  }

  .massMsgFooter .btn-b[data-v-1bb8f322] {
    height: .9rem;
    color: #fff;
    font-size: .32rem;
    background: #1fa2ff
  }

  .editMassMsgPage[data-v-7751bd90] {
    padding: .3rem;
    background: #fff;
    position: relative
  }

  .editMassMsgPage h6[data-v-7751bd90] {
    color: #333;
    font-size: .3rem;
    font-weight: 500
  }

  .editMassMsgPage textarea[data-v-7751bd90] {
    height: 4.8rem
  }

  .editMassMsgPage input[data-v-7751bd90], .editMassMsgPage textarea[data-v-7751bd90] {
    width: 100%;
    padding: .24rem;
    font-size: .24rem;
    background: #f9f9fd;
    margin-top: .24rem;
    border-radius: .08rem;
    border: .01rem solid rgba(0, 0, 0, .1)
  }

  .editMassMsgPage p[data-v-7751bd90] {
    top: 5.2rem;
    right: .5rem;
    color: #aeaeae;
    font-size: .24rem;
    position: absolute
  }

  .btn-send[data-v-7751bd90] {
    color: #fff;
    height: .8rem;
    line-height: .8rem;
    font-size: .32rem;
    text-align: center;
    margin: .4rem 1.3rem;
    background: #1fa2ff;
    border-radius: .04rem
  }

  .myJoinListPage .filter[data-v-464bc640] {
    position: fixed;
    z-index: 2;
    display: -webkit-box;
    display: -webkit-flex;
    display: flex;
    padding: 0 .24rem;
    border: .02rem solid #1fa2ff;
    background: #fff;
    font-size: .28rem;
    width: 100%;
    top: .89rem
  }

  .myJoinListPage .filter > li[data-v-464bc640] {
    flex: 1;
    color: #1fa2ff;
    padding: .15rem 0;
    font-size: .28rem;
    text-align: center;
    border: .02rem solid #1fa2ff;
    margin: .5rem 0 .5rem .22rem
  }

  .myJoinListPage .filter .switched[data-v-464bc640] {
    color: #fff;
    background: #1fa2ff
  }

  .myJoinListPage .filter > li[data-v-464bc640]:first-child {
    margin-left: 0
  }

  .myJoinListPage .list[data-v-464bc640] {
    padding: .1rem 0;
    background: #f7f7f7
  }

  .myJoinListPage .list .item[data-v-464bc640] {
    position: relative;
    background: #fff;
    padding: .2rem .3rem
  }

  .myJoinListPage .list .item .giftBadge[data-v-464bc640] {
    top: 0;
    right: 0;
    width: .62rem;
    height: .7rem;
    position: absolute
  }

  .myJoinListPage .list .item .thumb[data-v-464bc640] {
    width: 2.54rem;
    height: 1.44rem
  }

  .myJoinListPage .list .item .info[data-v-464bc640] {
    width: 0;
    font-size: .24rem;
    margin-left: .2rem
  }

  .myJoinListPage .list .item .info .promotion[data-v-464bc640] {
    width: .88rem;
    height: .28rem;
    align-self: center;
    margin-right: .1rem
  }

  .myJoinListPage .list .item .info .name[data-v-464bc640] {
    align-self: center;
    padding: .05rem .3rem .05rem 0;
    font-size: .26rem;
    color: #2e2e2e
  }

  .myJoinListPage .list .item .info .time[data-v-464bc640] {
    margin-top: .22rem;
    color: #ababab;
    font-size: .24rem
  }

  .myJoinListPage .list .item .info .itemStatus[data-v-464bc640] {
    color: #333;
    font-size: .24rem;
    margin-top: .22rem;
    justify-content: space-between;
    -webkit-justify-content: space-between
  }

  .myJoinListPage .list .item .info .redColor[data-v-464bc640] {
    color: #c00
  }

  .myJoinListPage .list .item .info .yellowColor[data-v-464bc640] {
    color: #f5a623
  }

  .myJoinListPage .list .item .info .grayColor[data-v-464bc640] {
    color: #ababab
  }

  .myJoinListPage .list .orderNoLine[data-v-464bc640] {
    color: #ababab;
    font-size: .24rem;
    background: #fff;
    padding: .18rem .3rem;
    justify-content: space-between;
    border-top: .01rem solid #f1f1f1
  }

  .myJoinListPage .list .orderNoLine .goToMeeting[data-v-464bc640] {
    color: #1fa2ff
  }

  .ym-showTicket {
    height: 100%;
    overflow: hidden;
    background: #2b2b2b
  }

  .ym-showTicket .ym-showTicket-main {
    height: calc(100% - .89rem);
    overflow: hidden;
    width: 100%
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content {
    height: 100%;
    overflow-y: auto;
    margin: .29rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .mint-swipe {
    height: 7rem;
    overflow: initial;
    position: relative
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .mint-swipe .mint-swipe, .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .mint-swipe .mint-swipe-items-wrap {
    overflow: initial !important
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .mint-swipe .mint-swipe-indicators {
    bottom: -.2rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .mint-swipe .mint-swipe-indicator.is-active {
    opacity: 1;
    background: #1fa2ff
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader {
    background: url(/dist/e3870e9a0238e5bc5494b2ca5d8f5670.svg) no-repeat 50%;
    background-size: cover;
    padding: .44rem .3rem .38rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader .ym-showTicket-contentheaderP {
    font-size: .36rem;
    color: #fff;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader .ym-showTicket-contentheaderAdress {
    font-size: .28rem;
    line-height: .32rem;
    min-height: .32rem;
    max-height: .68rem;
    margin-top: .14rem;
    color: #fff;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    display: -webkit-box !important;
    -webkit-line-clamp: 2;
    -moz-box-orient: vertical;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -moz-box-direction: normal;
    word-break: break-all;
    padding: .05rem 0
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader .ym-showTicket-contentheaderAdress > i {
    font-size: .24rem;
    margin-right: .12rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader .ym-showTicket-contentheaderTime {
    font-size: .28rem;
    color: #fff;
    margin-top: .14rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader .ym-showTicket-contentheaderTime > i {
    font-size: .24rem;
    margin-right: .12rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader .ym-showTicket-contentheaderTime .ym-showTicket-contentheaderSpan {
    font-size: .28rem;
    color: #fff
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentheader .ym-showTicket-contentheaderTime .ym-showTicket-contentheaderSpan .chlid {
    font-size: .4rem;
    color: #fff
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody {
    padding: .2rem .3rem;
    background: #fff
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBodyHeader {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    -webkit-justify-content: space-between;
    justify-content: space-between
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBodyHeader .ym-showTicket-contentBodyHeader-Left {
    font-size: .34rem;
    color: #2e2e2e
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBodyHeader .ym-showTicket-contentBodyHeader-Left > i {
    color: #23a2ff;
    font-size: .35rem;
    margin-right: .1rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBodyHeader .ym-showTicket-contentBodyHeader-Right {
    text-align: right;
    font-size: .34rem;
    color: #2e2e2e
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBodyHeader .ym-showTicket-contentBodyHeader-Right > i {
    color: #23a2ff;
    font-size: .34rem;
    margin-left: .1rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-chair {
    text-align: right;
    font-size: .24rem;
    color: #2e2e2e;
    margin-top: .1rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-img {
    width: 100%;
    height: 2.56rem;
    margin-top: .24rem;
    text-align: center;
    position: relative
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-img .switchSwipe {
    height: 100%;
    color: #888;
    font-size: .22rem;
    justify-content: center
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-img .switchSwipe img {
    width: .64rem;
    height: .64rem;
    margin-bottom: .15rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-img .qrCode {
    width: 2.56rem;
    height: 2.56rem;
    text-align: center
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-img .ym-showTicket-contentBody-imgSuccess {
    width: 2.56rem;
    height: 2.56rem;
    position: absolute;
    z-index: 3;
    background: hsla(0, 0%, 100%, .8);
    top: 0;
    left: calc(50% - 1.28rem)
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-img .ym-showTicket-contentBody-imgSuccess .ym-showTicket-contentBody-imgSuccessIMG {
    width: .72rem;
    height: .72rem;
    background-size: 100% 100%;
    text-align: center;
    display: inline-block;
    margin-top: .72rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-img .ym-showTicket-contentBody-imgSuccess .ym-showTicket-contentBody-imgSuccessP {
    text-align: center;
    margin-top: .24rem;
    font-size: .34rem;
    color: #1fa2ff
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-contentBody .ym-showTicket-contentBody-text {
    font-size: .28rem;
    color: #2e2e2e;
    text-align: center;
    margin-top: .2rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ticketIndex {
    padding: .2rem;
    font-size: .24rem;
    background: #fff;
    text-align: center
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect {
    background: #000
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-top {
    height: .92rem;
    line-height: .92rem;
    color: #fff;
    justify-content: center;
    background: #1fa2ff;
    font-size: .3rem;
    position: relative
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-top:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-top:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-top:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-top img {
    width: .22rem;
    height: .1rem;
    align-self: center;
    margin-left: .2rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent {
    padding: .1rem .8rem .7rem .3rem;
    background: #fafafa;
    font-size: .28rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent .ym-showTicket-perfect-cantent-input {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    margin-top: .4rem;
    align-items: center
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent .ym-showTicket-perfect-cantent-input span {
    color: #bb0909;
    margin-left: .1rem;
    line-height: .8rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent .ym-showTicket-perfect-cantent-input > label {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right;
    line-height: .7rem;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent .ym-showTicket-perfect-cantent-input > input {
    -webkit-box-flex: 2;
    -moz-box-flex: 2;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
    height: .7rem;
    padding: .05rem;
    margin-left: .4rem;
    border-radius: .06rem;
    border: 1px solid #ccc
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent .notice {
    color: #fd545b;
    font-size: .24rem;
    text-align: center;
    margin-top: .4rem;
    margin-left: .5rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent .btns {
    justify-content: space-between
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .ym-showTicket-perfect .ym-showTicket-perfect-cantent .ym-showTicket-perfect-cantent-button {
    background: #fff;
    border: 1px solid #21a1ff;
    font-size: .26rem;
    height: .64rem;
    width: 2rem;
    border-radius: .08rem;
    color: #21a1ff;
    margin-top: .4rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .btn-sendTicket {
    color: #fff;
    font-size: .32rem;
    text-align: center;
    height: .8rem;
    line-height: .8rem;
    margin-top: .7rem;
    background: #1fa2ff;
    border-radius: .1rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .mt3 {
    margin-top: .3rem
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .toApp {
    height: 1.8rem;
    padding: .3rem;
    border-radius: 0 0 .08rem .08rem;
    background: linear-gradient(224deg, #fbf176, #00dcc0 70%, #00a6dc)
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .toApp h6 {
    color: #fff;
    font-size: .32rem;
    font-weight: 600
  }

  .ym-showTicket .ym-showTicket-main .ym-showTicket-content .loopImg .toApp p {
    color: #fc894e;
    font-size: .28rem;
    margin-top: .18rem;
    text-decoration: underline
  }

  .ym-showTicket .bodyMask {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    position: absolute;
    z-index: 5;
    width: 100%;
    left: 0;
    top: 0;
    bottom: 0;
    background: rgba(0, 0, 0, .7)
  }

  .maskSuccess[data-v-729e91dd] {
    margin: auto;
    width: 5.94rem;
    height: 6.92rem;
    background: hsla(0, 0%, 100%, .5);
    background-size: 100% 100%;
    top: 2.8rem;
    position: relative
  }

  .maskSuccess .maskSuccesstab-img[data-v-729e91dd] {
    position: absolute;
    width: 1.28rem;
    height: 1.28rem;
    top: 2.58rem;
    background: #000;
    left: 2.38rem
  }

  .maskSuccess .maskSuccesstab-button[data-v-729e91dd] {
    position: absolute;
    background: none;
    font-size: .24rem;
    color: #fff;
    top: 5.66rem;
    border: none;
    width: 100%
  }

  .fade-enter-active[data-v-052e9718], .fade-leave-active[data-v-052e9718] {
    transition: opacity .3s
  }

  .fade-enter[data-v-052e9718], .fade-leave-to[data-v-052e9718] {
    opacity: 0
  }

  .container-dialog[data-v-052e9718] {
    position: fixed;
    top: 50%;
    left: 50%;
    z-index: 10;
    opacity: 1;
    -webkit-transform: translate3d(-50%, -50%, 0);
    transform: translate3d(-50%, -50%, 0);
    background: #fff;
    width: 85%;
    border-radius: 3px;
    font-size: 16px;
    -webkit-user-select: none;
    overflow: hidden;
    -webkit-backface-visibility: hidden;
    backface-visibility: hidden;
    -webkit-transition: .2s;
    transition: .2s;
    padding: .4rem
  }

  .container-dialog .icon[data-v-052e9718] {
    position: absolute;
    top: .1rem;
    right: .1rem;
    padding: .2rem
  }

  .container-dialog .icon i[data-v-052e9718] {
    width: .4rem;
    height: .4rem
  }

  .container-dialog h5[data-v-052e9718] {
    color: #2e2e2e;
    height: .8rem;
    line-height: .8rem;
    font-size: .36rem;
    text-align: center
  }

  .container-dialog p[data-v-052e9718] {
    color: #2e2e2e;
    font-size: .28rem;
    line-height: .36rem;
    text-align: center;
    margin-top: .32rem
  }

  .container-dialog .btn-dialog[data-v-052e9718] {
    color: #fff;
    font-size: .32rem;
    height: .8rem;
    line-height: .8rem;
    text-align: center;
    background: #1fa2ff;
    margin-top: .56rem;
    border-radius: .08rem
  }

  .bg-dialog[data-v-052e9718] {
    position: fixed;
    top: 0;
    left: 0;
    z-index: 9;
    width: 100%;
    height: 100%;
    opacity: .6;
    background: #000
  }

  .ym-walletHome[data-v-380f985f] {
    position: relative
  }

  .ym-walletHome .ym-walletHome-main[data-v-380f985f] {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #f6f6f6;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    min-height: calc(100vh - .89rem);
    -webkit-overflow-scrolling: touch
  }

  .ym-walletHome .ym-walletHome-main .firstBox[data-v-380f985f] {
    background: #fff;
    position: relative;
    padding: 1.26rem 1.05rem .5rem;
    text-align: center
  }

  .ym-walletHome .ym-walletHome-main .firstBox[data-v-380f985f]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-walletHome .ym-walletHome-main .firstBox[data-v-380f985f]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-walletHome .ym-walletHome-main .firstBox[data-v-380f985f]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus[data-v-380f985f] {
    top: .2rem;
    right: .24rem;
    color: #4a4a4a;
    height: .4rem;
    line-height: .4rem;
    font-size: .26rem;
    position: absolute
  }

  .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .personalAccount[data-v-380f985f] {
    padding-left: .4rem;
    background-position: 0;
    background-size: .32rem;
    -webkit-background-size: .32rem;
    background-image: url("/static/images/ic_personal.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .personalAccount[data-v-380f985f] {
      background-image: url("/static/images/ic_personal@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .personalAccount[data-v-380f985f] {
      background-image: url("/static/images/ic_personal@3x.png")
    }
  }

  .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .companyAccount[data-v-380f985f] {
    padding-left: .4rem;
    background-position: 0;
    background-size: .32rem;
    -webkit-background-size: .32rem;
    background-image: url("/static/images/ic_company.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .companyAccount[data-v-380f985f] {
      background-image: url("/static/images/ic_company@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .companyAccount[data-v-380f985f] {
      background-image: url("/static/images/ic_company@3x.png")
    }
  }

  .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .verifying[data-v-380f985f] {
    padding-left: .4rem;
    background-position: 0;
    background-size: .32rem;
    -webkit-background-size: .32rem;
    background-image: url("/static/images/ic_verifying.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .verifying[data-v-380f985f] {
      background-image: url("/static/images/ic_verifying@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .verifying[data-v-380f985f] {
      background-image: url("/static/images/ic_verifying@3x.png")
    }
  }

  .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .verifyFail[data-v-380f985f] {
    padding-left: .4rem;
    background-position: 0;
    background-size: .32rem;
    -webkit-background-size: .32rem;
    background-image: url("/static/images/ic_verify_fail.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .verifyFail[data-v-380f985f] {
      background-image: url("/static/images/ic_verify_fail@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-walletHome .ym-walletHome-main .firstBox .verifyStatus .verifyFail[data-v-380f985f] {
      background-image: url("/static/images/ic_verify_fail@3x.png")
    }
  }

  .ym-walletHome .ym-walletHome-main .firstBox .img[data-v-380f985f] {
    width: 1.4rem;
    height: 1.8rem;
    background-size: 100% 100%;
    display: inline-block;
    background-image: url("/static/images/icon_shiney/purse.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-walletHome .ym-walletHome-main .firstBox .img[data-v-380f985f] {
      background-image: url("/static/images/icon_shiney/purse@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-walletHome .ym-walletHome-main .firstBox .img[data-v-380f985f] {
      background-image: url("/static/images/icon_shiney/purse@3x.png")
    }
  }

  .ym-walletHome .ym-walletHome-main .firstBox .sumber[data-v-380f985f] {
    font-size: .6rem;
    margin-top: .59rem
  }

  .ym-walletHome .ym-walletHome-main .firstBox .canUseMoney[data-v-380f985f] {
    color: #000;
    font-size: .24rem;
    margin-top: .2rem
  }

  .ym-walletHome .ym-walletHome-main .firstBox .button[data-v-380f985f] {
    margin-top: 1.18rem
  }

  .ym-walletHome .ym-walletHome-main .firstBox .button .mint-button[data-v-380f985f] {
    margin-top: .25rem
  }

  .ym-walletHome .ym-walletHome-main .firstBox .button .explanation[data-v-380f985f] {
    color: #1fa2ff;
    font-size: .24rem;
    text-align: left;
    margin-top: .15rem
  }

  .ym-walletHome .ym-walletHome-main .lastBox[data-v-380f985f] {
    margin-top: .25rem;
    position: relative;
    height: 1.1rem;
    width: 100%;
    background: #fff;
    line-height: 1.1rem;
    color: #000;
    font-size: .28rem;
    padding-left: .32rem
  }

  .ym-walletHome .ym-walletHome-main .lastBox[data-v-380f985f]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-walletHome .ym-walletHome-main .lastBox[data-v-380f985f]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-walletHome .ym-walletHome-main .lastBox[data-v-380f985f]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-walletHome .ym-walletHome-main .lastBox > span[data-v-380f985f] {
    font-size: .3rem;
    color: #ff7200;
    margin-left: .1rem
  }

  .ym-walletHome .ym-walletHome-main .couponList .couponlistHead[data-v-380f985f] {
    font-size: .28rem;
    height: 1.1rem;
    line-height: 1.1rem;
    background: #fff;
    margin-top: .25rem;
    padding-left: .32rem;
    position: relative
  }

  .ym-walletHome .ym-walletHome-main .couponList .couponlistHead .bottom[data-v-380f985f] {
    width: .2rem;
    height: .2rem;
    position: absolute;
    right: .3rem;
    top: .5rem
  }

  .ym-walletHome .ym-walletHome-main .couponList .couponlistHead .bottom .bottom-arrow1[data-v-380f985f], .ym-walletHome .ym-walletHome-main .couponList .couponlistHead .bottom .bottom-arrow2[data-v-380f985f] {
    width: 0;
    height: 0;
    display: block;
    position: absolute;
    left: 0;
    top: 0;
    z-index: 5;
    border-bottom: .1rem dashed transparent;
    border-left: .1rem dashed transparent;
    border-right: .1rem dashed transparent;
    border-top: .1rem solid #fff;
    overflow: hidden
  }

  .ym-walletHome .ym-walletHome-main .couponList .couponlistHead .bottom .bottom-arrow1[data-v-380f985f] {
    top: .01rem;
    border-top: .1rem solid #000
  }

  .ym-walletHome .ym-walletHome-main .couponList .couponlistHead .bottom .bottom-arrow2[data-v-380f985f] {
    border-top: .1rem solid #fff
  }

  .ym-walletHome .ym-walletHome-main .couponList .coupon[data-v-380f985f] {
    margin: .24rem .34rem;
    height: 1.86rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    background-size: 100% 100%
  }

  .ym-walletHome .ym-walletHome-main .couponList .coupon .couponleft[data-v-380f985f] {
    text-align: center;
    height: 1.86rem;
    font-size: .54rem;
    padding-top: .1rem;
    line-height: .8rem;
    color: #fff;
    padding-left: .13rem;
    width: 2.2rem
  }

  .ym-walletHome .ym-walletHome-main .couponList .coupon .couponleft > i[data-v-380f985f] {
    font-size: .41rem;
    font-style: normal;
    color: #faff1c;
    margin-left: .1rem
  }

  .ym-walletHome .ym-walletHome-main .couponList .coupon .couponright[data-v-380f985f] {
    padding-left: .46rem
  }

  .ym-walletHome .ym-walletHome-main .couponList .coupon .couponright .right_0[data-v-380f985f] {
    color: #484848;
    margin-top: .21rem;
    font-size: .35rem;
    width: 3.5rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ym-walletHome .ym-walletHome-main .couponList .coupon .couponright .right_1[data-v-380f985f] {
    color: #ea6161;
    margin-top: .21rem;
    font-size: .24rem
  }

  .ym-walletHome .ym-walletHome-main .couponList .coupon .couponright .right_2[data-v-380f985f] {
    margin-top: .21rem;
    font-size: .24rem;
    color: #9d9c9c
  }

  .ym-walletHome .bodyMask[data-v-380f985f] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    position: absolute;
    z-index: 2;
    width: 100%;
    left: 0;
    top: 0;
    bottom: 0;
    background: rgba(0, 0, 0, .7)
  }

  .ym-walletHome .bodyMask .maskcontent[data-v-380f985f] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    margin: 50% auto;
    width: 6.2rem;
    height: 4rem;
    padding: 1rem .62rem;
    background: #fff;
    text-align: center;
    border-radius: .1rem
  }

  .ym-walletHome .bodyMask .maskcontent .left[data-v-380f985f] {
    width: 2rem;
    height: 2rem;
    background-image: url("/static/images/icon_shiney/ic_wdqb_personal_normal.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    font-size: .6rem;
    text-align: center;
    line-height: 2rem;
    color: #ff5e5c
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-walletHome .bodyMask .maskcontent .left[data-v-380f985f] {
      background-image: url("/static/images/icon_shiney/ic_wdqb_personal_normal@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-walletHome .bodyMask .maskcontent .left[data-v-380f985f] {
      background-image: url("/static/images/icon_shiney/ic_wdqb_personal_normal@3x.png")
    }
  }

  .ym-walletHome .bodyMask .maskcontent .text[data-v-380f985f] {
    font-size: .4rem;
    color: #333;
    margin: auto .29rem
  }

  .ym-walletHome .bodyMask .maskcontent .right[data-v-380f985f] {
    width: 2rem;
    height: 2rem;
    background-image: url("/static/images/icon_shiney/ic_wdqb_mechanism_normal.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    font-size: .6rem;
    text-align: center;
    line-height: 2rem;
    color: #9279ff
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ym-walletHome .bodyMask .maskcontent .right[data-v-380f985f] {
      background-image: url("/static/images/icon_shiney/ic_wdqb_mechanism_normal@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ym-walletHome .bodyMask .maskcontent .right[data-v-380f985f] {
      background-image: url("/static/images/icon_shiney/ic_wdqb_mechanism_normal@3x.png")
    }
  }

  .ym-walletHome .bodyMask .Withdrawals[data-v-380f985f] {
    margin: 50% auto;
    width: 6.2rem;
    height: 4rem;
    padding: .54rem .4rem;
    background: #fff;
    text-align: center;
    border-radius: .1rem
  }

  .ym-walletHome .bodyMask .Withdrawals .img[data-v-380f985f] {
    width: 100%;
    text-align: center;
    margin-top: 0
  }

  .ym-walletHome .bodyMask .Withdrawals .img > img[data-v-380f985f] {
    height: .66rem;
    width: .66rem
  }

  .ym-walletHome .bodyMask .Withdrawals .font[data-v-380f985f] {
    font-size: .34rem;
    color: #ff7200;
    margin-top: .2rem
  }

  .ym-walletHome .bodyMask .Withdrawals .tx[data-v-380f985f] {
    width: 100%;
    height: .8rem;
    text-align: center;
    color: #fff;
    background: #3498db;
    border-radius: .03rem;
    font-size: .34rem;
    border: 0;
    margin-top: .5rem
  }

  .ym-detailed .ym-detailed-main {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #f6f6f6;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    min-height: calc(100vh - .89rem);
    -webkit-overflow-scrolling: touch
  }

  .ym-detailed .ym-detailed-main .body {
    padding: .4rem .3rem;
    border-top: .01rem solid #ccc;
    border-bottom: .01rem solid #ccc;
    margin-top: .24rem;
    background: #fff
  }

  .ym-detailed .ym-detailed-main .body .header {
    padding-bottom: .3rem;
    border-bottom: .01rem solid #ccc
  }

  .ym-detailed .ym-detailed-main .body .header .left {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-size: .28rem;
    color: #aaa;
    text-align: left;
    align-self: center
  }

  .ym-detailed .ym-detailed-main .body .header .right {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-weight: 700;
    font-size: .36rem;
    color: #000;
    text-align: right
  }

  .ym-detailed .ym-detailed-main .body .list > li {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    margin-top: .18rem
  }

  .ym-detailed .ym-detailed-main .body .list > li .left {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-size: .28rem;
    color: #aaa;
    text-align: left
  }

  .ym-detailed .ym-detailed-main .body .list > li .right {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-size: .28rem;
    color: #000;
    text-align: right
  }

  .detailListPage .floatBox[data-v-752b0f71] {
    width: 2.21rem;
    background: rgba(0, 0, 0, .65);
    padding: 0 .4rem;
    z-index: 999;
    position: absolute;
    top: .9rem;
    right: .1rem;
    padding-bottom: .5rem
  }

  .detailListPage .floatBox .topArrow[data-v-752b0f71] {
    width: 0;
    height: 0;
    position: absolute;
    right: .16rem;
    top: -.2rem;
    border: .1rem solid transparent;
    border-bottom: .1rem solid rgba(0, 0, 0, .65)
  }

  .detailListPage .floatBox > ul li[data-v-752b0f71] {
    width: 100%;
    font-size: .34rem;
    color: #fff;
    padding-top: .5rem
  }

  .detailListPage .navs[data-v-752b0f71] {
    position: fixed;
    top: .9rem;
    left: 0;
    width: 100%;
    height: 1rem;
    line-height: 1rem;
    color: #000;
    font-size: .34rem;
    text-align: center;
    background: #fff;
    border-bottom: .01rem solid #ccc
  }

  .detailListPage .navs .selectedNav[data-v-752b0f71] {
    color: #1fa2ff;
    display: inline-block;
    border-bottom: .01rem solid #1fa2ff
  }

  .detailListPage .list[data-v-752b0f71] {
    margin-top: 2.16rem
  }

  .detailListPage .list .item[data-v-752b0f71] {
    background: #fff;
    justify-content: space-between;
    -webkit-justify-content: space-between;
    padding: .4rem .3rem .3rem;
    border-top: .01rem solid #ccc
  }

  .detailListPage .list .item .name[data-v-752b0f71] {
    color: #000;
    font-size: .34rem;
    font-weight: 700
  }

  .detailListPage .list .item .date[data-v-752b0f71] {
    color: #aaa;
    font-size: .24rem;
    margin-top: .2rem
  }

  .detailListPage .list .item .amount[data-v-752b0f71] {
    color: #000;
    font-size: .36rem;
    font-weight: 700;
    align-self: center;
    -webkit-align-self: center
  }

  .detailListPage .list .item .incomeAmount[data-v-752b0f71] {
    color: #ff7200
  }

  .mtbutton {
    color: #1fa2ff !important
  }

  .border-1px-horizontal-home {
    position: relative
  }

  .border-1px-horizontal-home:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .border-1px-horizontal-home:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .border-1px-horizontal-home:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .mintui, .mintui-back {
    display: none
  }

  .fonsize {
    font-size: .6rem !important
  }

  .inputboxO[data-v-63bb3ffd] {
    height: .88rem;
    width: 6rem;
    margin: .42rem auto;
    border: 1px solid #3498db;
    overflow: hidden;
    position: relative;
    background: #fff
  }

  .inputboxO .array[data-v-63bb3ffd] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    overflow: hidden;
    height: 100%;
    background: #fff;
    width: 100%
  }

  .inputboxO .array > li[data-v-63bb3ffd] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: center;
    position: relative;
    height: 100%
  }

  .inputboxO .array > li[data-v-63bb3ffd]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .inputboxO .array > li[data-v-63bb3ffd]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .inputboxO .array > li[data-v-63bb3ffd]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .inputboxO .array > li .circular[data-v-63bb3ffd] {
    position: absolute;
    top: .33rem;
    left: .4rem;
    width: .2rem;
    height: .2rem;
    background: #000;
    border-radius: 100%;
    display: inline-block
  }

  .inputboxO .input[data-v-63bb3ffd] {
    height: .022rem;
    width: .022rem;
    color: transparent;
    font-size: .05rem;
    background: hsla(0, 0%, 100%, 0);
    border: none;
    position: absolute;
    top: -.025rem;
    z-index: -1;
    left: -.02rem;
    outline: none
  }

  .ym-password .ym-password-main[data-v-6896e5e0] {
    overflow: hidden;
    padding-left: 0;
    background: #f6f6f6;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    width: 100%
  }

  .ym-password .ym-password-main .text[data-v-6896e5e0] {
    font-size: .36rem;
    color: #000;
    margin-top: 2.24rem;
    text-align: center
  }

  .ym-password .ym-password-main .forgetPassword[data-v-6896e5e0] {
    margin: .7rem
  }

  .ym-password .ym-password-main[data-v-133925c8] {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #f6f6f6;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    height: calc(100vh - .89rem);
    height: 100vh
  }

  .ym-password .ym-password-main .text[data-v-133925c8] {
    font-size: .36rem;
    color: #000;
    margin-top: 2.24rem;
    text-align: center
  }

  .ym-password .ym-password-main .forgetPassword[data-v-133925c8] {
    margin: .7rem
  }

  .ym-forgetpassword .ym-forgetpassword-main[data-v-0609b764] {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #f6f6f6;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    min-height: calc(100vh - .89rem)
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox[data-v-0609b764] {
    background: #fff
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox .verification[data-v-0609b764] {
    position: relative;
    height: 1.1rem
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox .verification[data-v-0609b764]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-forgetpassword .ym-forgetpassword-main .inputbox .verification[data-v-0609b764]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-forgetpassword .ym-forgetpassword-main .inputbox .verification[data-v-0609b764]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox .verification > input[data-v-0609b764] {
    font-size: .28rem;
    color: #aaa;
    border: none;
    height: 1.09rem;
    width: 100%;
    position: absolute;
    top: 0;
    left: 0;
    padding: 0 .32rem
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox .verifyLine[data-v-0609b764] {
    align-items: center;
    -webkit-align-items: center;
    font-size: .34rem;
    color: #aaa;
    height: 1.1rem;
    width: 100%;
    position: relative
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox .verifyLine[data-v-0609b764]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-forgetpassword .ym-forgetpassword-main .inputbox .verifyLine[data-v-0609b764]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-forgetpassword .ym-forgetpassword-main .inputbox .verifyLine[data-v-0609b764]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox .verifyLine .verify[data-v-0609b764] {
    font-size: .28rem;
    margin: 0 .32rem
  }

  .ym-forgetpassword .ym-forgetpassword-main .inputbox .verifyLine > input[data-v-0609b764] {
    width: 100%;
    height: 1.09rem;
    padding: 0 .32rem;
    border: none;
    font-size: .28rem;
    color: #aaa
  }

  .ym-forgetpassword .ym-forgetpassword-main button.mint-button[data-v-0609b764] {
    width: 5.4rem;
    margin: 1.35rem auto 0
  }

  .ym-forgetpassword .ym-forgetpassword-main .background[data-v-0609b764] {
    background: #ccc !important
  }

  /*!
 * Cropper.js v1.4.1
 * https://fengyuanchen.github.io/cropperjs
 *
 * Copyright 2015-present Chen Fengyuan
 * Released under the MIT license
 *
 * Date: 2018-07-15T09:54:43.167Z
 */
  .cropper-container {
    -moz-user-select: none;
    -ms-touch-action: none;
    -ms-user-select: none;
    -webkit-user-select: none;
    direction: ltr;
    font-size: 0;
    line-height: 0;
    position: relative;
    touch-action: none;
    user-select: none
  }

  .cropper-container img {
    display: block;
    height: 100%;
    image-orientation: 0deg;
    max-height: none !important;
    max-width: none !important;
    min-height: 0 !important;
    min-width: 0 !important;
    width: 100%
  }

  .cropper-canvas, .cropper-crop-box, .cropper-drag-box, .cropper-modal, .cropper-wrap-box {
    bottom: 0;
    left: 0;
    position: absolute;
    right: 0;
    top: 0
  }

  .cropper-canvas, .cropper-wrap-box {
    overflow: hidden
  }

  .cropper-drag-box {
    background-color: #fff;
    opacity: 0
  }

  .cropper-modal {
    background-color: #000;
    opacity: .5
  }

  .cropper-view-box {
    display: block;
    height: 100%;
    outline: 1px solid #39f;
    outline-color: rgba(51, 153, 255, .75);
    overflow: hidden;
    width: 100%
  }

  .cropper-dashed {
    border: 0 dashed #eee;
    display: block;
    opacity: .5;
    position: absolute
  }

  .cropper-dashed.dashed-h {
    border-bottom-width: 1px;
    border-top-width: 1px;
    height: 33.33333%;
    left: 0;
    top: 33.33333%;
    width: 100%
  }

  .cropper-dashed.dashed-v {
    border-left-width: 1px;
    border-right-width: 1px;
    height: 100%;
    left: 33.33333%;
    top: 0;
    width: 33.33333%
  }

  .cropper-center {
    display: block;
    height: 0;
    left: 50%;
    opacity: .75;
    position: absolute;
    top: 50%;
    width: 0
  }

  .cropper-center:after, .cropper-center:before {
    background-color: #eee;
    content: " ";
    display: block;
    position: absolute
  }

  .cropper-center:before {
    height: 1px;
    left: -3px;
    top: 0;
    width: 7px
  }

  .cropper-center:after {
    height: 7px;
    left: 0;
    top: -3px;
    width: 1px
  }

  .cropper-face, .cropper-line, .cropper-point {
    display: block;
    height: 100%;
    opacity: .1;
    position: absolute;
    width: 100%
  }

  .cropper-face {
    background-color: #fff;
    left: 0;
    top: 0
  }

  .cropper-line {
    background-color: #39f
  }

  .cropper-line.line-e {
    cursor: ew-resize;
    right: -3px;
    top: 0;
    width: 5px
  }

  .cropper-line.line-n {
    cursor: ns-resize;
    height: 5px;
    left: 0;
    top: -3px
  }

  .cropper-line.line-w {
    cursor: ew-resize;
    left: -3px;
    top: 0;
    width: 5px
  }

  .cropper-line.line-s {
    bottom: -3px;
    cursor: ns-resize;
    height: 5px;
    left: 0
  }

  .cropper-point {
    background-color: #39f;
    height: 5px;
    opacity: .75;
    width: 5px
  }

  .cropper-point.point-e {
    cursor: ew-resize;
    margin-top: -3px;
    right: -3px;
    top: 50%
  }

  .cropper-point.point-n {
    cursor: ns-resize;
    left: 50%;
    margin-left: -3px;
    top: -3px
  }

  .cropper-point.point-w {
    cursor: ew-resize;
    left: -3px;
    margin-top: -3px;
    top: 50%
  }

  .cropper-point.point-s {
    bottom: -3px;
    cursor: s-resize;
    left: 50%;
    margin-left: -3px
  }

  .cropper-point.point-ne {
    cursor: nesw-resize;
    right: -3px;
    top: -3px
  }

  .cropper-point.point-nw {
    cursor: nwse-resize;
    left: -3px;
    top: -3px
  }

  .cropper-point.point-sw {
    bottom: -3px;
    cursor: nesw-resize;
    left: -3px
  }

  .cropper-point.point-se {
    bottom: -3px;
    cursor: nwse-resize;
    height: 20px;
    opacity: 1;
    right: -3px;
    width: 20px
  }

  @media (min-width: 768px) {
    .cropper-point.point-se {
      height: 15px;
      width: 15px
    }
  }

  @media (min-width: 992px) {
    .cropper-point.point-se {
      height: 10px;
      width: 10px
    }
  }

  @media (min-width: 1200px) {
    .cropper-point.point-se {
      height: 5px;
      opacity: .75;
      width: 5px
    }
  }

  .cropper-point.point-se:before {
    background-color: #39f;
    bottom: -50%;
    content: " ";
    display: block;
    height: 200%;
    opacity: 0;
    position: absolute;
    right: -50%;
    width: 200%
  }

  .cropper-invisible {
    opacity: 0
  }

  .cropper-bg {
    background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQAQMAAAAlPW0iAAAAA3NCSVQICAjb4U/gAAAABlBMVEXMzMz////TjRV2AAAACXBIWXMAAArrAAAK6wGCiw1aAAAAHHRFWHRTb2Z0d2FyZQBBZG9iZSBGaXJld29ya3MgQ1M26LyyjAAAABFJREFUCJlj+M/AgBVhF/0PAH6/D/HkDxOGAAAAAElFTkSuQmCC")
  }

  .cropper-hide {
    display: block;
    height: 0;
    position: absolute;
    width: 0
  }

  .cropper-hidden {
    display: none !important
  }

  .cropper-move {
    cursor: move
  }

  .cropper-crop {
    cursor: crosshair
  }

  .cropper-disabled .cropper-drag-box, .cropper-disabled .cropper-face, .cropper-disabled .cropper-line, .cropper-disabled .cropper-point {
    cursor: not-allowed
  }

  .v-simple-cropper .file {
    display: none
  }

  .v-simple-cropper .v-cropper-layer {
    position: fixed;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    background: #fff;
    z-index: 999;
    display: none
  }

  .v-simple-cropper .v-cropper-layer .layer-header {
    position: absolute;
    top: 0;
    left: 0;
    z-index: 999;
    background: #fff;
    width: 100%;
    height: .8rem;
    padding: 0 .2rem;
    box-sizing: border-box
  }

  .v-simple-cropper .v-cropper-layer .cancel, .v-simple-cropper .v-cropper-layer .confirm {
    line-height: .8rem;
    font-size: .28rem;
    background: inherit;
    border: 0;
    outline: 0;
    float: left
  }

  .v-simple-cropper .v-cropper-layer .confirm {
    float: right
  }

  .v-simple-cropper .v-cropper-layer img {
    position: inherit !important;
    border-radius: inherit !important;
    float: inherit !important
  }

  .licensePhotoBox[data-v-49c9fa84] {
    margin-top: .24rem;
    justify-content: center;
    -webkit-justify-content: center
  }

  .licensePhotoBox img[data-v-49c9fa84] {
    width: 3.2rem;
    height: 2.4rem;
    margin: 0 auto
  }

  .accountAuthPage .inputLine {
    position: relative;
    height: 1rem;
    line-height: 1rem;
    font-size: .3rem;
    padding: 0 .3rem;
    background: #fff
  }

  .accountAuthPage .inputLine:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .accountAuthPage .inputLine:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .accountAuthPage .inputLine:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .accountAuthPage .inputLine input {
    height: .4rem;
    line-height: .4rem;
    margin-top: .3rem;
    margin-left: .24rem
  }

  .accountAuthPage .inputLine img {
    width: .18rem;
    height: .36rem;
    align-self: center
  }

  .accountAuthPage .photoArea {
    padding: .4rem .2rem;
    background: #fff;
    margin-top: .24rem
  }

  .accountAuthPage .photoArea .title {
    color: #333;
    font-size: .32rem;
    text-align: center
  }

  .accountAuthPage .photoArea .photoBox {
    margin-top: .24rem;
    justify-content: space-between;
    -webkit-justify-content: space-between
  }

  .accountAuthPage .photoArea .photoBox .item {
    padding: 0 .2rem
  }

  .accountAuthPage .photoArea .photoBox .item img {
    width: 3.2rem;
    height: 2.4rem;
    align-self: center
  }

  .accountAuthPage .photoArea .photoBox .item p {
    color: #aeaeae;
    font-size: .24rem;
    text-align: center;
    margin-top: .16rem
  }

  .accountAuthPage .agreementLine {
    color: #2e2e2e;
    font-size: .24rem;
    margin-top: .24rem;
    margin-left: .3rem
  }

  .accountAuthPage .agreementLine .radioBtn {
    width: .24rem;
    height: .24rem;
    border-radius: 100%;
    margin-right: .16rem
  }

  .accountAuthPage .agreementLine .selected {
    background: #1fa2ff
  }

  .accountAuthPage .agreementLine .unSelected {
    background: #c6e7ff
  }

  .accountAuthPage .agreementLine .link {
    color: #1fa2ff
  }

  .accountAuthPage .submitBtn {
    color: #fff;
    height: .8rem;
    line-height: .8rem;
    font-size: .32rem;
    text-align: center;
    margin: .48rem .75rem;
    border-radius: .08rem;
    background: #1fa2ff
  }

  .chooseAuthTypePage .container[data-v-c67a8104] {
    color: #333;
    font-size: .32rem;
    background: #fff;
    text-align: center;
    margin-top: .24rem;
    padding: .4rem 1.1rem .8rem
  }

  .chooseAuthTypePage .container .chooseArea[data-v-c67a8104] {
    margin-top: .6rem;
    justify-content: space-between;
    -webkit-justify-content: space-between
  }

  .chooseAuthTypePage .container .chooseArea .item[data-v-c67a8104] {
    padding: .8rem .56rem;
    border-radius: .08rem;
    box-shadow: 0 0 .2rem 0 rgba(0, 0, 0, .2)
  }

  .chooseAuthTypePage .container .chooseArea .item img[data-v-c67a8104] {
    width: .96rem;
    height: .96rem;
    align-self: center
  }

  .chooseAuthTypePage .container .chooseArea .item p[data-v-c67a8104] {
    margin-top: .32rem
  }

  .accountAuthSuccessPage .titleBar[data-v-6d809663] {
    color: #000;
    height: .9rem;
    line-height: .9rem;
    font-size: .32rem;
    text-align: center;
    background: #fff;
    border-bottom: 1px solid #ddd
  }

  .accountAuthSuccessPage .container[data-v-6d809663] {
    padding: 0 .75rem;
    align-items: center;
    -webkit-align-items: center
  }

  .accountAuthSuccessPage .container img[data-v-6d809663] {
    width: 4.08rem;
    height: 2.2rem;
    margin-top: 1.4rem
  }

  .accountAuthSuccessPage .container p[data-v-6d809663] {
    color: #333;
    font-size: .4rem;
    margin-top: 1.16rem
  }

  .accountAuthSuccessPage .container div[data-v-6d809663] {
    color: #fff;
    width: 100%;
    height: .8rem;
    line-height: .8rem;
    margin-top: 1.68rem;
    font-size: .32rem;
    text-align: center;
    background: #1fa2ff;
    border-radius: .08rem
  }

  .accountAuthAgreementPage .container[data-v-1b7928ea] {
    color: #333;
    padding: .3rem;
    background: #fff
  }

  .accountAuthAgreementPage .container h5[data-v-1b7928ea] {
    font-size: .28rem;
    line-height: .48rem;
    margin-bottom: .1rem
  }

  .accountAuthAgreementPage .container p[data-v-1b7928ea] {
    font-size: .24rem;
    line-height: .4rem
  }

  .accountAuthAgreementPage .container .inscribe[data-v-1b7928ea] {
    margin-top: 1rem;
    text-align: right
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main[data-v-9c3360d8] {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #fff;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    overflow-y: auto;
    -webkit-overflow-scrolling: touch
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main > .headertop[data-v-9c3360d8] {
    width: 100%;
    padding: .3rem;
    background: rgba(255, 94, 92, .1);
    font-size: .24rem
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main > .headertop > span[data-v-9c3360d8] {
    width: .16rem;
    height: .16rem;
    background: #ff5e5c;
    display: inline-block;
    border-radius: 100%;
    margin-right: .24rem
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main .inputBox[data-v-9c3360d8] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    font-size: .34rem;
    margin: .4rem .31rem;
    height: .74rem;
    position: relative
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main .inputBox[data-v-9c3360d8]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-personalAuthentication1 .ym-personalAuthentication1-main .inputBox[data-v-9c3360d8]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-personalAuthentication1 .ym-personalAuthentication1-main .inputBox[data-v-9c3360d8]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main .inputBox .left[data-v-9c3360d8] {
    flex: 1;
    font-size: .28rem;
    line-height: .74rem;
    height: .74rem
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main .inputBox .right[data-v-9c3360d8] {
    flex: 2;
    line-height: .74rem;
    border: none;
    font-size: .28rem;
    text-align: right;
    outline: none;
    color: #3498db
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main .inputBox .rightspan[data-v-9c3360d8] {
    position: absolute;
    right: 0;
    height: .74rem;
    width: 4.4rem;
    border: none;
    top: .25rem;
    text-align: right;
    outline: none;
    color: #3498db
  }

  .ym-personalAuthentication1 .ym-personalAuthentication1-main button.mint-button[data-v-9c3360d8] {
    width: 5.4rem;
    margin: 0 auto .5rem
  }

  .ym-personalAuthentication1 .address-picker[data-v-9c3360d8] {
    position: fixed;
    bottom: 0;
    left: 0;
    width: 100%;
    background: #fff;
    z-index: 100
  }

  .ym-personalAuthentication1 .address-mask[data-v-9c3360d8] {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: #ccc;
    opacity: .3;
    z-index: 10
  }

  .ym-personalAuthentication1 .dropWindow[data-v-9c3360d8] {
    width: 100vw;
    height: 100vh;
    position: absolute;
    z-index: 2;
    top: 0;
    left: 0;
    background: rgba(0, 0, 0, .5)
  }

  .background[data-v-6fa8ab13] {
    background: #ccc !important;
    color: #fff;
    display: inline-block
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main[data-v-6fa8ab13] {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #fff;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .header[data-v-6fa8ab13] {
    width: 100%;
    padding: .3rem;
    background: rgba(255, 94, 92, .1);
    font-size: .24rem
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .header > span[data-v-6fa8ab13] {
    width: .16rem;
    height: .16rem;
    background: #ff5e5c;
    display: inline-block;
    border-radius: 100%;
    margin-right: .24rem
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .inputBox[data-v-6fa8ab13] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    margin: .4rem .31rem;
    height: .74rem;
    position: relative
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .inputBox[data-v-6fa8ab13]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-personalAuthentication2 .ym-personalAuthentication2-main .inputBox[data-v-6fa8ab13]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-personalAuthentication2 .ym-personalAuthentication2-main .inputBox[data-v-6fa8ab13]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .inputBox .left[data-v-6fa8ab13] {
    flex: 1 0 auto;
    font-size: .28rem;
    line-height: .74rem
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .inputBox .right[data-v-6fa8ab13] {
    position: absolute;
    bottom: 0;
    right: 0;
    line-height: .74rem;
    width: 5rem;
    border: none;
    font-size: .28rem;
    text-align: right;
    outline: none;
    color: #3498db
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .verification[data-v-6fa8ab13] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    margin: .4rem .31rem;
    height: .74rem;
    align-items: center;
    -webkit-align-items: center;
    position: relative
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .verification[data-v-6fa8ab13]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-personalAuthentication2 .ym-personalAuthentication2-main .verification[data-v-6fa8ab13]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-personalAuthentication2 .ym-personalAuthentication2-main .verification[data-v-6fa8ab13]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main .verification .vInput[data-v-6fa8ab13] {
    font-size: .28rem;
    border: none;
    outline: none;
    color: #3498db
  }

  .ym-personalAuthentication2 .ym-personalAuthentication2-main button.mint-button[data-v-6fa8ab13] {
    width: 5.4rem;
    margin: 0 auto
  }

  .ym-unbundling .ym-unbundling-main[data-v-799542e2] {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #333;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    min-height: calc(100vh - .89rem)
  }

  .ym-unbundling .ym-unbundling-main .Bank[data-v-799542e2] {
    width: 6.86rem;
    height: 3rem;
    margin: .59rem .32rem;
    background: #fff;
    border-radius: .1rem;
    padding-top: .5rem
  }

  .ym-unbundling .ym-unbundling-main .Bank .header[data-v-799542e2] {
    display: flex
  }

  .ym-unbundling .ym-unbundling-main .Bank .header .left[data-v-799542e2] {
    flex: 0 0 auto;
    padding-left: .5rem;
    font-size: .34rem
  }

  .ym-unbundling .ym-unbundling-main .Bank .header .left > i[data-v-799542e2] {
    width: .4rem;
    height: .4rem;
    display: inline-block;
    background: #000;
    border-radius: 100%
  }

  .ym-unbundling .ym-unbundling-main .Bank .header .left > i img[data-v-799542e2] {
    width: .4rem;
    height: .4rem;
    display: inline-block;
    vertical-align: middle;
    border-radius: 100%
  }

  .ym-unbundling .ym-unbundling-main .Bank .header .right[data-v-799542e2] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right;
    padding-right: .5rem;
    font-size: .28rem;
    line-height: .34rem
  }

  .ym-unbundling .ym-unbundling-main .Bank .cardNumber[data-v-799542e2] {
    font-size: .36rem;
    text-align: center;
    margin-top: .96rem
  }

  .ym-unbundling .ym-unbundling-main .inputBox[data-v-799542e2] {
    display: flex;
    margin: .9rem .31rem;
    height: .74rem;
    position: relative
  }

  .ym-unbundling .ym-unbundling-main .inputBox[data-v-799542e2]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-unbundling .ym-unbundling-main .inputBox[data-v-799542e2]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-unbundling .ym-unbundling-main .inputBox[data-v-799542e2]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-unbundling .ym-unbundling-main .inputBox .left[data-v-799542e2] {
    flex: 1 0 auto;
    font-size: .28rem;
    line-height: .74rem;
    color: #ccc
  }

  .ym-unbundling .ym-unbundling-main .inputBox .right[data-v-799542e2] {
    width: 100%;
    border: none;
    font-size: .25rem;
    text-align: right;
    outline: none;
    color: #ccc;
    background: #333
  }

  .ym-password .ym-password-main[data-v-f912853e] {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #f6f6f6;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box
  }

  .ym-password .ym-password-main .text[data-v-f912853e] {
    font-size: .36rem;
    color: #000;
    margin-top: 2.24rem;
    text-align: center
  }

  .ym-password .ym-password-main .forgetPassword[data-v-f912853e] {
    margin: .7rem
  }

  .color {
    color: #c00 !important
  }

  .bag {
    background: #ddd;
    color: #fff
  }

  .ym-withdrawhome {
    position: relative
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main {
    width: 100%;
    overflow: hidden;
    padding-left: 0;
    background: #fff;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .header {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding: .67rem 1.25rem .17rem;
    position: relative
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .header:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ym-withdrawhome .ym-ym-withdrawhome-main .header:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ym-withdrawhome .ym-ym-withdrawhome-main .header:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .header .left {
    flex: 0 0 auto;
    font-size: .28rem;
    color: #000
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .header .right {
    flex: 1;
    text-align: right;
    font-size: .28rem;
    color: #000;
    font-weight: 700
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body {
    padding: .67rem 1.25rem .17rem
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body .text {
    font-size: .28rem;
    font-weight: 700
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body .text > span {
    color: #aaa;
    font-size: .24rem
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body .inputs {
    margin-top: .69rem;
    width: 100%;
    overflow: hidden;
    height: 1.2rem;
    position: relative;
    border: 1px solid #3498db
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body .inputs .left {
    position: absolute;
    top: .23rem;
    left: .26rem;
    font-size: .4rem;
    font-weight: 700
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body .inputs .right {
    width: 4.26rem;
    height: 1.2rem
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body .inputs .right input {
    position: absolute;
    right: 0;
    top: 0;
    width: 4.26rem;
    font-size: .6rem;
    border: none;
    height: 100%
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .body .Prompt {
    font-size: .24rem;
    margin-top: .23rem;
    color: #aaa
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .centerbutton, .ym-withdrawhome .ym-ym-withdrawhome-main button.mint-button {
    width: 5.4rem;
    margin: 1.19rem auto 0;
    display: block
  }

  .ym-withdrawhome .ym-ym-withdrawhome-main .last {
    color: #aaa;
    font-size: .24rem;
    text-align: center;
    margin-top: .2rem
  }

  .ym-withdrawhome .bodyMask {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    position: absolute;
    z-index: 5;
    width: 100%;
    left: 0;
    top: 0;
    bottom: 0;
    background: rgba(0, 0, 0, .7)
  }

  .withdrawfail[data-v-378991ec] {
    margin: auto;
    width: 6.2rem;
    height: 4rem;
    background: #fff;
    text-align: center;
    border-radius: .1rem
  }

  .withdrawfail .text[data-v-378991ec] {
    font-size: .34rem;
    text-align: center;
    margin-top: 1.14rem;
    color: #000
  }

  .withdrawfail .button[data-v-378991ec] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    margin-right: .4rem
  }

  .withdrawfail .button .mint-button[data-v-378991ec] {
    margin-top: 1.31rem;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    margin-left: .4rem;
    font-size: .34rem
  }

  .maskcontent[data-v-049b3d67] {
    margin: auto;
    width: 6.2rem;
    height: 4.8rem;
    background: #fff;
    text-align: center;
    border-radius: .1rem
  }

  .maskcontent .img[data-v-049b3d67] {
    width: 100%;
    height: .88rem;
    position: relative
  }

  .maskcontent .img[data-v-049b3d67]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .maskcontent .img[data-v-049b3d67]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .maskcontent .img[data-v-049b3d67]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .maskcontent .img .title[data-v-049b3d67] {
    font-size: .34rem;
    color: #000;
    font-weight: 700;
    line-height: .88rem
  }

  .maskcontent .img > i[data-v-049b3d67] {
    position: absolute;
    right: .2rem;
    top: 0;
    font-size: .55rem;
    color: #ccc
  }

  .maskcontent .body[data-v-049b3d67] {
    width: 100%
  }

  .maskcontent .body > p[data-v-049b3d67]:first-child {
    font-size: .28rem;
    text-align: center;
    margin-top: .27rem
  }

  .maskcontent .body > p[data-v-049b3d67]:nth-child(2) {
    font-size: .6rem;
    text-align: center;
    margin-top: .28rem;
    font-weight: 700
  }

  .maskcontent .body > p[data-v-049b3d67]:nth-child(3) {
    font-size: .28rem;
    text-align: center;
    margin-top: .28rem;
    color: #aaa
  }

  .ym-bringsuccess .ym-bringsuccess-main .main[data-v-4e18e275] {
    padding: 0 .3rem;
    background: #fff
  }

  .ym-bringsuccess .ym-bringsuccess-main .header[data-v-4e18e275] {
    margin-top: 1.59rem;
    text-align: center;
    font-size: .36rem;
    font-weight: 700
  }

  .ym-bringsuccess .ym-bringsuccess-main .table[data-v-4e18e275] {
    margin-top: 1.3rem
  }

  .ym-bringsuccess .ym-bringsuccess-main .table > li[data-v-4e18e275] {
    margin-top: .8rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ym-bringsuccess .ym-bringsuccess-main .table > li .left[data-v-4e18e275] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    text-align: right;
    font-size: .28rem;
    color: #aaa
  }

  .ym-bringsuccess .ym-bringsuccess-main .table > li .right[data-v-4e18e275] {
    -webkit-box-flex: 2;
    -moz-box-flex: 2;
    -webkit-flex: 2;
    -ms-flex: 2;
    flex: 2;
    text-align: left;
    font-size: .28rem;
    color: #000;
    margin-left: .58rem
  }

  .ym-bringsuccess .ym-bringsuccess-main button.mint-button[data-v-4e18e275] {
    width: 5.4rem;
    margin: 1.64rem auto 0
  }

  .withdrawExplanation-page[data-v-62cb12a6] {
    padding: .3rem;
    font-size: .34rem;
    letter-spacing: .02rem
  }

  .withdrawExplanation-page h5[data-v-62cb12a6] {
    color: #2e2e2e;
    font-size: .34rem;
    font-weight: 600
  }

  .withdrawExplanation-page p[data-v-62cb12a6] {
    margin-top: .2rem;
    line-height: .4rem
  }

  .myInvitePage[data-v-a2a7aaa6] {
    padding: .3rem
  }

  .myInvitePage .filterLine[data-v-a2a7aaa6] {
    align-items: center;
    -webkit-align-items: center;
    margin-bottom: .3rem
  }

  .myInvitePage .filterLine img[data-v-a2a7aaa6] {
    width: .62rem;
    height: .22rem;
    padding: 0 .18rem
  }

  .myInvitePage .filterLine p[data-v-a2a7aaa6]:first-child {
    color: #b1b1b1;
    font-size: .32rem
  }

  .myInvitePage .filterLine p[data-v-a2a7aaa6]:last-child {
    color: #1fa2ff;
    font-size: .28rem
  }

  .myInvitePage .dataCard[data-v-a2a7aaa6] {
    margin-bottom: .18rem;
    padding: .22rem .26rem;
    align-items: center;
    -webkit-align-items: center;
    background: #fff;
    box-shadow: 0 .1rem .24rem 0 rgba(217, 226, 233, .5);
    border-radius: .12rem;
    border: .02rem solid rgba(219, 223, 227, .3)
  }

  .myInvitePage .dataCard h5[data-v-a2a7aaa6] {
    color: #2e2e2e;
    font-size: .28rem
  }

  .myInvitePage .dataCard p[data-v-a2a7aaa6] {
    color: #b1b1b1;
    font-size: .2rem;
    margin-top: .15rem
  }

  .myInvitePage .dataCard img[data-v-a2a7aaa6] {
    width: .14rem;
    height: .3rem
  }

  .myInvitePage .dataCard .statistics[data-v-a2a7aaa6] {
    color: #2e2e2e;
    font-size: .44rem;
    text-align: right;
    margin: 0 .26rem
  }

  .myInvitePage .btn-invite[data-v-a2a7aaa6] {
    color: #fff;
    height: .8rem;
    font-size: .32rem;
    line-height: .8rem;
    text-align: center;
    margin: .96rem 1rem;
    border-radius: .04rem;
    background: #1fa2ff
  }

  .maskLayer[data-v-a2a7aaa6] {
    width: 100vw;
    height: 100vh;
    position: absolute;
    z-index: 2;
    top: 0;
    left: 0;
    background: rgba(0, 0, 0, .5)
  }

  .maskLayer .month-picker[data-v-a2a7aaa6] {
    position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    z-index: 100;
    background: #fff
  }

  .maskLayer .month-picker .btn-picker[data-v-a2a7aaa6] {
    color: #26a2ff;
    font-size: .32rem;
    text-align: center;
    height: .8rem;
    line-height: .8rem
  }

  .fade-enter-active[data-v-a2a7aaa6], .fade-leave-active[data-v-a2a7aaa6] {
    transition: opacity .3s
  }

  .fade-enter[data-v-a2a7aaa6], .fade-leave-to[data-v-a2a7aaa6] {
    opacity: 0
  }

  .inviteCareerPage[data-v-c73a953a] {
    width: 100%;
    height: 100%;
    position: relative
  }

  .inviteCareerPage img[data-v-c73a953a] {
    width: 100%;
    height: 100%
  }

  .inviteCareerPage .careerData[data-v-c73a953a] {
    top: 2rem;
    left: .3rem;
    z-index: 10;
    color: #fff;
    height: .6rem;
    line-height: .6rem;
    font-size: .28rem;
    position: absolute
  }

  .inviteCareerPage .careerData div[data-v-c73a953a] {
    margin-bottom: .4rem
  }

  .inviteCareerPage .careerData p[data-v-c73a953a] {
    margin: 0 .1rem;
    font-weight: 700;
    font-size: .48rem
  }

  .invitePosterPage[data-v-55de1961] {
    width: 100vw;
    height: 100vh;
    padding: 0 .48rem;
    background: #49474d
  }

  .invitePosterPage .title[data-v-55de1961] {
    color: #fff;
    font-size: .28rem;
    text-align: center;
    margin-top: .35rem
  }

  .invitePosterPage .remark[data-v-55de1961] {
    color: #cbcbcb;
    font-size: .22rem;
    text-align: center;
    margin-top: .15rem;
    margin-bottom: .3rem
  }

  .invitePosterPage .poster-bg[data-v-55de1961] {
    height: 9.12rem;
    border-radius: .2rem
  }

  .invitePosterPage .qr[data-v-55de1961] {
    width: 1.5rem;
    height: 1.5rem;
    left: .6rem;
    bottom: 1.4rem;
    position: absolute
  }

  .inviteDataListPage[data-v-4ea0a322] {
    height: 100%;
    overflow: hidden
  }

  .inviteDataListPage .fixedHeader[data-v-4ea0a322] {
    padding: 0 .3rem
  }

  .inviteDataListPage .fixedHeader .month[data-v-4ea0a322] {
    color: #b1b1b1;
    margin-top: .3rem;
    font-size: .32rem;
    text-align: center
  }

  .inviteDataListPage .fixedHeader .name[data-v-4ea0a322] {
    color: #8b8b8b;
    font-size: .28rem;
    margin-top: .2rem;
    margin-left: .48rem
  }

  .inviteDataListPage .fixedHeader .date[data-v-4ea0a322] {
    color: #8b8b8b;
    font-size: .28rem;
    text-align: right;
    margin-top: .2rem;
    margin-right: .48rem
  }

  .inviteDataListPage .listCon[data-v-4ea0a322] {
    margin: .2rem .3rem .3rem;
    border-radius: .12rem
  }

  .inviteDataListPage .listCon .listItem[data-v-4ea0a322] {
    height: 1rem;
    line-height: 1rem;
    color: #2e2e2e;
    font-size: .28rem;
    padding: 0 .46rem;
    background: #fff;
    box-shadow: 0 10px 24px 0 rgba(217, 226, 233, .5)
  }

  .inviteDataListPage .listCon .listItem .date[data-v-4ea0a322] {
    text-align: right
  }

  .inviteDataListPage .listCon .bt0[data-v-4ea0a322] {
    border-top: 0
  }

  .inviteDataListPage .listCon .bt1[data-v-4ea0a322] {
    border-top: .01rem solid #f5f5f5
  }

  .inviteDataListPage .listCon .br[data-v-4ea0a322] {
    border-radius: 0 0 .12rem .12rem
  }

  .inviteDataListPage[data-v-60eb1d4e] {
    height: 100%;
    overflow: hidden
  }

  .inviteDataListPage .fixedHeader[data-v-60eb1d4e] {
    padding: 0 .3rem
  }

  .inviteDataListPage .fixedHeader .month[data-v-60eb1d4e] {
    color: #b1b1b1;
    margin-top: .3rem;
    font-size: .32rem;
    text-align: center
  }

  .inviteDataListPage .fixedHeader .name[data-v-60eb1d4e] {
    color: #8b8b8b;
    font-size: .28rem;
    margin-top: .2rem;
    margin-left: .48rem
  }

  .inviteDataListPage .fixedHeader .date[data-v-60eb1d4e] {
    color: #8b8b8b;
    font-size: .28rem;
    text-align: right;
    margin-top: .2rem;
    margin-right: .48rem
  }

  .inviteDataListPage .listCon[data-v-60eb1d4e] {
    margin: .2rem .3rem .3rem;
    border-radius: .12rem
  }

  .inviteDataListPage .listCon .listItem[data-v-60eb1d4e] {
    height: 1rem;
    line-height: 1rem;
    color: #2e2e2e;
    font-size: .28rem;
    padding: 0 .46rem;
    background: #fff;
    box-shadow: 0 10px 24px 0 rgba(217, 226, 233, .5)
  }

  .inviteDataListPage .listCon .listItem .date[data-v-60eb1d4e] {
    text-align: right
  }

  .inviteDataListPage .listCon .bt0[data-v-60eb1d4e] {
    border-top: 0
  }

  .inviteDataListPage .listCon .bt1[data-v-60eb1d4e] {
    border-top: .01rem solid #f5f5f5
  }

  .inviteDataListPage .listCon .br[data-v-60eb1d4e] {
    border-radius: 0 0 .12rem .12rem
  }

  .specialinvoice-window[data-v-3fcd7d78] {
    height: 100vh;
    width: 100%;
    background: rgba(0, 0, 0, .5)
  }

  .specialinvoice-window .specialinvoice-window-main[data-v-3fcd7d78] {
    border-radius: .1rem;
    width: 6rem;
    position: fixed;
    height: 8.46rem;
    background: #fff;
    z-index: 96912;
    top: 0;
    left: .75rem;
    margin: 1.28rem auto;
    z-index: 999996;
    padding-top: .1rem
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-body[data-v-3fcd7d78] {
    overflow-y: auto;
    width: calc(100% - .6rem);
    height: 7.06rem;
    -webkit-overflow-scrolling: touch;
    margin: .2rem .3rem .3rem
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-body .specialinvoice-window-header[data-v-3fcd7d78] {
    color: #1b1b1b;
    font-size: .34rem;
    text-align: center;
    font-weight: 700
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-body .specialinvoice-window-body-text[data-v-3fcd7d78] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    margin-top: .3rem
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-body .specialinvoice-window-body-text .specialinvoice-window-body-right[data-v-3fcd7d78] {
    color: #2e2e2e;
    font-size: .28rem;
    line-height: .4rem
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-body .specialinvoice-window-body-text .specialinvoice-window-body-left[data-v-3fcd7d78] {
    flex: 1;
    color: #646464;
    font-size: .28rem;
    line-height: .4rem;
    word-wrap: break-word;
    word-break: break-all
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-title[data-v-3fcd7d78] {
    padding: 0 .7rem;
    background: #f8f8f8;
    font-size: .24rem;
    line-height: .4rem;
    box-sizing: border-box;
    color: #1fa2ff
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-button[data-v-3fcd7d78] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-button > button[data-v-3fcd7d78] {
    flex: 1;
    font-size: .28rem;
    text-align: center;
    background: #1fa2ff;
    height: 1.13rem;
    color: #fff
  }

  .specialinvoice-window .specialinvoice-window-main .specialinvoice-window-button > button[data-v-3fcd7d78]:first-child {
    background: #ccc !important
  }

  .specialinvoice[data-v-4ab70560] {
    -webkit-overflow-scrolling: touch
  }

  .specialinvoice .specialinvoice-header[data-v-4ab70560] {
    font-size: .26rem;
    padding: .3rem .3rem .22rem;
    color: #959595;
    padding-left: .34rem
  }

  .specialinvoice .specialinvoice-input[data-v-4ab70560] {
    width: 100%
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent[data-v-4ab70560] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding: 0 .34rem;
    background: #fff;
    height: 1rem;
    position: relative
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent[data-v-4ab70560]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .specialinvoice .specialinvoice-input .specialinvoice-inputcontent[data-v-4ab70560]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .specialinvoice .specialinvoice-input .specialinvoice-inputcontent[data-v-4ab70560]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent .specialinvoice-inputcontent-left[data-v-4ab70560] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    height: 1rem;
    min-width: 1.4rem;
    line-height: 1rem;
    font-size: .32rem;
    color: #646464
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent .textlingcenter[data-v-4ab70560] {
    line-height: 1rem !important;
    color: #646464 !important
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent .specialinvoice-inputcontent-right[data-v-4ab70560] {
    -webkit-box-flex: 3;
    -moz-box-flex: 3;
    -webkit-flex: 3;
    -ms-flex: 3;
    flex: 3;
    height: 1rem;
    background: #fff;
    font-size: .32rem;
    padding-left: .2rem;
    display: flex;
    line-height: normal
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent .specialinvoice-inputcontent-right[data-v-4ab70560]::-webkit-input-placeholder {
    color: #d2d2d2
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent .specialinvoice-inputcontent-right .specialinvoice-inputcontent-right-adder[data-v-4ab70560] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    font-size: .32rem;
    line-height: 1rem;
    text-align: left;
    color: #646464;
    position: relative
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent .specialinvoice-inputcontent-right .specialinvoice-inputcontent-right-adder[data-v-4ab70560]:after {
    content: "";
    width: 0;
    height: 0;
    overflow: hidden;
    border-width: 4px;
    border-color: #000 transparent transparent;
    border-style: solid dashed dashed;
    position: absolute;
    right: .5rem;
    top: .5rem
  }

  .specialinvoice .specialinvoice-input .specialinvoice-inputcontent .specialinvoice-inputcontent-right .specialinvoice-inputcontent-right-adderColor[data-v-4ab70560] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    width: 1rem;
    font-size: .32rem;
    line-height: 1rem;
    text-align: left;
    color: #646464;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg[data-v-4ab70560] {
    position: relative;
    width: 100%;
    background: #fff;
    height: 3rem
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg[data-v-4ab70560]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .specialinvoice .specialinvoice-input .specialinvoice-updataImg[data-v-4ab70560]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .specialinvoice .specialinvoice-input .specialinvoice-updataImg[data-v-4ab70560]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg .specialinvoice-updataImg-left[data-v-4ab70560] {
    position: absolute;
    font-size: .32rem;
    color: #646464;
    left: .34rem;
    top: .24rem
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg .specialinvoice-updataImg-right[data-v-4ab70560] {
    text-align: center;
    position: relative
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg .specialinvoice-updataImg-right .imgstyle[data-v-4ab70560] {
    height: 2.56rem;
    display: inline-block;
    width: 1.9rem;
    margin-top: .32rem;
    background-size: 100% 100%
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg .specialinvoice-updataImg-right .specialinvoice-updataImg-text[data-v-4ab70560] {
    font-size: .32rem;
    color: #646464
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg .specialinvoice-updataImg-right .v-simple-cropper[data-v-4ab70560] {
    padding-top: 15px;
    height: 128px;
    margin: 0 auto
  }

  .specialinvoice .specialinvoice-input .specialinvoice-updataImg .specialinvoice-updataImg-right .v-simple-cropper .file[data-v-4ab70560] {
    display: block;
    float: left;
    width: 100%;
    height: 100%;
    opacity: 0
  }

  .specialinvoice .specialinvoice-input .specialinvoice-button[data-v-4ab70560] {
    margin: .98rem .22rem .5rem
  }

  .specialinvoice .specialinvoice-input .specialinvoice-button > button[data-v-4ab70560] {
    display: block;
    border: none;
    background: #1fa2ff;
    border-radius: 4px;
    color: #fff;
    font-size: .32rem;
    height: 1rem;
    width: 100%
  }

  .specialinvoice .dropWindow[data-v-4ab70560] {
    height: 100vh;
    width: 100vh;
    position: fixed;
    z-index: 33111;
    top: 0;
    background: rgba(0, 0, 0, .5)
  }

  .specialinvoice .dropWindow .address-picker[data-v-4ab70560] {
    position: fixed;
    bottom: 0;
    left: 0;
    width: 100%;
    background: #fff;
    z-index: 100
  }

  .specialinvoice .dropWindows[data-v-4ab70560] {
    height: 100vh;
    width: 100%;
    position: fixed;
    z-index: 33111;
    top: 0;
    background: rgba(0, 0, 0, .5)
  }

  .ordinary-invoice-wrapper {
    -webkit-overflow-scrolling: touch;
    width: 100vw
  }

  .ordinary-invoice-wrapper .invoice-detail-title {
    width: 100%;
    font-size: .26rem;
    color: #959595;
    padding: .22rem 0;
    padding-left: .34rem;
    padding-right: .2rem
  }

  .ordinary-invoice-wrapper .invoice-input-row {
    width: 100%;
    padding-left: .34rem;
    padding-right: .2rem;
    background: #fff;
    height: 1rem;
    display: flex;
    justify-content: space-between;
    align-items: center;
    position: relative
  }

  .ordinary-invoice-wrapper .invoice-input-row:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 1px 0 0;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ordinary-invoice-wrapper .invoice-input-row:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ordinary-invoice-wrapper .invoice-input-row:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ordinary-invoice-wrapper .invoice-input-row .input-left {
    width: 1.4rem;
    font-size: .32rem;
    color: #646464;
    text-align: left
  }

  .ordinary-invoice-wrapper .invoice-input-row .input-right {
    width: 5.3rem;
    height: 100%;
    font-size: .32rem;
    color: #646464;
    line-height: normal
  }

  .ordinary-invoice-wrapper .invoice-input-row .input-right::-webkit-input-placeholder {
    color: #d2d2d2
  }

  .ordinary-invoice-wrapper .invoice-input-row .span-right {
    width: 5.3rem;
    height: 100%;
    font-size: .32rem;
    color: #646464;
    line-height: 1rem
  }

  .ordinary-invoice-wrapper .invoice-input-row .span-right .money-number {
    color: #1fa2ff
  }

  .ordinary-invoice-wrapper .invoice-input-row .address-right {
    width: 5.3rem;
    height: 100%;
    font-size: .32rem;
    line-height: 1rem;
    text-align: left;
    display: flex
  }

  .ordinary-invoice-wrapper .invoice-input-row .address-right span {
    flex: 1;
    color: #646464;
    position: relative
  }

  .ordinary-invoice-wrapper .invoice-input-row .address-right span:after {
    content: "";
    width: 0;
    height: 0;
    overflow: hidden;
    border-width: 4px;
    border-color: #000 transparent transparent;
    border-style: solid dashed dashed;
    position: absolute;
    right: .5rem;
    top: .5rem
  }

  .ordinary-invoice-wrapper .invoice-input-row .address-right-after {
    width: 5.3rem;
    height: 100%;
    font-size: .32rem;
    color: #646464;
    line-height: 1rem;
    display: flex;
    flex-direction: row
  }

  .ordinary-invoice-wrapper .invoice-input-row .address-right-after span {
    flex: 1;
    width: 1rem;
    text-align: center;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right {
    width: 5.3rem;
    height: 100%;
    font-size: .32rem;
    color: #646464;
    line-height: 1rem
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right .company-type .icon-select {
    display: inline-block;
    width: .28rem;
    height: .28rem;
    background-image: url("/static/images/devin/icon/radio_before.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    margin-right: .1rem
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .company-type .icon-select {
      background-image: url("/static/images/devin/icon/radio_before@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .company-type .icon-select {
      background-image: url("/static/images/devin/icon/radio_before@3x.png")
    }
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right .company-type input {
    display: none
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right .company-type input:checked + .icon-select {
    background-image: url("/static/images/devin/icon/radio_after.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .company-type input:checked + .icon-select {
      background-image: url("/static/images/devin/icon/radio_after@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .company-type input:checked + .icon-select {
      background-image: url("/static/images/devin/icon/radio_after@3x.png")
    }
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type {
    margin-left: .2rem
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type .icon-select {
    display: inline-block;
    width: .28rem;
    height: .28rem;
    background-image: url("/static/images/devin/icon/radio_before.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    margin: 0 .1rem
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type .icon-select {
      background-image: url("/static/images/devin/icon/radio_before@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type .icon-select {
      background-image: url("/static/images/devin/icon/radio_before@3x.png")
    }
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type input {
    display: none
  }

  .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type input:checked + .icon-select {
    background-image: url("/static/images/devin/icon/radio_after.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type input:checked + .icon-select {
      background-image: url("/static/images/devin/icon/radio_after@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ordinary-invoice-wrapper .invoice-input-row .type-right .private-type input:checked + .icon-select {
      background-image: url("/static/images/devin/icon/radio_after@3x.png")
    }
  }

  .ordinary-invoice-wrapper .btn-submit {
    width: 7.1rem;
    height: 1rem;
    margin: 1rem .2rem .6rem;
    font-size: .32rem;
    color: #fff;
    text-align: center;
    line-height: 1rem
  }

  .ordinary-invoice-wrapper .btn-submit.disabledTrue {
    background: #ccc
  }

  .ordinary-invoice-wrapper .btn-submit.disabledFalse {
    background: #1fa2ff
  }

  .ordinary-invoice-wrapper .addressMask {
    position: fixed;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    z-index: 99;
    background: rgba(0, 0, 0, .5)
  }

  .ordinary-invoice-wrapper .addressMask .address-picker-ordinary {
    position: fixed;
    bottom: 0;
    left: 0;
    width: 100%;
    background: #fff;
    z-index: 100;
    color: #000
  }

  .ordinary-invoice-wrapper .dropWindows {
    height: 100vh;
    width: 100%;
    position: fixed;
    z-index: 33111;
    top: 0;
    background: rgba(0, 0, 0, .5)
  }

  .current[data-v-0cb22d36] {
    border: 1px solid #1fa2ff !important;
    color: #1fa2ff !important
  }

  .backcolor[data-v-0cb22d36] {
    border: 1px solid #ccc !important;
    color: #ccc !important
  }

  .overflowhidden[data-v-0cb22d36] {
    overflow: hidden !important;
    height: 100vh !important
  }

  .orderInvoice[data-v-0cb22d36] {
    overflow: hidden;
    padding-left: 0;
    background: #f6f6f6;
    padding-right: 0;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -webkit-overflow-scrolling: touch;
    overflow-x: hidden;
    overflow-y: auto;
    width: 100%
  }

  .orderInvoice .orderInvoice-header[data-v-0cb22d36] {
    font-size: .26rem;
    padding: .22rem .3rem;
    color: #959595
  }

  .orderInvoice .orderInvoice-button[data-v-0cb22d36] {
    height: 1.6rem;
    width: 100%;
    padding: .3rem 0;
    background: #fff;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .orderInvoice .orderInvoice-button .orderInvoice-button-ordinary[data-v-0cb22d36], .orderInvoice .orderInvoice-button .orderInvoice-button-special[data-v-0cb22d36] {
    border: 1px solid #000;
    height: 1rem;
    width: 3.2rem;
    color: #646464;
    font-size: .32rem;
    line-height: 1rem;
    margin-left: .35rem;
    text-align: center
  }

  .invoiceListPage .navBar {
    color: #000;
    background: #fff;
    font-size: .28rem;
    text-align: center
  }

  .invoiceListPage .navBar span {
    display: inline-block;
    padding: .26rem 0;
    border-bottom: .04rem solid transparent
  }

  .invoiceListPage .navBar .selectedTab {
    border-bottom: .04rem solid #1fa2ff
  }

  .invoiceListPage .invoiceList {
    padding: .1rem 0 1rem;
    background: #f7f7f7;
    margin-top: .1rem
  }

  .invoiceListPage .invoiceList .promotion {
    width: .88rem;
    height: .28rem;
    align-self: center;
    margin-right: .1rem
  }

  .invoiceListPage .invoiceList .item {
    width: 100vw;
    padding: .3rem;
    margin-bottom: .2rem;
    background: #fff
  }

  .invoiceListPage .invoiceList .item .meeting-title {
    font-size: .32rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    color: #000
  }

  .invoiceListPage .invoiceList .item .meeting-time {
    font-size: .28rem;
    color: #9b9b9b;
    padding: .2rem 0
  }

  .invoiceListPage .invoiceList .item .ticketNumber-money {
    display: flex
  }

  .invoiceListPage .invoiceList .item .ticketNumber-money p {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    align-items: center
  }

  .invoiceListPage .invoiceList .item .ticketNumber-money p.left {
    font-size: .28rem;
    color: #9b9b9b
  }

  .invoiceListPage .invoiceList .item .ticketNumber-money p.right {
    font-size: .32rem;
    color: #1fa2ff;
    text-align: right
  }

  .invoiceListPage .invoiceList .item2 {
    padding: .3rem;
    background: #fff;
    margin-bottom: .2rem
  }

  .invoiceListPage .invoiceList .item2 .meeting-title {
    font-size: .32rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    color: #000
  }

  .invoiceListPage .invoiceList .item2 .order-number {
    font-size: .28rem;
    color: #9b9b9b;
    padding: .3rem 0
  }

  .invoiceListPage .invoiceList .item2 .pay-time, .invoiceListPage .invoiceList .item2 .up-time {
    font-size: .28rem;
    color: #9b9b9b;
    padding-bottom: .3rem
  }

  .invoiceListPage .invoiceList .item2 .money-all {
    font-size: .32rem;
    color: #1fa2ff
  }

  .invoiceInfo-content[data-v-76c0999d] {
    background: #fff;
    padding: .2rem .5rem .5rem
  }

  .invoiceInfo-content .line-info[data-v-76c0999d] {
    font-size: .32rem;
    margin-top: .3rem
  }

  .invoiceInfo-content .line-info .label[data-v-76c0999d] {
    color: #000;
    line-height: .5rem;
    margin-right: .2rem
  }

  .invoiceInfo-content .line-info .info[data-v-76c0999d] {
    color: #646464;
    line-height: .5rem;
    word-break: break-all
  }

  .invoiceInfo-content .divide[data-v-76c0999d] {
    height: .02rem;
    margin-top: .3rem;
    background: #f0f0f0
  }

  .successinvoice[data-v-548110b1] {
    width: 100%;
    overflow: hidden;
    padding-left: .76rem;
    background: #fff;
    padding-right: .76rem;
    box-sizing: border-box;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box
  }

  .successinvoice .success-invoice-img[data-v-548110b1] {
    text-align: center
  }

  .successinvoice .success-invoice-img .success-invoiceImg[data-v-548110b1] {
    height: 2.74rem;
    width: 2.84rem;
    margin: 1.14rem auto .6rem;
    background-image: url("/static/images/icon_shiney/G.png");
    background-repeat: no-repeat;
    background-size: 100% 100%
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .successinvoice .success-invoice-img .success-invoiceImg[data-v-548110b1] {
      background-image: url("/static/images/icon_shiney/G@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .successinvoice .success-invoice-img .success-invoiceImg[data-v-548110b1] {
      background-image: url("/static/images/icon_shiney/G@3x.png")
    }
  }

  .successinvoice .success-invoice-img > p[data-v-548110b1] {
    font-size: .4rem;
    color: #4c3a30
  }

  .successinvoice .success-invoice-text[data-v-548110b1] {
    margin-top: 1.8rem
  }

  .successinvoice .success-invoice-text > button[data-v-548110b1] {
    display: block;
    height: .8rem;
    line-height: .8rem;
    font-size: .3rem;
    color: #fff;
    text-align: center;
    width: 100%;
    background: #1fa2ff;
    border-radius: .05rem
  }

  .mineCell {
    height: 1.1rem;
    line-height: 1.1rem;
    padding-left: .3rem;
    background: url("/static/images/rightArrow@2x.png") right .3rem center no-repeat #fff;
    background-size: .14rem .25rem;
    position: relative
  }

  .mineCell:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .mineCell:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .mineCell:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .titleBar {
    position: relative
  }

  .titleBar:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .titleBar:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .titleBar:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .cell-input {
    height: 1rem;
    padding: 0 .3rem;
    align-items: center;
    -webkit-align-items: center;
    background: #fff;
    position: relative
  }

  .cell-input:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .cell-input:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .cell-input:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .cell-input p {
    font-size: .3rem;
    margin-right: .2rem
  }

  .cell-input input {
    line-height: .3rem;
    font-size: .3rem
  }

  .ypl-setup-page .sign {
    color: #fff;
    height: .8rem;
    line-height: .8rem;
    text-align: center;
    font-size: .34rem;
    margin: 1.72rem 1.05rem;
    background: #3498db;
    border-radius: .04rem
  }

  .resetPwd-page .btn-confirm {
    color: #fff;
    margin: 1.2rem;
    height: .9rem;
    line-height: .9rem;
    font-size: .3rem;
    text-align: center;
    background: #1fa2ff
  }

  .mineCell {
    height: 1.1rem;
    line-height: 1.1rem;
    padding-left: .3rem;
    background: url("/static/images/rightArrow@2x.png") right .3rem center no-repeat #fff;
    background-size: .14rem .25rem;
    position: relative
  }

  .mineCell:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .mineCell:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .mineCell:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .titleBar {
    position: relative
  }

  .titleBar:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .titleBar:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .titleBar:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .cell-input {
    height: 1rem;
    padding: 0 .3rem;
    align-items: center;
    -webkit-align-items: center;
    background: #fff;
    position: relative
  }

  .cell-input:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .cell-input:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .cell-input:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .cell-input p {
    font-size: .3rem;
    margin-right: .2rem
  }

  .cell-input input {
    line-height: .3rem;
    font-size: .3rem
  }

  .ypl-setup-page .sign {
    color: #fff;
    height: .8rem;
    line-height: .8rem;
    text-align: center;
    font-size: .34rem;
    margin: 1.72rem 1.05rem;
    background: #3498db;
    border-radius: .04rem
  }

  .resetPwd-page .btn-confirm {
    color: #fff;
    margin: 1.2rem;
    height: .9rem;
    line-height: .9rem;
    font-size: .3rem;
    text-align: center;
    background: #1fa2ff
  }

  .feedbackPage[data-v-83d6f092] {
    padding: .3rem;
    background: #fff;
    position: relative
  }

  .feedbackPage h6[data-v-83d6f092] {
    color: #333;
    font-size: .3rem;
    font-weight: 500
  }

  .feedbackPage textarea[data-v-83d6f092] {
    height: 4.8rem
  }

  .feedbackPage input[data-v-83d6f092], .feedbackPage textarea[data-v-83d6f092] {
    width: 100%;
    padding: .24rem;
    font-size: .24rem;
    background: #f9f9fd;
    margin-top: .24rem;
    border-radius: .08rem;
    border: .01rem solid rgba(0, 0, 0, .1)
  }

  .feedbackPage p[data-v-83d6f092] {
    top: 5.2rem;
    right: .5rem;
    color: #aeaeae;
    font-size: .24rem;
    position: absolute
  }

  .btn-feedback[data-v-83d6f092] {
    color: #fff;
    height: .8rem;
    line-height: .8rem;
    font-size: .32rem;
    text-align: center;
    margin: .4rem 1.3rem;
    background: #1fa2ff;
    border-radius: .04rem
  }

  .ypl-comment-component .title {
    background: #fff;
    margin-top: .3rem
  }

  .ypl-comment-component .title .title-left {
    text-indent: .4rem;
    color: #000;
    text-align: left;
    border-left: .03rem solid #1fa2ff;
    float: left
  }

  .ypl-comment-component .title .title-right {
    color: #1fa2ff;
    font-size: .28rem;
    padding-right: .26rem;
    text-align: right;
    float: right
  }

  .ypl-comment-component .title .title-right .wei-icon {
    display: inline-block;
    width: .31rem;
    height: .31rem;
    background-image: url("/static/assets/devin/icon/ic_hdsy_evaluation_default.png");
    background-repeat: no-repeat;
    background-size: .31rem .31rem;
    vertical-align: middle
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-comment-component .title .title-right .wei-icon {
      background-image: url("/static/assets/devin/icon/ic_hdsy_evaluation_default@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-comment-component .title .title-right .wei-icon {
      background-image: url("/static/assets/devin/icon/ic_hdsy_evaluation_default@3x.png")
    }
  }

  .ypl-comment-component .title .title-right .to-comment {
    width: 1.5rem
  }

  .ypl-comment-component .comment-content {
    padding: .3rem
  }

  .ypl-comment-component .comment-content .meeting-recommends {
    padding: .2rem 0 0
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper img {
    width: .8rem;
    height: .8rem;
    border-radius: 100%;
    vertical-align: top
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .right {
    width: 5.61rem;
    margin-left: .37rem;
    border-bottom: 1px solid #f6f6f6
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .right .right-top {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    font-size: .26rem;
    line-height: .39rem
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .right .right-top span {
    flex: 1
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .right .right-top .start-time {
    text-align: right;
    font-size: .24rem
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .right .right-recommend {
    margin-top: .15rem
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .right .right-recommend p {
    line-height: .41rem
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .recommends-icon {
    margin-top: .3rem;
    color: #1fa2ff;
    overflow: hidden;
    line-height: .3rem
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .recommends-icon a {
    color: #1fa2ff
  }

  .ypl-comment-component .comment-content .meeting-recommends .recommends-show-wrapper .recommends-icon .reply {
    float: right;
    margin-left: .5rem;
    font-size: .26rem;
    color: #1fa2ff
  }

  .ypl-comment-component .comment-content .meeting-recommends .reply-recommend {
    width: 5.93rem;
    height: auto;
    margin-left: 1rem;
    margin-top: .21rem;
    padding-top: .2rem;
    padding-left: .32rem;
    padding-bottom: .2rem;
    background: #f6f6f6;
    display: flex
  }

  .ypl-comment-component .comment-content .meeting-recommends .reply-recommend img {
    width: .8rem;
    height: .8rem;
    border-radius: 100%;
    vertical-align: top
  }

  .ypl-comment-component .comment-content .meeting-recommends .reply-recommend .reply-right {
    width: 4.6rem;
    margin-left: .2rem;
    font-size: 0
  }

  .ypl-comment-component .comment-content .meeting-recommends .reply-recommend .reply-right .reply-right-top {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    font-size: .26rem;
    line-height: .39rem
  }

  .ypl-comment-component .comment-content .meeting-recommends .reply-recommend .reply-right .reply-right-top span {
    flex: 1
  }

  .ypl-comment-component .comment-content .meeting-recommends .reply-recommend .reply-right .reply-right-top .start-time {
    text-align: right;
    font-size: .24rem
  }

  .ypl-comment-component .comment-content .meeting-recommends .reply-recommend .reply-right .reply-right-recommend {
    margin-top: .15rem;
    line-height: .41rem
  }

  .ypl-comment-component .comment-nocontent {
    padding: .3rem
  }

  .ypl-comment-component .comment-nocontent .comment-first {
    height: .8rem;
    line-height: .8rem;
    margin-bottom: .34rem
  }

  .ypl-comment-component .comment-nocontent .comment-first img {
    width: .8rem;
    height: .8rem;
    border-radius: 50%;
    margin-top: -.05rem
  }

  .ypl-comment-component .comment-nocontent .comment-first div {
    align-self: center;
    margin-left: .3rem;
    padding-left: .2rem;
    width: 5.4rem;
    height: .5rem;
    line-height: .5rem;
    font-size: .28rem;
    border: 1px solid #f0f0f0;
    color: #999
  }

  .ypl-comment-component .more-recommends {
    font-size: .26rem;
    color: #1fa2ff;
    line-height: .8rem;
    text-align: center
  }

  .ypl-comment-component .meeting-delComment {
    width: 80%;
    height: 30%;
    padding: .5rem .2rem
  }

  .ypl-comment-component .meeting-delComment .meeting-delCommentTitle {
    font-size: .3rem
  }

  .ypl-comment-component .meeting-delComment .meeting-delCommentTitle p {
    margin-bottom: .3rem;
    font-size: .34rem;
    line-height: normal;
    text-align: center
  }

  .ypl-comment-component .meeting-delComment .meeting-delCommentChoose {
    display: flex;
    justify-content: space-around;
    margin-top: 1rem
  }

  .ypl-comment-component .meeting-delComment .meeting-delCommentChoose button {
    border: 1px solid #1fa2ff;
    color: #1fa2ff;
    background-color: #fff;
    font-size: .34rem;
    width: 40%;
    height: .8rem
  }

  .ypl-comment-component .meeting-comments {
    width: 100%
  }

  .ypl-comment-component .meeting-comments .meeting-comments-body {
    background-color: #f6f6f6
  }

  .ypl-comment-component .meeting-comments .meeting-comments-body .meeting-commentTitle {
    width: 100%;
    height: .8rem;
    line-height: .8rem;
    display: table;
    justify-content: space-between
  }

  .ypl-comment-component .meeting-comments .meeting-comments-body .meeting-commentTitle span {
    font-size: .3rem;
    text-align: center;
    letter-spacing: .1rem;
    color: #1fa2ff;
    display: table-cell
  }

  .ypl-comment-component .meeting-comments .meeting-comments-body .meeting-commentTitle span:nth-child(2) {
    color: #333
  }

  .ypl-comment-component .meeting-comments .meeting-comments-body .meeting-commentText {
    padding: 0 .2rem
  }

  .ypl-comment-component .meeting-comments .meeting-comments-body .meeting-commentText textarea {
    width: 100%;
    height: 1.86rem;
    border: 1px solid transparent;
    box-shadow: 0 0 1px 0 #ccc;
    font-size: .3rem;
    padding: .2rem
  }

  .sponsorCard[data-v-248965fb] {
    background: #fff;
    padding: .24rem .3rem;
    align-items: center;
    -webkit-align-items: center;
    border-bottom: 1px solid #f6f6f6
  }

  .sponsorCard .avatar[data-v-248965fb] {
    width: .9rem;
    height: .9rem;
    border-radius: 100%
  }

  .sponsorCard .vip[data-v-248965fb] {
    width: .32rem;
    height: .32rem;
    position: absolute;
    right: -.05rem;
    bottom: .1rem
  }

  .sponsorCard .sponsorName[data-v-248965fb] {
    width: 0;
    height: .5rem;
    line-height: .5rem;
    color: #000;
    font-size: .26rem;
    font-weight: 700;
    margin: 0 .16rem;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    word-break: break-all
  }

  .sponsorCard .dialogue[data-v-248965fb] {
    height: 1.1rem;
    align-self: center;
    -webkit-align-self: center;
    padding: .3rem .3rem .3rem 0
  }

  .sponsorCard .dialogue img[data-v-248965fb] {
    width: .52rem;
    height: .5rem
  }

  .sponsorCard .contactTel[data-v-248965fb] {
    width: .52rem;
    height: .48rem;
    padding: .1rem;
    align-items: center;
    border-radius: .04rem;
    border: 1px solid #1fa2ff
  }

  .sponsorCard .contactTel img[data-v-248965fb] {
    width: .3rem;
    height: .3rem
  }

  .sponsorCard .attention[data-v-248965fb] {
    color: #fff;
    background: #1fa2ff
  }

  .sponsorCard .attention[data-v-248965fb], .sponsorCard .unAttention[data-v-248965fb] {
    height: .48rem;
    line-height: .48rem;
    padding: 0 .14rem;
    font-size: .24rem;
    border-radius: .04rem;
    border: 1px solid #1fa2ff
  }

  .sponsorCard .unAttention[data-v-248965fb] {
    color: #1fa2ff;
    background: #fff
  }

  .downloadAppBar {
    padding: .32rem;
    text-align: center;
    align-items: center;
    background: #fff;
    border-top: .01rem solid rgba(7, 154, 234, .3)
  }

  .downloadAppBar .notice {
    width: .34rem;
    height: .4rem;
    margin-right: .25rem
  }

  .downloadAppBar .close {
    width: .26rem;
    height: .26rem
  }

  .ypl-meetingC-wrapper .meeting-sign-up {
    height: .9rem;
    z-index: 100;
    font-size: 0;
    border-top: .01rem solid rgba(7, 154, 234, .3)
  }

  .ypl-meetingC-wrapper .meeting-sign-up div {
    font-size: .26rem;
    line-height: .9rem;
    text-align: center
  }

  .ypl-meetingC-wrapper .meeting-sign-up .collect {
    height: .9rem;
    background: #fff;
    text-align: center;
    justify-content: center;
    float: left
  }

  .ypl-meetingC-wrapper .meeting-sign-up .collect span {
    font-size: .27rem
  }

  .ypl-meetingC-wrapper .meeting-sign-up .collect span i {
    display: inline-block;
    color: #1fa2ff;
    background-size: .28rem .27rem;
    margin-right: .2rem;
    vertical-align: top
  }

  .ypl-meetingC-wrapper .meeting-sign-up .sign-up {
    color: #fff;
    float: right;
    background: #1fa2ff
  }

  .ypl-meetingC-wrapper .meeting-sign-up .sign-up-gray {
    background: #aaa
  }

  .ypl-meetingC-wrapper .meeting-sign-up .countTime {
    color: #1fa2ff;
    font-size: .24rem;
    font-weight: 400;
    background: rgba(7, 154, 234, .1)
  }

  .ypl-meetingC-wrapper .meeting-sign-up .countTime .day {
    color: #1fa2ff;
    font-size: .24rem;
    font-weight: 700
  }

  .ypl-meetingC-wrapper .meeting-sign-up .countTime .hour {
    color: #fff;
    font-size: .24rem;
    font-weight: 700;
    padding: .15rem;
    background: #1fa2ff;
    border-radius: .04rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content {
    -webkit-overflow-scrolling: touch;
    width: 100%;
    overflow-x: hidden
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header {
    width: 100vw;
    height: auto
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-pic {
    width: 100vw;
    height: 3.66rem;
    font-size: 0;
    position: relative;
    left: 0;
    top: 0
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-pic img {
    width: 100%;
    height: 3.66rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-pic p {
    width: 1.5rem;
    height: .45rem;
    padding: .09rem .3rem;
    font-size: 0;
    position: absolute;
    right: .22rem;
    bottom: .22rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-pic p span {
    font-size: .26rem;
    color: #fff
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-title {
    padding: .3rem;
    font-size: .34rem;
    line-height: .4rem;
    color: #000
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-title .promotion {
    width: .88rem;
    height: .28rem;
    display: inline-block;
    margin-right: .1rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top {
    position: relative;
    left: 0;
    top: 0;
    padding-bottom: .35rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .personInfo {
    padding-right: .32rem;
    font-size: 0;
    text-align: right
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .personInfo .eye-icon {
    width: .28rem;
    height: .17rem;
    display: inline-block;
    margin-left: .46rem;
    background-image: url("/static/assets/devin/icon/ic_gjsz_public_normal.png");
    background-repeat: no-repeat;
    background-size: 100% 100%
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .personInfo .eye-icon {
      background-image: url("/static/assets/devin/icon/ic_gjsz_public_normal@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .personInfo .eye-icon {
      background-image: url("/static/assets/devin/icon/ic_gjsz_public_normal@3x.png")
    }
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .personInfo span {
    font-size: .22rem;
    color: #666
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .personInfo span.totalNum, .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .personInfo span.view-number {
    color: #1fa2ff;
    padding-left: .1rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top .meeting-price {
    position: absolute;
    left: .25rem;
    top: -.05rem;
    font-size: .34rem;
    color: #1fa2ff
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-header .meeting-info-top:before {
    content: " ";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 1px;
    border-top: 1px solid #eee;
    -webkit-transform-origin: 0 0;
    transform-origin: 0 0;
    -webkit-transform: scaleY(.5);
    transform: scaleY(.5)
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info {
    width: 100%;
    height: auto
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .title {
    width: 100%;
    height: .88rem;
    color: #aaa;
    background: #f6f6f6;
    font-size: .26rem;
    padding-left: .32rem;
    text-align: left;
    line-height: .88rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time {
    width: 100%;
    height: .7rem;
    line-height: .7rem;
    font-size: 0
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time .time-left {
    padding-left: .32rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time .time-center {
    width: 6.5rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time .time-center span {
    font-size: .26rem;
    color: #000;
    letter-spacing: .01rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time .time-right {
    width: .63rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time .time-right .clockGray {
    width: .36rem;
    height: .36rem;
    background-image: url("/static/assets/devin/icon/ic_hdsy_clock_default.png");
    background-repeat: no-repeat;
    background-size: .36rem .39rem
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time .time-right .clockGray {
      background-image: url("/static/assets/devin/icon/ic_hdsy_clock_default@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-time .time-right .clockGray {
      background-image: url("/static/assets/devin/icon/ic_hdsy_clock_default@3x.png")
    }
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location {
    width: 100%;
    height: .7rem;
    line-height: .7rem;
    font-size: 0;
    align-items: center
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-left {
    padding-left: .32rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-left .locationGray {
    display: block;
    width: .22rem;
    height: .28rem;
    background-image: url("/static/assets/devin/icon/ic_hdsy_location_default.png");
    background-repeat: no-repeat;
    background-size: .22rem .28rem
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-left .locationGray {
      background-image: url("/static/assets/devin/icon/ic_hdsy_location_default@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-left .locationGray {
      background-image: url("/static/assets/devin/icon/ic_hdsy_location_default@3x.png")
    }
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-center {
    width: 6.5rem;
    font-size: .26rem;
    color: #000
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-center > p {
    letter-spacing: .01rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-right {
    width: .36rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-right .locationBlue {
    display: block;
    width: .36rem;
    height: .36rem;
    color: #000;
    background-image: url("/static/assets/devin/icon/ic_hdsy_position_default.png");
    background-repeat: no-repeat;
    background-size: .36rem .36rem
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-right .locationBlue {
      background-image: url("/static/assets/devin/icon/ic_hdsy_position_default@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-info .meeting-location .location-right .locationBlue {
      background-image: url("/static/assets/devin/icon/ic_hdsy_position_default@3x.png")
    }
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-source {
    width: 100%;
    height: auto
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-source .title {
    width: 100%;
    height: .16rem;
    color: #aaa;
    background: #f6f6f6;
    font-size: .26rem;
    padding-left: .32rem;
    text-align: left;
    line-height: .88rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-headerTags {
    -webkit-justify-content: space-between;
    justify-content: space-between;
    padding: 0 .3rem;
    height: .86rem;
    border-top: .2rem solid #f6f6f6;
    border-bottom: 1px solid #f6f6f6;
    display: table;
    width: 100%
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-headerTags > li {
    height: .66rem;
    line-height: .66rem;
    font-size: .28rem;
    text-align: center;
    position: relative;
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-headerTags .styleHeaderTags {
    color: #1fa2ff
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-headerTags .styleHeaderTags .meeting-headerTags-line {
    position: absolute;
    width: .6rem;
    bottom: 0;
    z-index: 1;
    background: #1fa2ff;
    display: inline-block;
    height: 2px;
    left: 50%;
    margin-left: -.3rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-introduce {
    width: 100%;
    height: auto
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-introduce .title {
    text-indent: .4rem;
    width: 100%;
    color: #000;
    background: #fff;
    text-align: left;
    margin-top: .4rem;
    border-left: .03rem solid #1fa2ff
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-introduce .introduce-content {
    font-size: 16px !important
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-introduce .introduce-content .edit-content {
    padding: .5rem .5rem 1.1rem;
    line-height: 1.5;
    word-break: break-all;
    overflow-x: hidden
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-introduce .introduce-content img {
    max-width: 100% !important;
    height: auto !important
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .noTickets {
    text-align: center;
    font-size: .32rem;
    margin-top: .3rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .title {
    text-indent: .4rem;
    width: 100%;
    color: #000;
    background: #fff;
    text-align: left;
    margin-top: .4rem;
    border-left: .03rem solid #1fa2ff
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content {
    padding: .2rem 0
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-title {
    width: 100%;
    text-align: center;
    padding: .3rem 0;
    display: table
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-title .title-left {
    width: 40%;
    color: #1fa2ff;
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-title .title-middle {
    width: 20%;
    font-size: .24rem;
    color: #1fa2ff;
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-title .title-right {
    width: 40%;
    font-size: .28rem;
    color: #1fa2ff;
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-row {
    width: 100%;
    text-align: center;
    padding: .2rem 0;
    display: table
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-name {
    width: 40%;
    font-size: .26rem;
    color: #000;
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-price {
    width: 20%;
    font-size: .26rem;
    color: #000;
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-remain {
    width: 40%;
    font-size: .26rem;
    color: #000;
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-remain .orange-font {
    color: #f67326
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .title {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    flex-direction: row;
    background: #fff;
    margin-top: .4rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .title .title-left {
    flex: 1;
    color: #000;
    border-left: .03rem solid #1fa2ff;
    text-align: left
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .title .title-right {
    flex: 1;
    color: #1fa2ff;
    font-size: .28rem;
    padding-right: .26rem;
    text-align: right
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .title .title-right span {
    margin-left: .08rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .title .more-apply {
    cursor: pointer
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .applied-person {
    text-align: center;
    font-size: 0;
    padding: .35rem 0 1.1rem;
    display: table
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .applied-person .person-info {
    display: table-cell
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .applied-person .person-info img {
    width: .7rem;
    height: .7rem;
    border-radius: 50%;
    margin-bottom: .2rem
  }

  .ypl-meetingC-wrapper .ypl-meetingC-content .meeting-applied .applied-person .person-info p {
    width: 1.2rem;
    font-size: .24rem;
    color: #000;
    margin: 0 auto;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-meetingC-wrapper .floatBtns {
    position: fixed;
    right: .3rem;
    bottom: 1.8rem;
    border-radius: .1rem;
    padding: .2rem .1rem;
    z-index: 500;
    width: 1.2rem;
    height: 2.8rem
  }

  .ypl-meetingC-wrapper .floatBtns .item {
    width: 1rem;
    height: 1rem
  }

  .ypl-meetingC-wrapper .floatBtns .item img {
    width: 100%;
    height: 100%
  }

  .comment_toast {
    z-index: 9999
  }

  .fade-enter-active[data-v-5400ae8a], .fade-leave-active[data-v-5400ae8a] {
    transition: opacity .3s
  }

  .fade-enter[data-v-5400ae8a], .fade-leave-to[data-v-5400ae8a] {
    opacity: 0
  }

  .bg-dialog[data-v-5400ae8a] {
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    bottom: -20%;
    z-index: 9;
    opacity: .6;
    background: #000
  }

  .icClose[data-v-5400ae8a] {
    top: 4.5%;
    right: 7.5%;
    z-index: 10;
    width: .58rem;
    height: .58rem;
    position: fixed
  }

  .loginDialog[data-v-5400ae8a] {
    top: 10%;
    left: 7.5%;
    width: 85%;
    z-index: 10;
    padding: .4rem;
    position: fixed;
    background: #fff;
    border-radius: .16rem
  }

  .loginDialog h5[data-v-5400ae8a] {
    color: #252525;
    font-size: .32rem;
    text-align: center
  }

  .loginDialog .inputLine[data-v-5400ae8a] {
    font-size: .28rem;
    margin-top: .3rem;
    align-items: center;
    padding-bottom: .25rem;
    border-bottom: .02rem solid #ccc
  }

  .loginDialog .inputLine input[data-v-5400ae8a] {
    font-size: .28rem
  }

  .loginDialog .inputLine .divide[data-v-5400ae8a] {
    width: 1px;
    height: .3rem;
    margin-right: .2rem;
    background: #aaa
  }

  .loginDialog .inputLine .icPhone[data-v-5400ae8a] {
    width: .3rem;
    height: .44rem;
    margin-right: .3rem
  }

  .loginDialog .inputLine .icVerify[data-v-5400ae8a] {
    width: .28rem;
    height: .32rem;
    margin-right: .3rem
  }

  .loginDialog .inputLine .verifyInput[data-v-5400ae8a] {
    width: 0
  }

  .loginDialog .error-Msg[data-v-5400ae8a] {
    height: .35rem;
    line-height: .35rem;
    color: #d0021b;
    font-size: .24rem
  }

  .loginDialog .errorMsgBox[data-v-5400ae8a] {
    justify-content: space-between
  }

  .loginDialog .errorMsgBox .unReceive[data-v-5400ae8a] {
    height: .35rem;
    line-height: .35rem;
    color: #aaa;
    font-size: .24rem
  }

  .loginDialog .text1[data-v-5400ae8a] {
    color: #3a3a3a;
    font-size: .26rem;
    margin-top: .3rem;
    text-align: center
  }

  .loginDialog .text2[data-v-5400ae8a] {
    color: #aaa;
    font-size: .24rem;
    margin-top: .2rem;
    text-align: center
  }

  .loginDialog button[data-v-5400ae8a] {
    width: 90%;
    color: #fff;
    height: .66rem;
    margin: .4rem 5%;
    font-size: .28rem;
    background: #ccc;
    border-radius: .08rem
  }

  .loginDialog .enable[data-v-5400ae8a] {
    background: #1fa2ff
  }

  .promptDialog .bg-prompt[data-v-5400ae8a] {
    position: fixed;
    top: 0;
    left: 0;
    z-index: 12;
    width: 100%;
    height: 100%;
    opacity: .6;
    background: #000
  }

  .promptDialog .prompt[data-v-5400ae8a] {
    top: 10%;
    left: 10%;
    width: 80%;
    z-index: 15;
    padding: 0 .2rem;
    position: fixed;
    background: #fff;
    border-radius: .16rem
  }

  .promptDialog .prompt .header[data-v-5400ae8a] {
    height: .76rem;
    line-height: .76rem;
    color: #252525;
    font-size: .28rem;
    text-align: center;
    margin-bottom: .2rem;
    border-bottom: .01rem solid #ccc
  }

  .promptDialog .prompt .body[data-v-5400ae8a] {
    height: 5.5rem;
    color: #252525;
    overflow: scroll;
    font-size: .24rem;
    line-height: .34rem
  }

  .promptDialog .prompt .footer[data-v-5400ae8a] {
    height: .88rem;
    line-height: .88rem;
    color: #1fa2ff;
    font-size: .32rem;
    text-align: center;
    margin-top: .2rem;
    border-top: .01rem solid #ccc
  }

  .ypl-meeting-applied-list-wrapper[data-v-f03e4576] {
    overflow: hidden
  }

  .ypl-meeting-applied-list-wrapper .ypl-meeting-applied-list-content[data-v-f03e4576] {
    -webkit-overflow-scrolling: touch
  }

  .ypl-meeting-applied-list-wrapper .ypl-meeting-applied-list-content .user-item-list[data-v-f03e4576] {
    line-height: 30px;
    font-size: 0
  }

  .ypl-meeting-applied-list-wrapper .ypl-meeting-applied-list-content .user-item-list li[data-v-f03e4576] {
    padding: 10px 0
  }

  .ypl-meeting-applied-list-wrapper .ypl-meeting-applied-list-content .user-item-list span[data-v-f03e4576] {
    vertical-align: middle
  }

  .ypl-meeting-applied-list-wrapper .ypl-meeting-applied-list-content .user-item-list span img[data-v-f03e4576] {
    vertical-align: middle;
    border-radius: 50%
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content {
    overflow: auto;
    -webkit-overflow-scrolling: touch
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row {
    height: auto;
    min-height: 1px;
    background: #fff;
    margin-bottom: .25rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal {
    height: 2.3rem;
    font-size: 0;
    position: relative
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-top {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    font-size: .34rem;
    padding: .3rem .3rem .2rem;
    overflow: hidden
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-top .ticket-title {
    width: 75%;
    float: left;
    text-align: left
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-top .ticket-title .title-content {
    width: 65%;
    letter-spacing: .01rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-top .ticket-title .left-ticketNumber-wrapper {
    font-size: .28rem;
    color: #aaa;
    margin-left: .3rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-top .ticket-title .left-ticketNumber-wrapper .ticket-number {
    color: #ff7200
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-top .ticket-price {
    width: 25%;
    float: right;
    color: #1fa2ff;
    text-align: right
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-middle {
    font-size: .24rem;
    color: #aaa;
    padding-left: .3rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom {
    font-size: .28rem;
    line-height: .4rem;
    padding: .2rem .3rem 0
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .left {
    color: #d0021b;
    font-size: .24rem;
    align-self: center
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .left .arrow-toggle {
    align-self: center;
    display: inline-block;
    width: .2rem;
    height: .1rem;
    margin-left: .1rem;
    background-size: .2rem .1rem;
    background-image: url("/static/assets/devin/icon/arrow-down-red.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .left .arrow-toggle {
      background-image: url("/static/assets/devin/icon/arrow-down-red@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .left .arrow-toggle {
      background-image: url("/static/assets/devin/icon/arrow-down-red@3x.png")
    }
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .left .arrow-toggle.arrowUp {
    background-image: url("/static/assets/devin/icon/arrow-up-red.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .left .arrow-toggle.arrowUp {
      background-image: url("/static/assets/devin/icon/arrow-up-red@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .left .arrow-toggle.arrowUp {
      background-image: url("/static/assets/devin/icon/arrow-up-red@3x.png")
    }
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right {
    align-self: flex-end
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right .end {
    color: #ff7200;
    font-size: .26rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right .decrease {
    float: left;
    width: .5rem;
    height: .5rem;
    position: relative;
    border: 1px solid #1fa2ff;
    border-radius: 100%
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right .decrease:after {
    content: "";
    display: block;
    position: absolute;
    width: .22rem;
    height: 2px;
    background: #1fa2ff;
    border-radius: 2px;
    top: 50%;
    left: 50%;
    margin-top: -1px;
    margin-left: -.11rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right .number {
    float: left;
    width: .77rem;
    height: .5rem;
    line-height: .5rem;
    text-align: center;
    display: block;
    border: 0
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right .increase {
    float: left;
    width: .5rem;
    height: .5rem;
    position: relative;
    border: 1px solid #1fa2ff;
    background: #1fa2ff;
    border-radius: 100%
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right .increase:after {
    content: "";
    display: block;
    position: absolute;
    width: .22rem;
    height: 2px;
    background: #fff;
    top: 50%;
    left: 50%;
    margin-left: -.11rem;
    margin-top: -1px;
    border-radius: 2px
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-normal .ticket-bottom .right .increase:before {
    content: "";
    display: block;
    position: absolute;
    width: 2px;
    height: .22rem;
    background: #fff;
    top: 50%;
    left: 50%;
    margin-left: -1px;
    margin-top: -.11rem;
    border-radius: 2px
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row {
    padding: .15rem .3rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .checkbox-coupon {
    width: .6rem;
    height: .9rem;
    align-self: center;
    padding: .3rem .3rem .3rem 0
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .checkbox-coupon img {
    width: .3rem;
    height: .3rem;
    align-self: center
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right {
    margin-left: .15rem;
    width: 6rem;
    height: 1.64rem;
    background-size: 6rem 1.64rem;
    font-size: 0;
    display: flex
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right.right-discount {
    background-image: url("/static/assets/devin/icon/bg-discount.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right.right-discount {
      background-image: url("/static/assets/devin/icon/bg-discount@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right.right-discount {
      background-image: url("/static/assets/devin/icon/bg-discount@3x.png")
    }
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right.right-money {
    background-image: url("/static/assets/devin/icon/money_discount.png");
    background-repeat: no-repeat
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right.right-money {
      background-image: url("/static/assets/devin/icon/money_discount@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right.right-money {
      background-image: url("/static/assets/devin/icon/money_discount@3x.png")
    }
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-left {
    width: 2.1rem;
    height: 1.64rem;
    font-size: .91rem;
    color: #fdff1b;
    text-align: center;
    line-height: 1.64rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-left span {
    font-size: .36rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .money-content-left {
    width: 2.1rem;
    color: #fff;
    text-align: center
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .money-content-left .title {
    padding-top: .15rem;
    font-size: .32rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .money-content-left .content {
    font-size: .4rem;
    margin-top: .2rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .money-content-left .content span {
    font-size: .32rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right {
    width: 3.9rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right.discount-content {
    color: #fff
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right.money-content {
    color: #484848
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right p {
    padding-left: .24rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right p.title {
    width: 3.4rem;
    font-size: .32rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    padding-top: .15rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right p.discount-time {
    margin-top: .1rem;
    font-size: .24rem
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right p.discount-limit {
    padding-top: .08rem;
    font-size: .24rem;
    color: #fff241
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right p.money-time {
    margin-top: .1rem;
    font-size: .24rem;
    color: #ea6161
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .discount-introduction .discount-row .right .content-right p.money-limit {
    padding-top: .15rem;
    font-size: .24rem;
    color: #9d9c9c
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-supplement {
    width: 100vw;
    height: .7rem;
    background: rgba(52, 152, 219, .3);
    font-size: .24rem;
    line-height: .7rem;
    padding-left: .32rem;
    padding-right: .25rem;
    position: relative;
    left: 0;
    top: 0
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-supplement .more-info-title {
    width: 3.9rem;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-supplement .more-info {
    position: absolute;
    right: .25rem;
    top: 0;
    color: #1fa2ff
  }

  .ypl-meeting-ticket-wrapper .ypl-meeting-ticket-content .ticket-row .content-supplement-content {
    width: 100vw;
    background: rgba(52, 152, 219, .3);
    font-size: .24rem;
    line-height: .7rem;
    padding-left: .32rem;
    padding-right: .25rem
  }

  .ypl-meeting-ticket-wrapper .bottomBar {
    height: .98rem;
    background: #fff;
    border-top: .01rem solid rgba(7, 154, 234, .3)
  }

  .ypl-meeting-ticket-wrapper .bottomBar .totalMoney {
    padding: .1rem .3rem;
    justify-content: center
  }

  .ypl-meeting-ticket-wrapper .bottomBar .totalMoney .real {
    color: #1fa2ff;
    font-size: .48rem
  }

  .ypl-meeting-ticket-wrapper .bottomBar .totalMoney .real span {
    color: #000;
    font-size: .32rem
  }

  .ypl-meeting-ticket-wrapper .bottomBar .totalMoney .coupon {
    color: #d0021b;
    font-size: .24rem
  }

  .ypl-meeting-ticket-wrapper .bottomBar .btn {
    color: #fff;
    font-size: .36rem;
    background: #1fa2ff
  }

  .ypl-meeting-singUp-success-wrapper {
    width: 100vw;
    height: 100vh;
    overflow: hidden
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content {
    width: 100vw;
    height: 100vh;
    overflow: auto;
    -webkit-overflow-scrolling: touch;
    background: #fff;
    position: relative;
    left: 0;
    top: 0
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .logo-title {
    width: 100%;
    height: 100%;
    position: relative;
    left: 0;
    top: 0
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .logo-title .success-icon {
    width: 3.52rem;
    height: 2.78rem;
    position: absolute;
    left: 2rem;
    top: 1.38rem;
    background-image: url("/static/assets/devin/icon/success_ticket_icon.png");
    background-repeat: no-repeat;
    background-size: 100% 100%
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .logo-title .success-icon {
      background-image: url("/static/assets/devin/icon/success_ticket_icon@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .logo-title .success-icon {
      background-image: url("/static/assets/devin/icon/success_ticket_icon@3x.png")
    }
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .logo-title .title-one {
    position: absolute;
    left: 0;
    top: 5.08rem;
    width: 100%;
    text-align: center;
    font-size: .4rem;
    color: #4c3a30
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .logo-title .title-two {
    position: absolute;
    left: 0;
    top: 5.8rem;
    width: 100%;
    text-align: center;
    font-size: .24rem;
    color: #a4a4a4
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .btn-meeting-details {
    width: 5.4rem;
    height: .88rem;
    position: fixed;
    left: 1.03rem;
    bottom: 2.2rem;
    line-height: .88rem;
    font-size: .34rem;
    border-radius: .05rem;
    margin: 0 auto;
    color: #fff;
    text-align: center;
    background: #1fa2ff;
    display: flex;
    align-items: center;
    justify-content: center
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .btn-meeting-details span.arrow-icon {
    display: inline-block;
    width: .46rem;
    height: .46rem;
    background-image: url("/static/assets/devin/icon/arrow_left_circle.png");
    background-repeat: no-repeat;
    background-size: 100% 100%;
    margin-right: .14rem
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .btn-meeting-details span.arrow-icon {
      background-image: url("/static/assets/devin/icon/arrow_left_circle@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .btn-meeting-details span.arrow-icon {
      background-image: url("/static/assets/devin/icon/arrow_left_circle@3x.png")
    }
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .fade-enter-active, .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .fade-leave-active {
    transition: opacity .3s
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .fade-enter, .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .fade-leave-to {
    opacity: 0
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster {
    /*    !*background-image: url("../../assets/img/img_bg_signUp_poster.png");*!*/
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .mask {
    position: fixed;
    top: 0;
    left: 0;
    z-index: 9;
    width: 100%;
    height: 100%;
    opacity: .6;
    background: #000
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .close {
    width: .58rem;
    height: .58rem;
    top: 1.24rem;
    right: 1rem;
    z-index: 100;
    position: fixed
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .realPoster {
    top: 1rem;
    width: 78%;
    opacity: 0;
    z-index: 20;
    margin: 0 11%;
    position: fixed;
    border-radius: .08rem
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .posterCon {
    top: 1rem;
    width: 78%;
    z-index: 10;
    margin: 0 11%;
    position: fixed;
    border-radius: .08rem;
    color: #fff;
    text-align: center
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .posterCon img {
    width: 100%;
    height: 9.2rem
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .posterCon h6 {
    left: 0;
    top: 3.5rem;
    width: 100%;
    font-size: .4rem;
    position: absolute
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .posterCon h5 {
    left: 0;
    top: 4.2rem;
    width: 100%;
    font-size: .52rem;
    position: absolute
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .posterCon .qr {
    width: 1.8rem;
    height: 1.8rem;
    bottom: 1rem;
    position: absolute;
    margin-left: -.9rem
  }

  .ypl-meeting-singUp-success-wrapper .ypl-meeting-signUp-success-content .signUpPoster .posterCon p {
    font-size: .24rem;
    text-align: center;
    width: 100%;
    bottom: .5rem;
    position: absolute
  }

  .ypl-group-wrapper {
    width: 100%;
    height: 100%;
    overflow: hidden;
    background: #fff
  }

  .ypl-group-wrapper .ypl-group-content {
    width: 100%;
    overflow-x: hidden;
    overflow-y: auto;
    -webkit-overflow-scrolling: touch
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header {
    width: 100vw;
    height: auto
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-pic {
    width: 100vw;
    height: 3.66rem;
    position: relative;
    left: 0;
    top: 0
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-pic img {
    width: 100%;
    height: 3.66rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-pic p {
    width: 1.5rem;
    height: .45rem;
    padding: .09rem .3rem;
    font-size: 0;
    position: absolute;
    right: .22rem;
    bottom: .22rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-pic p span {
    font-size: .26rem;
    color: #fff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-title {
    padding: .37rem 0 .3rem .32rem;
    font-size: .34rem;
    color: #000
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top {
    position: relative;
    left: 0;
    top: 0;
    padding-bottom: .35rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top .personInfo {
    padding-right: .32rem;
    font-size: 0;
    text-align: right
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top .personInfo .eye-icon {
    width: .28rem;
    height: .17rem;
    display: inline-block;
    margin-left: .46rem;
    background-size: 100% 100%
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top .personInfo span {
    font-size: .2rem;
    color: #666
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top .personInfo span.totalNum, .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top .personInfo span.view-number {
    color: #1fa2ff;
    padding-left: .1rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top .meeting-price {
    position: absolute;
    left: .25rem;
    top: -.05rem;
    font-size: .34rem;
    color: #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-header .meeting-info-top:before {
    content: " ";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 1px;
    border-top: 1px solid #eee;
    -webkit-transform-origin: 0 0;
    transform-origin: 0 0;
    -webkit-transform: scaleY(.5);
    transform: scaleY(.5)
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info {
    width: 100%;
    height: auto;
    margin-top: .3rem;
    margin-bottom: .2rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .title {
    width: 100%;
    height: .88rem;
    color: #aaa;
    background: #f6f6f6;
    font-size: .26rem;
    padding-left: .32rem;
    text-align: left;
    line-height: .88rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-time {
    width: 100%;
    height: .7rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    line-height: .7rem;
    font-size: 0;
    -ms-flex-align: center;
    align-items: center;
    -webkit-box-orient: horizontal;
    -ms-flex-direction: row;
    flex-direction: row
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-time .time-left {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding-left: .32rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-time .time-left .clockGray {
    width: .36rem;
    height: .36rem;
    background-size: .36rem .39rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-time .time-center {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    width: 6.5rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-time .time-center span {
    font-size: .26rem;
    color: #666;
    letter-spacing: .01rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-time .time-right {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    width: .63rem;
    height: 100%
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-time .time-right .clockGray {
    width: .36rem;
    height: .36rem;
    background-size: .36rem .39rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-location {
    width: 100%;
    height: .7rem;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    line-height: .7rem;
    font-size: .24rem;
    -ms-flex-align: center;
    align-items: center;
    -webkit-box-orient: horizontal;
    -ms-flex-direction: row;
    flex-direction: row
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-location .location-left {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    padding-left: .32rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-location .location-left .locationGray {
    display: block;
    width: .22rem;
    height: .28rem;
    background-size: .22rem .28rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-location .location-center {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    width: 6.5rem;
    font-size: .26rem;
    color: #666
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-location .location-center > p {
    letter-spacing: .01rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-location .location-right {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    width: .36rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-info .meeting-location .location-right .locationBlue {
    display: block;
    width: .36rem;
    height: .36rem;
    color: #000;
    background-size: .36rem .36rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-source {
    width: 100%;
    height: auto
  }

  .ypl-group-wrapper .ypl-group-content .meeting-source .title {
    width: 100%;
    height: .16rem;
    color: #aaa;
    background: #f6f6f6;
    font-size: .26rem;
    padding-left: .32rem;
    text-align: left;
    line-height: .88rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-headerTags {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    -webkit-justify-content: space-between;
    justify-content: space-between;
    padding: 0 .3rem;
    height: .86rem;
    border-top: .2rem solid #f6f6f6;
    position: relative
  }

  .ypl-group-wrapper .ypl-group-content .meeting-headerTags:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border: 0 1px 0;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-group-wrapper .ypl-group-content .meeting-headerTags:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-group-wrapper .ypl-group-content .meeting-headerTags:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-group-wrapper .ypl-group-content .meeting-headerTags > li {
    width: 1.4rem;
    height: .66rem;
    line-height: .66rem;
    font-size: .28rem;
    text-align: center;
    position: relative
  }

  .ypl-group-wrapper .ypl-group-content .meeting-headerTags .styleHeaderTags {
    color: #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-headerTags .styleHeaderTags .meeting-headerTags-line {
    position: absolute;
    width: .6rem;
    bottom: 0;
    z-index: 1;
    background: #1fa2ff;
    display: inline-block;
    height: 2px;
    left: 50%;
    margin-left: -.3rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-headerTags:before {
    content: " ";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 1px;
    border-top: 1px solid hsla(0, 0%, 61%, .17);
    -webkit-transform-origin: 0 0;
    transform-origin: 0 0;
    -webkit-transform: scaleY(.9);
    transform: scaleY(.9)
  }

  .ypl-group-wrapper .ypl-group-content .meeting-introduce {
    width: 100%;
    height: auto
  }

  .ypl-group-wrapper .ypl-group-content .meeting-introduce .title {
    text-indent: .4rem;
    width: 100%;
    color: #000;
    background: #fff;
    text-align: left;
    margin-top: .4rem;
    border-left: .03rem solid #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-introduce .introduce-content {
    font-size: 16px !important
  }

  .ypl-group-wrapper .ypl-group-content .meeting-introduce .introduce-content .edit-content {
    padding: .5rem .5rem 1.1rem;
    line-height: 1.5;
    word-break: break-all;
    overflow-x: hidden
  }

  .ypl-group-wrapper .ypl-group-content .meeting-introduce .introduce-content img {
    max-width: 100% !important;
    height: auto !important
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .title {
    text-indent: .4rem;
    width: 100%;
    color: #000;
    background: #fff;
    text-align: left;
    margin-top: .4rem;
    border-left: .03rem solid #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content {
    padding: .2rem 0
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-title {
    width: 100%;
    display: table;
    text-align: center;
    padding: .3rem 0
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-title .title-left {
    width: 40%;
    display: table-cell;
    font-size: .24rem;
    color: #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-title .title-middle {
    width: 20%;
    display: table-cell;
    font-size: .24rem;
    color: #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-title .title-right {
    width: 40%;
    display: table-cell;
    font-size: .24rem;
    color: #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-row {
    width: 100%;
    display: table;
    -ms-flex-align: center;
    align-items: center;
    -webkit-box-orient: horizontal;
    -ms-flex-direction: row;
    flex-direction: row;
    text-align: center;
    padding: .2rem 0
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-name {
    width: 40%;
    display: table-cell;
    font-size: .26rem;
    color: #000
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-price {
    width: 20%;
    display: table-cell;
    font-size: .26rem;
    color: #000
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-remain {
    width: 40%;
    display: table-cell;
    font-size: .26rem;
    color: #000
  }

  .ypl-group-wrapper .ypl-group-content .meeting-tickets-info .tickets-info-content .tickets-row .ticket-remain .orange-font {
    color: #f67326
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .title {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    flex-direction: row;
    background: #fff;
    margin-top: .4rem;
    overflow: hidden
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .title .title-left {
    flex: 1;
    text-indent: .4rem;
    color: #000;
    border-left: .03rem solid #1fa2ff;
    text-align: left
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .title .title-right {
    flex: 1;
    color: #1fa2ff;
    font-size: .26rem;
    padding-right: .26rem;
    text-align: right
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .title .more-apply {
    cursor: pointer
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .applied-person {
    text-align: center;
    font-size: 0;
    overflow: hidden;
    margin-left: .15rem;
    margin-right: .15rem;
    padding: .35rem 0 1.1rem;
    display: table
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .applied-person .person-info {
    display: table-cell
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .applied-person .person-info img {
    width: .7rem;
    height: .7rem;
    border-radius: 50%;
    margin-bottom: .2rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-applied .applied-person .person-info p {
    width: 1.2rem;
    font-size: .24rem;
    color: #000;
    margin: 0 auto;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group {
    width: 100%;
    background: #fff;
    margin-bottom: 1.5rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .title {
    width: 100%;
    color: #000;
    text-indent: .4rem;
    background: #fff;
    text-align: left;
    margin-top: .4rem;
    border-left: .03rem solid #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody {
    position: relative;
    margin: .4rem .1rem;
    font-size: .28rem;
    height: 1.68rem;
    overflow: hidden;
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    width: 97%;
    border: 1px solid #3498db
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody .meeting-groupimg {
    height: 1.68rem;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    line-height: 1.68rem;
    display: table-cell;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody .meeting-groupimg > img {
    width: .88rem;
    float: left;
    height: .88rem;
    border-radius: .44rem;
    margin-top: .44rem;
    margin-left: .15rem;
    display: inline-block;
    margin-right: .3rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody .meeting-grouptext {
    text-align: right;
    display: table-cell
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody .meeting-grouptext .meeting-groupnum {
    margin-top: .5rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody .meeting-grouptext .meeting-grouptime {
    margin-top: .2rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody .meeting-grouptext .meeting-grouptime > span {
    color: #ff7200
  }

  .ypl-group-wrapper .ypl-group-content .meeting-group .meeting-groupbody .meeting-groupbutton {
    width: 2rem;
    height: .68rem;
    color: #fff;
    font-size: .28rem;
    margin-top: .5rem;
    margin-left: .3rem;
    background: #3498db;
    text-align: center;
    line-height: .68rem;
    border-radius: .1rem;
    margin-right: .13rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam {
    width: 100%;
    background: #fff;
    margin-bottom: .5rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam .title {
    width: 100%;
    text-indent: .4rem;
    color: #000;
    background: #fff;
    text-align: left;
    margin-top: .4rem;
    border-left: .03rem solid #1fa2ff
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam .meeting-groupbody {
    height: 3.66rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam .meeting-groupbody .meeting-groupbodyheadimg {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    -webkit-justify-content: space-around;
    justify-content: space-around
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam .meeting-groupbody .meeting-groupbodyheadimg .meeting-groupbodyheadimg-li {
    margin-top: .5rem;
    width: 1rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam .meeting-groupbody .meeting-groupbodyheadimg .meeting-groupbodyheadimg-li .meeting-groupbodyheadimg-liimg {
    width: 1rem;
    border-radius: .5rem;
    height: 1rem;
    background-size: 100% 100%
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam .meeting-groupbody .meeting-groupbodyheadimg .meeting-groupbodyheadimg-li .meeting-groupbodyheadimg-lispan {
    display: block;
    font-size: .24rem;
    background: #3498db;
    color: #fff;
    height: .32rem;
    width: 1rem;
    text-align: center;
    line-height: .32rem;
    border-radius: .16rem
  }

  .ypl-group-wrapper .ypl-group-content .meeting-groupteam .meeting-groupbody .meeting-groupbody-time {
    font-size: .24rem;
    text-align: center;
    margin-top: .79rem
  }

  .ypl-group-wrapper .ypl-group-content > i {
    display: inline-block;
    width: .28rem;
    background-size: .28rem .27rem;
    margin-right: .2rem;
    vertical-align: middle
  }

  .sign-up {
    flex: 3;
    color: #fff;
    background: #1fa2ff
  }

  .meeting-sign-up {
    width: 100%;
    height: .9rem;
    position: absolute;
    bottom: 0;
    left: 0;
    z-index: 100;
    font-size: 0;
    display: table;
    border-top: 1px solid #f7f7f7
  }

  .meeting-sign-up div {
    font-size: .26rem;
    text-align: center
  }

  .meeting-sign-up .collect {
    display: table-cell;
    width: 50%;
    height: .9rem;
    background: #fff;
    font-size: 0;
    align-items: center;
    text-align: center;
    justify-content: center;
    vertical-align: middle
  }

  .meeting-sign-up .collect span {
    font-size: .27rem
  }

  .meeting-sign-up .sign-up {
    display: table-cell;
    width: 50%;
    color: #fff;
    background: #1fa2ff;
    vertical-align: middle
  }

  .meeting-sign-up .sign-up.sign-up-disabled {
    opacity: .6
  }

  .meeting-sign-up.join-group .collect {
    width: 29%
  }

  .meeting-sign-up.join-group .open-new-group {
    width: 30%;
    display: table-cell;
    line-height: .9rem;
    border: 1px solid #1fa2ff;
    color: #1fa2ff;
    background-color: #fff
  }

  .meeting-sign-up.join-group .sign-up {
    width: 31%
  }

  .ticket-home-wrapper {
    position: fixed;
    width: .82rem;
    height: 2rem;
    right: .25rem;
    bottom: 2rem;
    display: flex;
    flex-direction: column;
    justify-content: space-between
  }

  .ticket-home-wrapper .back-to {
    width: .82rem;
    height: .82rem;
    border: 2px solid hsla(0, 0%, 61%, .37);
    border-radius: 50%;
    text-align: center;
    background-color: #fff
  }

  .ticket-home-wrapper .back-to .iconfont {
    font-size: .6rem;
    display: block;
    line-height: .6rem;
    color: hsla(0, 0%, 61%, .67)
  }

  .ticket-home-wrapper .back-to.ticket .iconfont {
    font-size: .5rem;
    line-height: .7rem
  }

  .ticket-home-wrapper p.ticket-bottom {
    width: .82rem;
    height: .82rem;
    background-image: url("/static/assets/devin/icon/ticket_icon.png");
    background-repeat: no-repeat;
    background-size: 100% 100%
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ticket-home-wrapper p.ticket-bottom {
      background-image: url("/static/assets/devin/icon/ticket_icon@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ticket-home-wrapper p.ticket-bottom {
      background-image: url("/static/assets/devin/icon/ticket_icon@3x.png")
    }
  }

  .fix-bar {
    position: fixed;
    right: .3rem;
    bottom: 1.8rem;
    border-radius: .1rem;
    padding: .2rem .1rem;
    z-index: 500;
    width: 1.2rem;
    height: 2.8rem
  }

  .fix-bar .item {
    width: 1rem;
    height: 1rem
  }

  .fix-bar .item img {
    width: 100%;
    height: 100%
  }

  .ypl-groupFail[data-v-2d70d37b] {
    height: 100%;
    background: #f6f6f6
  }

  .ypl-groupFail .ypl-groupFail-body[data-v-2d70d37b] {
    background: #fff
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader[data-v-2d70d37b] {
    padding: .3rem .25rem;
    height: 1.75rem;
    position: relative;
    display: flex;
    overflow: hidden
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderLeft[data-v-2d70d37b] {
    width: 2.15rem
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderLeft > img[data-v-2d70d37b] {
    width: 2.15rem;
    height: 1.05rem
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderRight[data-v-2d70d37b] {
    font-size: .28rem;
    margin-left: .2rem;
    flex: 1;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderRight > .one[data-v-2d70d37b] {
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderRight > .two[data-v-2d70d37b] {
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0;
    color: #aaa;
    margin-top: .15rem;
    font-size: .24rem
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderRight > .three[data-v-2d70d37b] {
    -webkit-justify-content: space-between;
    justify-content: space-between;
    display: flex;
    margin-top: .15rem;
    font-size: .24rem
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderRight > .three > .left[data-v-2d70d37b] {
    flex: 1
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader .ypl-groupFail-bodyHeaderRight > .three > .right[data-v-2d70d37b] {
    text-align: right;
    flex: 1
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyHeader[data-v-2d70d37b]:before {
    content: " ";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 1px;
    border-top: 1px solid #ddd;
    -webkit-transform-origin: 0 0;
    transform-origin: 0 0;
    -webkit-transform: scaleY(.5);
    transform: scaleY(.5)
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTotal[data-v-2d70d37b] {
    background: #fff;
    position: relative
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTotal .ypl-groupFail-bodyTotal-num[data-v-2d70d37b] {
    position: relative;
    display: flex;
    -webkit-justify-content: space-around;
    justify-content: space-around
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTotal .ypl-groupFail-bodyTotal-num .ypl-groupFail-bodyTotal-numLi[data-v-2d70d37b] {
    width: 1rem;
    margin: .8rem 0
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTotal .ypl-groupFail-bodyTotal-num .ypl-groupFail-bodyTotal-numLi > img[data-v-2d70d37b] {
    height: 1rem;
    width: 1rem;
    border-radius: .5rem;
    background-size: 100% 100%
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTotal .ypl-groupFail-bodyTotal-num .ypl-groupFail-bodyTotal-numLi .ypl-groupFail-bodyTotal-numLiP[data-v-2d70d37b] {
    display: block;
    font-size: .24rem;
    background: #3498db;
    color: #fff;
    height: .32rem;
    width: 1rem;
    text-align: center;
    line-height: .32rem;
    border-radius: .16rem
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTotal .ypl-groupFail-Success[data-v-2d70d37b] {
    width: 2.18rem;
    height: 1.76rem;
    position: absolute;
    top: -25%;
    left: 50%;
    background-size: 100% 100%
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTime[data-v-2d70d37b] {
    font-size: .24rem
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTime .firstrow[data-v-2d70d37b] {
    text-align: center;
    font-size: .36rem;
    color: #c00
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyTime .tworow[data-v-2d70d37b] {
    text-align: center;
    margin-top: .3rem;
    color: #aaa
  }

  .ypl-groupFail .ypl-groupFail-body .ypl-groupFail-bodyButton > button[data-v-2d70d37b] {
    margin: .6rem 1rem;
    width: 5.4rem;
    height: .88rem;
    background: #3498db;
    border: none;
    border-radius: .1rem;
    font-size: .34rem;
    line-height: .88rem;
    text-align: center;
    color: #fff
  }

  .ypl-groupFail .ypl-groupFail-body[data-v-2d70d37b]:before {
    content: " ";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 100%;
    height: 1px;
    border-top: 1px solid #ccc;
    -webkit-transform-origin: 0 0;
    transform-origin: 0 0;
    -webkit-transform: scaleY(.5);
    transform: scaleY(.5)
  }

  .ypl-groupFail .ypl-groupFail-team[data-v-2d70d37b] {
    text-align: center
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-detail[data-v-2d70d37b] {
    margin-top: .6rem;
    color: #3498db;
    font-size: .28rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-detail > i[data-v-2d70d37b] {
    font-size: .12rem;
    color: #000;
    margin-left: .15rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member[data-v-2d70d37b] {
    margin: .47rem .32rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member > li[data-v-2d70d37b] {
    display: flex;
    margin-left: 1.18rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member > li .ypl-groupFail-team-member-left > img[data-v-2d70d37b] {
    width: .88rem;
    border-radius: .44rem;
    height: .88rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member > li .ypl-groupFail-team-member-right[data-v-2d70d37b] {
    margin-left: .3rem;
    margin-top: .13rem;
    text-align: left
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member > li .ypl-groupFail-team-member-right > .header[data-v-2d70d37b] {
    font-size: .28rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member > li .ypl-groupFail-team-member-right > .header > span[data-v-2d70d37b] {
    text-align: center;
    display: inline-block;
    width: .73rem;
    height: .26rem;
    border-radius: .13rem;
    color: #fff;
    background: #3498db;
    line-height: .26rem;
    font-size: .2rem;
    margin-left: .1rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member > li .ypl-groupFail-team-member-right > .text[data-v-2d70d37b] {
    margin-top: .28rem;
    color: #aaa;
    font-size: .24rem
  }

  .ypl-groupFail .ypl-groupFail-team .ypl-groupFail-team-member > li[data-v-2d70d37b]:first-child {
    margin-left: .32rem
  }

  .ypl-groupMessage[data-v-518b0934] {
    height: 100%;
    overflow-y: auto
  }

  .ypl-groupMessage .ypl-groupMessage-body[data-v-518b0934] {
    background: #fff
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader[data-v-518b0934] {
    padding: .3rem .25rem;
    min-height: 1.75rem;
    position: relative;
    display: flex;
    overflow: hidden
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderLeft[data-v-518b0934] {
    width: 2.15rem
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderLeft > img[data-v-518b0934] {
    width: 100%;
    height: 100%
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderRight[data-v-518b0934] {
    margin-left: .2rem;
    flex: 1
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderRight > .one[data-v-518b0934], .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderRight[data-v-518b0934] {
    font-size: .28rem;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderRight > .two[data-v-518b0934] {
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0;
    color: #aaa;
    margin-top: .13rem;
    font-size: .24rem
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderRight > .three[data-v-518b0934] {
    -webkit-justify-content: space-between;
    justify-content: space-between;
    display: flex;
    margin-top: .13rem;
    font-size: .24rem;
    color: #aaa
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderRight > .three > .left[data-v-518b0934] {
    flex: 1
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyHeader .ypl-groupMessage-bodyHeaderRight > .three > .right[data-v-518b0934] {
    text-align: right;
    flex: 1
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal[data-v-518b0934] {
    background: #fff;
    position: relative
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal .ypl-groupMessage-bodyTotal-num[data-v-518b0934] {
    position: relative;
    display: flex;
    -webkit-justify-content: space-around;
    justify-content: space-around
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal .ypl-groupMessage-bodyTotal-num .ypl-groupMessage-bodyTotal-numLi[data-v-518b0934] {
    width: 1rem;
    margin: .8rem 0
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal .ypl-groupMessage-bodyTotal-num .ypl-groupMessage-bodyTotal-numLi .ypl-groupMessage-bodyTotal-numLiimg[data-v-518b0934] {
    height: 1rem;
    width: 1rem;
    border-radius: .5rem;
    background-size: 100% 100%
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal .ypl-groupMessage-bodyTotal-num .ypl-groupMessage-bodyTotal-numLi .ypl-groupMessage-bodyTotal-numLiP[data-v-518b0934] {
    display: block;
    font-size: .24rem;
    background: #3498db;
    color: #fff;
    height: .32rem;
    width: 1rem;
    text-align: center;
    line-height: .32rem;
    border-radius: .16rem
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal .ypl-groupMessage-Success[data-v-518b0934] {
    width: 2.18rem;
    height: 1.76rem;
    position: absolute;
    top: -25%;
    left: 50%;
    background-image: url("/static/images/icon_shiney/ic_ptxx_successful_default.png");
    background-repeat: no-repeat;
    background-size: 100% 100%
  }

  @media (-webkit-min-device-pixel-ratio: 2),(min-device-pixel-ratio: 2) {
    .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal .ypl-groupMessage-Success[data-v-518b0934] {
      background-image: url("/static/images/icon_shiney/ic_ptxx_successful_default@2x.png")
    }
  }

  @media (-webkit-min-device-pixel-ratio: 3),(min-device-pixel-ratio: 3) {
    .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTotal .ypl-groupMessage-Success[data-v-518b0934] {
      background-image: url("/static/images/icon_shiney/ic_ptxx_successful_default@3x.png")
    }
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTime[data-v-518b0934] {
    font-size: .24rem;
    padding-bottom: .1rem
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTime .firstrow[data-v-518b0934] {
    text-align: center
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyTime .tworow[data-v-518b0934] {
    text-align: center;
    margin-top: .3rem
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupFail-bodyTime[data-v-518b0934] {
    font-size: .24rem
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupFail-bodyTime .firstrow[data-v-518b0934] {
    text-align: center;
    font-size: .36rem;
    color: #c00
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupFail-bodyTime .tworow[data-v-518b0934] {
    text-align: center;
    margin-top: .3rem;
    color: #aaa
  }

  .ypl-groupMessage .ypl-groupMessage-body .ypl-groupMessage-bodyButton > button[data-v-518b0934] {
    margin: .6rem 1rem;
    width: 5.4rem;
    height: .88rem;
    background: #3498db;
    border: none;
    border-radius: .1rem;
    font-size: .34rem;
    line-height: .88rem;
    text-align: center;
    color: #fff
  }

  .ypl-groupMessage .ypl-groupMessage-team[data-v-518b0934] {
    text-align: center
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-detail[data-v-518b0934] {
    margin-top: .6rem;
    color: #3498db;
    font-size: .28rem
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-detail > i[data-v-518b0934] {
    font-size: .12rem;
    color: #000;
    margin-left: .15rem
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member[data-v-518b0934] {
    margin: .47rem .32rem
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li[data-v-518b0934] {
    display: flex;
    margin-left: 1.18rem
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li .ypl-groupMessage-team-member-left > img[data-v-518b0934] {
    width: .88rem;
    border-radius: .44rem;
    height: .88rem
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li .ypl-groupMessage-team-member-right[data-v-518b0934] {
    margin-left: .3rem;
    margin-top: .13rem;
    text-align: left
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li .ypl-groupMessage-team-member-right > .header[data-v-518b0934] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li .ypl-groupMessage-team-member-right > .header > .headerdiv[data-v-518b0934] {
    font-size: .28rem;
    max-width: 4rem;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li .ypl-groupMessage-team-member-right > .header > .divspan[data-v-518b0934] {
    line-height: .26rem;
    vertical-align: middle;
    text-align: center;
    display: inline-block;
    width: .73rem;
    height: .26rem;
    margin-top: .05rem;
    border-radius: .13rem;
    color: #fff;
    background: #3498db;
    font-size: .2rem;
    margin-left: .1rem
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li .ypl-groupMessage-team-member-right > .text[data-v-518b0934] {
    margin-top: .28rem;
    color: #aaa;
    font-size: .24rem
  }

  .ypl-groupMessage .ypl-groupMessage-team .ypl-groupMessage-team-member > li[data-v-518b0934]:first-child {
    margin-left: .32rem
  }

  .ypl-groupMessage .maskTips[data-v-518b0934] {
    width: 100%;
    height: 100%;
    z-index: 1;
    top: 0;
    position: absolute;
    background: rgba(0, 0, 0, .5) no-repeat 100% 0;
    background-image: url("/static/images/icon_shiney/fx.png")
  }

  .signUpInfoPage[data-v-1976674c] {
    background: #f6f6f6;
    padding-bottom: 1rem
  }

  .signUpInfoPage .errorMsg[data-v-1976674c] {
    position: fixed;
    top: 0;
    left: 0;
    z-index: 10;
    opacity: .8;
    width: 100%;
    color: #fff;
    padding: .1rem;
    font-size: .28rem;
    line-height: .4rem;
    text-align: center;
    background: #ef4f4f
  }

  .signUpInfoPage .btnSubmit[data-v-1976674c] {
    height: .9rem;
    line-height: .9rem;
    margin: 1rem;
    color: #fff;
    font-size: .36rem;
    text-align: center;
    background: #3498db;
    border-radius: .08rem
  }

  .signUpInfoPage .list[data-v-1976674c] {
    padding: .5rem .3rem;
    background: #fff;
    border-bottom: 1px solid #ddd
  }

  .signUpInfoPage .list .item[data-v-1976674c] {
    font-size: .28rem
  }

  .signUpInfoPage .list .item .cell[data-v-1976674c] {
    margin: .3rem 0
  }

  .signUpInfoPage .list .item .cell input[data-v-1976674c] {
    width: 100%;
    line-height: .3rem;
    font-size: .28rem;
    padding: .3rem .15rem;
    margin-top: .3rem;
    border-radius: .08rem;
    border: 1px solid #ddd
  }

  .signUpInfoPage .list .item .cell textarea[data-v-1976674c] {
    width: 100%;
    height: 2rem;
    line-height: .36rem;
    font-size: .28rem;
    padding: .3rem .15rem;
    margin-top: .3rem;
    border-radius: .08rem;
    border: 1px solid #ddd
  }

  .signUpInfoPage .list .item .cell .radio[data-v-1976674c] {
    padding: .2rem 0
  }

  .signUpInfoPage .list .item .cell .radio img[data-v-1976674c] {
    width: .34rem;
    height: .34rem
  }

  .signUpInfoPage .list .item .cell .radio p[data-v-1976674c] {
    line-height: .34rem;
    margin-left: .3rem
  }

  .my-groupAppliedList-main[data-v-4aab8895] {
    height: 100%;
    width: 100%;
    background: #fff;
    overflow: hidden
  }

  .my-groupAppliedList-main #my-groupAppliedList-body[data-v-4aab8895] {
    font-size: 0;
    overflow: hidden;
    padding-bottom: .3rem;
    width: 100%
  }

  .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL[data-v-4aab8895] {
    padding: 0 .3rem;
    width: 100%;
    overflow: hidden
  }

  .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .my-groupAppliedList-bodyLi[data-v-4aab8895] {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    height: 1.11rem;
    position: relative;
    padding: .2rem 0
  }

  .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .my-groupAppliedList-bodyLi[data-v-4aab8895]:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .my-groupAppliedList-bodyLi[data-v-4aab8895]:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .my-groupAppliedList-bodyLi[data-v-4aab8895]:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .my-groupAppliedList-bodyLi > img[data-v-4aab8895] {
    width: .7rem;
    height: .7rem;
    border-radius: .35rem
  }

  .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .my-groupAppliedList-bodyLi > .name[data-v-4aab8895] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0;
    font-size: .28rem;
    line-height: .7rem;
    text-align: left;
    text-indent: .25rem
  }

  .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .my-groupAppliedList-bodyLi > .time[data-v-4aab8895] {
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    -webkit-flex: 1;
    -ms-flex: 1;
    flex: 1;
    overflow: hidden;
    text-overflow: ellipsis;
    width: 100%;
    white-space: nowrap;
    word-break: break-all;
    padding: .05rem 0;
    font-size: .26rem;
    line-height: .7rem;
    text-align: right
  }

  .my-groupAppliedList-main #my-groupAppliedList-body .my-groupAppliedList-bodyUL .ym-voteList-loadMore[data-v-4aab8895] {
    height: 1rem;
    width: 100%;
    color: #000;
    text-align: center;
    font-size: .24rem;
    line-height: 1rem
  }

  .ypl-crowd-page {
    width: 100%;
    height: 100%;
    color: #666;
    background: #f6f6f6
  }

  .ypl-crowd-page .ypl-crowd-base {
    font-size: .22rem
  }

  .ypl-crowd-page .ypl-crowd-info {
    width: 100%;
    height: 8.25rem;
    background: #fff
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-appbar {
    background-color: #fff
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-appbar .ypl-icon-back {
    margin-left: .15rem;
    width: .19rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-appbar .ypl-icon-star-normal, .ypl-crowd-page .ypl-crowd-info .ypl-appbar .ypl-icon-star-selected {
    margin-right: .35rem;
    width: .4rem;
    height: .4rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-appbar .ypl-icon-share {
    margin-right: .2rem;
    width: .4rem;
    height: .4rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-appbar-holder {
    height: .88rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-nav {
    width: 100%;
    height: 4.25rem;
    overflow: hidden;
    position: relative
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-nav .Crowd-cover {
    width: 100%;
    height: 4.25rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-nav .ypl-crowd-back {
    width: .5rem;
    height: .5rem;
    position: absolute;
    top: .63rem;
    left: .33rem;
    z-index: 100;
    color: #666
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content {
    padding: 0 .25rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user {
    position: relative
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user span {
    font-size: .28rem;
    color: #333;
    position: absolute;
    top: -.35rem;
    right: 1.3rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user .ypl-crowd-pic {
    width: .85rem;
    height: .85rem;
    border-radius: .85rem;
    position: absolute;
    top: -.8rem;
    right: .2rem;
    background: #fff
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user .ypl-crowd-pic img {
    width: .8rem;
    height: .8rem;
    line-height: 1rem;
    border-radius: .8rem;
    margin-bottom: .23rem;
    margin-left: .025rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type {
    width: 100%;
    height: .36rem;
    margin-top: .4rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type span {
    float: left;
    font-size: .24rem;
    height: .36rem;
    line-height: .36rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type .ypl-crowd-typeStatus {
    width: 1.3rem;
    border: .02rem solid;
    border-radius: .04rem;
    color: #ff7200;
    text-align: center
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type .ypl-icon-tips {
    margin-left: 4.5rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type .ypl-crowd-typeName {
    font-size: .22rem;
    margin-left: .15rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-title {
    height: .35rem;
    font-size: .34rem;
    color: #333;
    margin: .35rem 0 .5rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money-already {
    margin-bottom: .3rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money {
    height: .6rem;
    display: flex;
    display: -webkit-flex;
    flex-wrap: nowrap;
    justify-content: space-between;
    align-items: center
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-num {
    color: #333;
    font-size: .5rem;
    line-height: .5rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-num i {
    font-style: normal;
    font-size: .31rem;
    margin-right: .15rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-ratio {
    font-size: .28rem;
    color: #1fa2ff;
    letter-spacing: .05rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-ratios {
    font-size: .28rem;
    color: #ff4800;
    letter-spacing: .05rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-line {
    height: .08rem;
    background: #ddd;
    border-radius: .03rem;
    position: relative
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-line .ypl-line-left {
    height: .08rem;
    border-radius: .03rem;
    background: linear-gradient(90deg, #0095ff, #3bd4ff);
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-line .ypl-line-lefts {
    height: .08rem;
    max-width: 100%;
    border-radius: .03rem;
    background: linear-gradient(90deg, #fcff00, #ff4800);
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum {
    width: 100%;
    margin-top: .3rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum .ypl-sumlists {
    font-size: .22rem;
    letter-spacing: .1rem;
    padding-bottom: .2rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum .ypl-sumnum {
    color: #ff7200;
    font-size: .3rem;
    padding-top: .2rem
  }

  .ypl-crowd-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum li {
    float: left;
    width: 33.33%;
    text-align: center
  }

  .ypl-crowd-page .ypl-crowd-infoTitle {
    height: 9.13rem
  }

  .ypl-crowd-page .ypl-crowd-detail {
    width: 100%;
    margin-top: .2rem;
    font-size: .5rem;
    background: #fff
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-nav {
    height: .9rem;
    color: #333;
    font-size: .3rem;
    background: #fff
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-nav li {
    float: left;
    width: 50%;
    height: 100%;
    line-height: .9rem;
    text-align: center;
    position: relative;
    letter-spacing: .1rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-nav .active {
    color: #1fa2ff
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-nav .active span {
    width: .6rem;
    height: .05rem;
    background: #1fa2ff;
    position: absolute;
    bottom: 0;
    left: 50%;
    margin-left: -.3rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-nav-fixed {
    position: fixed !important;
    top: 0;
    width: 100%;
    background: #fff;
    z-index: 666
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-nav-fixeds {
    background: #fff;
    top: .88rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists {
    background: #fff;
    border-top: .02rem solid #f6f6f6;
    box-shadow: 0 0 .03rem #f6f6f6;
    padding: 0 .25rem .3rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists ul {
    align-items: center;
    font-size: .24rem;
    position: relative
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists ul li {
    float: left;
    width: 20%;
    text-align: center
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists ul li a {
    color: #333
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists ul .ypl-detail-time {
    width: 35%;
    font-size: .24rem;
    white-space: nowrap
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists ul .ypl-detailist-people {
    width: 25%;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists .ypl-detailist {
    color: #999;
    margin-bottom: 1rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists .ypl-detailists {
    margin-bottom: .4rem;
    color: #333;
    font-size: .24rem;
    letter-spacing: .01rem;
    overflow-x: hidden
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists .ypl-detailist-nothing {
    font-size: .16rem;
    margin-left: 1.8rem;
    margin-bottom: 1.2rem;
    height: 1.16rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-lists .ypl-detailist-nothing span {
    font-size: .3rem;
    float: left;
    line-height: 1.16rem;
    margin-left: .2rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-contents {
    padding: .75rem .25rem 1.3rem;
    line-height: 1.5;
    color: #333;
    border-top: .02rem solid #f6f6f6;
    box-shadow: 0 0 .03rem #f6f6f6;
    font-size: .28rem;
    letter-spacing: .03rem
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-contents .ypl-detail-contents-video {
    margin-bottom: .3rem;
    background: #000
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-contents p {
    font-size: .28rem;
    letter-spacing: .03rem;
    margin-right: .25rem;
    text-align: center
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-detail-contents img {
    max-width: 100%;
    margin: .25rem auto;
    background: #999
  }

  .ypl-crowd-page .ypl-crowd-detail .ypl-crowd-detail-block {
    height: .9rem
  }

  .ypl-crowd-page .ypl-crowd-button {
    width: 100%;
    height: .98rem;
    line-height: .98rem;
    text-align: center;
    border-top: .02rem solid #f6f6f6;
    box-shadow: 0 0 .03rem #f6f6f6;
    background: #fff
  }

  .ypl-crowd-page .ypl-crowd-button .pull-left {
    width: 50%;
    position: relative
  }

  .ypl-crowd-page .ypl-crowd-button .pull-left .iconfont {
    position: absolute;
    left: 40%;
    top: -.1rem;
    font-size: .3rem
  }

  .ypl-crowd-page .ypl-crowd-button .ypl-crowdSupport {
    float: right;
    margin-top: .1rem;
    margin-right: .2rem;
    width: 37%;
    height: .7rem;
    line-height: .7rem;
    background: #1fa2ff;
    border-radius: .03rem;
    color: #fff;
    font-size: .32rem;
    letter-spacing: .1rem
  }

  .ypl-crowd-page .ypl-crowd-button .ypl-crowdSupportFail {
    opacity: .6;
    cursor: not-allowed
  }

  .ypl-crowd-page .fix-bar {
    position: fixed;
    right: .3rem;
    bottom: 1.8rem;
    border-radius: .1rem;
    padding: .2rem .1rem;
    z-index: 500;
    width: 1.2rem;
    height: 2.8rem
  }

  .ypl-crowd-page .fix-bar .item {
    width: 1rem;
    height: 1rem
  }

  .ypl-crowd-page .fix-bar .item img {
    width: 100%;
    height: 100%
  }

  .ypl-crowdProduct-page {
    width: 100%;
    height: 100%;
    color: #666;
    background: #f6f6f6
  }

  .ypl-crowdProduct-page .mint-header .mint-header-button.is-right {
    width: 0
  }

  .ypl-crowdProduct-page .ypl-crowd-base {
    font-size: .22rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info {
    width: 100%;
    background: #fff
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-appbar {
    background-color: #fff
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-appbar .ypl-icon-back {
    margin-left: .15rem;
    width: .19rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-appbar .ypl-icon-star-normal, .ypl-crowdProduct-page .ypl-crowd-info .ypl-appbar .ypl-icon-star-selected {
    margin-right: .35rem;
    width: .4rem;
    height: .4rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-appbar .ypl-icon-share {
    margin-right: .2rem;
    width: .4rem;
    height: .4rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-nav {
    width: 100%;
    height: 4.25rem;
    overflow: hidden;
    position: relative
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-nav .Crowd-cover {
    width: 100%;
    height: 4.25rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-nav .ypl-crowd-back {
    width: .5rem;
    height: .5rem;
    position: absolute;
    top: .63rem;
    left: .33rem;
    z-index: 100;
    color: #666
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content {
    padding: 0 .3rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user {
    position: relative
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user span {
    font-size: .28rem;
    color: #333;
    position: absolute;
    top: -.35rem;
    right: 1.3rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user .ypl-crowd-pic {
    width: .85rem;
    height: .85rem;
    border-radius: .85rem;
    position: absolute;
    top: -.8rem;
    right: .2rem;
    background: #fff;
    font-size: 0
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-user .ypl-crowd-pic img {
    width: .8rem;
    height: .8rem;
    line-height: 1rem;
    border-radius: .8rem;
    margin-bottom: .23rem;
    margin-left: .025rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type {
    width: 100%;
    height: .36rem;
    margin-top: .4rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type span {
    font-size: .24rem;
    height: .36rem;
    line-height: .36rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type .pull-right {
    margin-top: -.3rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type .ypl-crowd-typeStatus {
    width: 1.3rem;
    border: .02rem solid;
    border-radius: .04rem;
    color: #ff7200;
    font-size: .24rem;
    text-align: center
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type .ypl-icon-tips {
    margin-left: 4.5rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-type .ypl-crowd-typeName {
    font-size: .22rem;
    margin-left: .15rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-title {
    height: .35rem;
    font-size: .34rem;
    color: #333;
    margin: .35rem 0 .5rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money-already {
    margin-bottom: .3rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money {
    height: .6rem;
    display: flex;
    display: -webkit-flex;
    flex-wrap: nowrap;
    justify-content: space-between;
    align-items: center
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-num {
    color: #333;
    font-size: .5rem;
    line-height: .5rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-num i {
    font-style: normal;
    font-size: .31rem;
    margin-right: .15rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-ratio {
    font-size: .28rem;
    color: #1fa2ff;
    letter-spacing: .05rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-money .ypl-money .ypl-money-ratios {
    font-size: .28rem;
    color: #ff4800;
    letter-spacing: .05rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowdProduct-line {
    height: .08rem;
    background: #ddd;
    border-radius: .03rem;
    position: relative
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowdProduct-line .ypl-line-left {
    max-width: 100%;
    height: .08rem;
    border-radius: .03rem;
    background: linear-gradient(90deg, #3bd4ff, #0095ff);
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowdProduct-line .ypl-line-lefts {
    max-width: 100%;
    height: .08rem;
    border-radius: .03rem;
    background: linear-gradient(90deg, #fcff00, #ff4800);
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum {
    width: 100%;
    margin-top: .3rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum .ypl-sumlists {
    font-size: .22rem;
    letter-spacing: .1rem;
    padding-bottom: .2rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum .ypl-sumnum {
    color: #ff7200;
    font-size: .3rem;
    padding-top: .2rem
  }

  .ypl-crowdProduct-page .ypl-crowd-info .ypl-crowd-content .ypl-crowd-sum li {
    float: left;
    width: 33.33%;
    text-align: center
  }

  .ypl-crowdProduct-page .ypl-crowd-detail {
    width: 100%;
    margin-top: .2rem;
    font-size: .3rem;
    background: #fff;
    overflow: hidden
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav {
    padding-left: .15rem;
    height: .9rem;
    white-space: nowrap;
    overflow: hidden;
    background: #fff;
    position: relative;
    box-shadow: 3px 1px 6px -1px rgba(50, 50, 50, .1)
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav ul {
    width: 125%;
    background: #fff
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav ul li {
    float: left;
    height: .9rem;
    line-height: .9rem;
    margin: 0 .45rem
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav ul li a {
    color: #333;
    float: left;
    letter-spacing: .02rem;
    position: relative;
    width: 1.25rem;
    text-align: center
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav .router-link-active {
    background: #fff;
    position: relative;
    color: #1fa2ff
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav .router-link-active span {
    width: .6rem;
    height: .05rem;
    background: #1fa2ff;
    position: absolute;
    bottom: 0;
    left: .3rem;
    text-align: center
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-navs {
    margin-left: .15rem;
    height: .9rem;
    white-space: nowrap;
    overflow: hidden;
    background: #fff
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-navs ul {
    width: 100%;
    background: #fff
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-navs ul li {
    float: left;
    width: 33.33%;
    line-height: .9rem;
    text-align: center
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-navs ul li a {
    color: #333;
    display: inline-block;
    height: .9rem;
    line-height: .9rem;
    letter-spacing: .02rem;
    position: relative;
    width: 1.25rem;
    text-align: center
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-navs .router-link-active {
    color: #1fa2ff;
    position: relative
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-navs .router-link-active span {
    width: .6rem;
    height: .05rem;
    background: #1fa2ff;
    position: absolute;
    bottom: 0;
    left: .3rem;
    text-align: center
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav-fixed {
    position: fixed !important;
    top: 0;
    margin-left: 0;
    background: #fff
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-detail-nav-fixeds {
    background: #fff;
    top: .88rem
  }

  .ypl-crowdProduct-page .ypl-crowd-detail .ypl-crowd-detail-block {
    background: #fff;
    height: .9rem
  }

  .ypl-crowdProduct-page .ypl-crowd-button {
    width: 100%;
    height: .98rem;
    line-height: .98rem;
    text-align: center;
    border-top: .02rem solid #f6f6f6;
    box-shadow: 0 0 .03rem #f6f6f6;
    background: #fff
  }

  .ypl-crowdProduct-page .ypl-crowd-button .pull-left {
    width: 50%;
    position: relative
  }

  .ypl-crowdProduct-page .ypl-crowd-button .pull-left .iconfont {
    position: absolute;
    left: 40%;
    top: -.1rem;
    font-size: .3rem
  }

  .ypl-crowdProduct-page .ypl-crowd-button .ypl-crowdSupport {
    float: right;
    margin-top: .1rem;
    margin-right: .2rem;
    width: 37%;
    height: .7rem;
    line-height: .7rem;
    background: #1fa2ff;
    border-radius: .03rem;
    color: #fff;
    font-size: .32rem;
    letter-spacing: .1rem
  }

  .ypl-crowdProduct-page .ypl-crowd-button .ypl-crowdSupportFail {
    opacity: .6;
    cursor: not-allowed
  }

  .ypl-crowdProduct-page .fix-bar {
    position: fixed;
    right: .3rem;
    bottom: 1.8rem;
    border-radius: .1rem;
    padding: .2rem .1rem;
    z-index: 500;
    width: 1.2rem;
    height: 2.8rem
  }

  .ypl-crowdProduct-page .fix-bar .item {
    width: 1rem;
    height: 1rem
  }

  .ypl-crowdProduct-page .fix-bar .item img {
    width: 100%;
    height: 100%
  }

  .ypl-dialog {
    width: 80%;
    background: #fff;
    border-radius: .1rem;
    padding: .6rem;
    color: #333;
    letter-spacing: .02rem
  }

  .ypl-dialog .remind-title {
    text-align: center;
    font-size: .34rem;
    margin-bottom: .88rem;
    font-weight: 700;
    letter-spacing: .03rem
  }

  .ypl-dialog .remind-content div {
    font-size: .28rem;
    margin-bottom: .85rem
  }

  .ypl-dialog .remind-sure {
    font-size: .36rem;
    color: #1fa2ff;
    text-align: center;
    letter-spacing: .1rem
  }

  .ypl-popup-enter-active {
    animation: show-ypl-popup .2s;
    animation-fill-mode: forwards
  }

  .ypl-popup-leave-active {
    animation: hide-ypl-popup .2s;
    animation-fill-mode: forwards
  }

  @keyframes show-ypl-popup {
    0% {
      transform: translateY(100%)
    }
    to {
      transform: translateY(0)
    }
  }

  @keyframes hide-ypl-popup {
    0% {
      transform: translateY(0)
    }
    to {
      transform: translateY(100%)
    }
  }

  .ypl-popup {
    position: fixed;
    width: 100%;
    height: 100%;
    left: 0;
    top: 0;
    bottom: 0
  }

  .ypl-dialog {
    background-color: #fff;
    display: inline-block;
    position: absolute;
    left: 50%;
    top: 50%;
    padding: .2rem;
    transform: translate(-50%, -50%);
    min-width: 3rem;
    border-radius: .1rem;
    z-index: 99999
  }

  .ypl-crowd-support {
    background: #f6f6f6;
    color: #666;
    font-size: .28rem;
    position: relative
  }

  .ypl-crowd-support .mint-header .mint-header-button.is-right {
    width: auto;
    float: right
  }

  .ypl-crowd-support .ypl-layout {
    padding: 0 .25rem
  }

  .ypl-crowd-support .ypl-support-head {
    width: 100%;
    height: .88rem;
    background: #fff
  }

  .ypl-crowd-support .ypl-support-head span {
    line-height: .88rem;
    padding-bottom: .25rem;
    letter-spacing: .05rem
  }

  .ypl-crowd-support .ypl-support-head .support-back {
    width: .19rem;
    height: .36rem
  }

  .ypl-crowd-support .ypl-support-head .title {
    margin-left: .8rem;
    font-size: .36rem
  }

  .ypl-crowd-support .ypl-support-head .crowd-remind {
    color: #1fa2ff;
    letter-spacing: .01rem;
    font-size: .28rem;
    padding-right: .25rem
  }

  .ypl-crowd-support .ypl-support-lists {
    background: #fff
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-num {
    margin-top: .2rem;
    width: 100%;
    height: .9rem;
    line-height: .9rem;
    border-bottom: 1px solid #f0f0f0;
    display: flex;
    display: -webkit-flex;
    justify-content: space-between
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-num .support-money span {
    font-size: .4rem;
    margin-right: .13rem
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-num .support-selfmoney span {
    font-size: .3rem
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-num .support-peo {
    letter-spacing: .04rem
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-num span {
    color: #ff7200
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-number {
    color: #333;
    margin-top: .35rem
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-number span {
    margin: 0 .1rem
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-details {
    margin: .4rem auto;
    overflow: hidden
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-details .support-pic {
    float: left;
    width: 1.5rem;
    height: 1.5rem;
    margin-right: .3rem;
    background: #999
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-details .support-content {
    font-size: .28rem;
    padding-right: .1rem;
    line-height: .5rem;
    letter-spacing: .04rem
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .ypl-support-back span {
    display: inline-block;
    margin-bottom: .25rem
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .support {
    overflow: hidden;
    padding: .25rem 0
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .support span {
    width: 2rem;
    height: .6rem;
    line-height: .6rem;
    background: #1fa2ff;
    border-radius: .03rem;
    color: #fff;
    text-align: center;
    letter-spacing: .01rem;
    float: right
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .support-null span {
    background: #aaa
  }

  .ypl-crowd-support .ypl-support-lists .ypl-support-dw .Selfless-support span {
    background: #fff;
    color: #1fa2ff;
    border: 1px solid #1fa2ff
  }

  .ypl-dialog {
    width: 80%;
    background: #fff;
    border-radius: .1rem;
    padding: .6rem;
    color: #333;
    letter-spacing: .02rem
  }

  .ypl-dialog .remind-title {
    text-align: center;
    font-size: .34rem;
    margin-bottom: .88rem;
    font-weight: 700;
    letter-spacing: .03rem
  }

  .ypl-dialog .remind-content div {
    font-size: .28rem;
    margin-bottom: .85rem
  }

  .ypl-dialog .remind-sure {
    font-size: .36rem;
    color: #1fa2ff;
    text-align: center;
    letter-spacing: .1rem
  }

  .ypl-address {
    color: #000;
    font-size: .28rem
  }

  .ypl-address .address-holder {
    width: 80%
  }

  .ypl-address .ypl-support-head {
    height: .88rem;
    line-height: .88rem;
    background: #f8f8f8;
    padding: 0 .25rem
  }

  .ypl-address .ypl-support-head span {
    line-height: .88rem
  }

  .ypl-address .ypl-support-head .ypl-icon-back {
    width: .19rem;
    height: .36rem
  }

  .ypl-address .ypl-support-head .ypl-support {
    font-size: .36rem;
    margin-left: 2.53rem
  }

  .ypl-address .ypl-support-head .crowd-remind {
    float: right;
    color: #1fa2ff;
    line-height: .88rem;
    letter-spacing: .01rem;
    font-size: .34rem
  }

  .ypl-address .address-list {
    border-top: 1px solid #ddd;
    background: #fff
  }

  .ypl-address .address-list li {
    width: 100%;
    overflow: hidden;
    height: .88rem;
    line-height: .88rem;
    border-bottom: 1px solid #f0f0fa;
    position: relative;
    font-size: .28rem
  }

  .ypl-address .address-list li span {
    width: 20%;
    height: .88rem;
    line-height: .88rem;
    text-align: right;
    font-size: .28rem;
    float: left
  }

  .ypl-address .address-list li input {
    float: left;
    padding: 0 5%;
    width: 70%;
    height: .38rem;
    margin-top: .25rem;
    font-size: .28rem
  }

  .ypl-address .address-list li .address-choose {
    color: #999;
    float: right;
    margin-right: .25rem
  }

  .ypl-address .address-list li .vux-no-group-title {
    margin-top: 0
  }

  .ypl-address .address-list li .weui-cell {
    height: .88rem;
    line-height: .88rem;
    padding: 0 .3rem
  }

  .ypl-address .address-list li .weui-cells:before {
    border: none
  }

  .ypl-address .address-list li .vux-cell-box:before {
    border-top: none
  }

  .ypl-address .address-list li .weui-cells:after {
    border: none
  }

  .ypl-address .address-list li .weui-cell__hd {
    font-size: .28rem
  }

  .ypl-address .ypl-popup .ypl-dialog {
    width: 100%;
    height: 4rem;
    background: #fff;
    position: absolute;
    bottom: 0;
    border-radius: 0
  }

  .ypl-address .address-picker {
    position: fixed;
    bottom: 0;
    left: 0;
    width: 100%;
    background: #fff;
    z-index: 100;
    color: #000
  }

  .ypl-address .dropWindow {
    height: 100%;
    width: 100%;
    position: fixed;
    z-index: 33111;
    top: 0;
    background: rgba(0, 0, 0, .5)
  }

  .ypl-crowd-supporting {
    background: #f6f6f6;
    color: #666;
    font-size: .28rem;
    position: relative
  }

  .ypl-crowd-supporting .ypl-layout {
    padding: 0 .25rem;
    background: #fff;
    font-size: .28rem
  }

  .ypl-crowd-supporting .ypl-support-head {
    height: .88rem;
    line-height: .88rem;
    color: #333
  }

  .ypl-crowd-supporting .ypl-support-head span {
    line-height: .88rem;
    letter-spacing: .05rem
  }

  .ypl-crowd-supporting .ypl-support-head .ypl-icon-back {
    width: .19rem;
    height: .36rem
  }

  .ypl-crowd-supporting .ypl-support-head .title {
    font-size: .36rem;
    margin-left: -.3rem
  }

  .ypl-crowd-supporting .ypl-supporting-lists {
    position: relative
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-details {
    border-bottom: 1px solid #f0f0f0
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-details .supporting-pic {
    float: left;
    width: 1.5rem;
    height: 1.5rem;
    margin-top: .3rem;
    margin-right: .3rem
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-details .supporting-content {
    padding-top: .37rem;
    padding-right: .15rem;
    line-height: .4rem;
    min-height: 2rem
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num {
    width: 100%;
    height: 1.04rem;
    line-height: 1.04rem;
    display: flex;
    display: -webkit-flex;
    justify-content: space-between
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-money {
    color: #ff7200
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-money span {
    font-size: .36rem;
    margin-right: .13rem
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number span {
    width: .54rem;
    height: .54rem;
    line-height: .45rem;
    margin-top: .25rem;
    float: left
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus {
    position: relative
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus:after, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border: 1px solid #b8c4ce;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus:after, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus:after, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus.text-info, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus.text-info {
    position: relative
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus.text-info:after, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus.text-info:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border: 1px solid #1fa2ff;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus.text-info:after, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus.text-info:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-minus.text-info:after, .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-number-plus.text-info:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-crowd-supporting .ypl-supporting-lists .ypl-supporting-num .supporting-number .supporting-numbers {
    width: 1.1rem;
    line-height: .54rem;
    text-align: center;
    vertical-align: middle;
    margin: .25rem .06rem 0;
    border: .5px solid #b8c4ce
  }

  .ypl-crowd-supporting .ypl-address {
    height: 1.4rem;
    margin-top: .2rem;
    display: flex;
    justify-content: space-between
  }

  .ypl-crowd-supporting .ypl-address .ypl-address-save {
    line-height: 1.4rem
  }

  .ypl-crowd-supporting .ypl-address .ypl-address-saved {
    position: relative
  }

  .ypl-crowd-supporting .ypl-address .ypl-address-saved span {
    float: left;
    margin-top: .3rem
  }

  .ypl-crowd-supporting .ypl-address .ypl-address-saved .ypl-supportName {
    width: 2rem;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis
  }

  .ypl-crowd-supporting .ypl-address .ypl-address-saved .ypl-addressave {
    margin-left: 2rem;
    margin-top: .2rem;
    width: 4rem;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    position: relative
  }

  .ypl-crowd-supporting .ypl-address .ypl-icon-right {
    display: block;
    height: 1.4rem;
    line-height: 1.4rem;
    letter-spacing: .1rem
  }

  .ypl-crowd-supporting .ypl-paymenting {
    width: 100%;
    height: .98rem;
    position: fixed;
    bottom: 0;
    right: 0;
    border-top: 1px solid #f0f0f0
  }

  .ypl-crowd-supporting .ypl-paymenting .payment-amount {
    line-height: .98rem;
    color: #000;
    margin-left: .5rem
  }

  .ypl-crowd-supporting .ypl-paymenting .payment-amount b {
    font-weight: 400;
    color: #ff7200;
    margin-left: .1rem;
    margin-right: .05rem
  }

  .ypl-crowd-supporting .ypl-paymenting .payment-amount span {
    font-size: .36rem;
    color: #ff7200
  }

  .ypl-crowd-supporting .ypl-paymenting .payment-confirm {
    position: absolute;
    right: 0;
    top: 0;
    width: 3.5rem;
    height: .98rem;
    line-height: .98rem;
    background: #1fa2ff;
    color: #fff;
    text-align: center;
    font-size: .32rem;
    letter-spacing: .1rem
  }

  .ypl-crowd-supporting .button-wrapper {
    width: 100%;
    height: .98rem;
    bottom: 0;
    left: 0;
    text-align: center;
    line-height: .98rem
  }

  .ypl-crowd-supporting .button-wrapper .btn-left {
    width: 50%;
    height: 100%;
    background: #fff;
    font-size: 0
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .con-left {
    margin-left: .34rem;
    height: 100%;
    font-size: 0;
    margin-right: .15rem;
    line-height: .98rem
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .con-left .total-world {
    height: 100%;
    font-size: .24rem;
    color: #000
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .con-left .total-money {
    height: 100%;
    font-size: .3rem;
    color: #1fa2ff
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .discount-btn-right {
    height: 100%;
    font-size: .18rem;
    color: #d0021b
  }

  .ypl-crowd-supporting .button-wrapper .btn-right {
    width: 50%;
    height: 100%;
    font-size: .34rem;
    background: #1fa2ff;
    color: #fff
  }

  .ypl-crowd-supporting .button-wrapper .btn-right:disabled {
    opacity: .4
  }

  .ypl-crowd-supporting {
    width: 100%;
    overflow: hidden;
    background: #f6f6f6;
    color: #666;
    font-size: .28rem
  }

  .ypl-crowd-supporting .ypl-layout {
    padding: 0 .25rem
  }

  .ypl-crowd-supporting .ypl-support-head {
    width: 100%;
    height: .88rem;
    background: #fff;
    color: #333
  }

  .ypl-crowd-supporting .ypl-support-head span {
    line-height: 1.28rem;
    padding-bottom: .25rem;
    letter-spacing: .05rem
  }

  .ypl-crowd-supporting .ypl-support-head .support-back {
    width: .19rem;
    height: .36rem
  }

  .ypl-crowd-supporting .ypl-support-head .title {
    font-size: .36rem
  }

  .ypl-crowd-supporting .ypl-selflessDedication {
    background: #fff;
    height: 3.62rem;
    position: relative;
    color: #333
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-title {
    padding-top: .35rem;
    padding-bottom: .45rem
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-num {
    width: 100%;
    height: .8rem;
    margin-bottom: .4rem
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-num ul {
    width: 100%;
    height: .8rem;
    display: flex;
    justify-content: space-between
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-num ul li {
    width: 2rem;
    height: .8rem;
    line-height: .8rem;
    font-size: .34rem;
    border: 1px solid #b8c4ce;
    border-radius: .03rem;
    text-align: center
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-num ul .check {
    border-color: #1fa2ff;
    color: #1fa2ff
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-number {
    border: 1px solid #b8c4ce;
    border-radius: .03rem;
    position: relative;
    overflow: hidden;
    padding-left: .7rem
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-number span {
    font-size: .34rem;
    position: absolute;
    left: .2rem;
    top: .23rem
  }

  .ypl-crowd-supporting .ypl-selflessDedication .dedication-number input {
    width: 100%;
    height: .9rem;
    font-size: .34rem
  }

  .ypl-crowd-supporting .ypl-selflessDedication .check {
    border-color: #1fa2ff;
    color: #1fa2ff
  }

  .ypl-crowd-supporting .ypl-phone {
    display: block;
    width: 100%;
    height: 1.1rem;
    background: #fff;
    line-height: 1.1rem;
    margin-top: .2rem;
    letter-spacing: .05rem;
    text-indent: .5rem
  }

  .ypl-crowd-supporting .ypl-phone .ypl-phone-input {
    width: 88%;
    height: .5rem
  }

  .ypl-crowd-supporting .button-wrapper {
    width: 100%;
    height: .98rem;
    bottom: 0;
    left: 0;
    text-align: center;
    line-height: .98rem
  }

  .ypl-crowd-supporting .button-wrapper .btn-left {
    width: 50%;
    height: 100%;
    background: #fff;
    font-size: 0
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .con-left {
    margin-left: .34rem;
    height: 100%;
    font-size: 0;
    margin-right: .15rem;
    line-height: .98rem
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .con-left .total-world {
    height: 100%;
    font-size: .24rem;
    color: #000
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .con-left .total-money {
    height: 100%;
    font-size: .3rem;
    color: #1fa2ff
  }

  .ypl-crowd-supporting .button-wrapper .btn-left .discount-btn-right {
    height: 100%;
    font-size: .18rem;
    color: #d0021b
  }

  .ypl-crowd-supporting .button-wrapper .btn-right {
    width: 50%;
    height: 100%;
    font-size: .34rem;
    background: #1fa2ff;
    color: #fff
  }

  .ypl-crowd-supporting .button-wrapper .btn-right:disabled {
    opacity: .4
  }

  .ypl-projectDetail {
    padding: 0 .3rem;
    font-size: .28rem
  }

  .ypl-projectDetail .projectDetail {
    width: 100%;
    height: .8rem;
    padding-top: .6rem;
    padding-bottom: .5rem;
    box-sizing: content-box
  }

  .ypl-projectDetail .projectDetail .projectDetail-pic {
    float: left;
    margin-right: .24rem
  }

  .ypl-projectDetail .projectDetail .projectDetail-pic img {
    width: .8rem;
    height: .8rem;
    border-radius: .8rem
  }

  .ypl-projectDetail .projectDetail .projectDetail-list {
    float: left;
    height: .8rem
  }

  .ypl-projectDetail .projectDetail .projectDetail-list .projectDetail-listop {
    height: .4rem;
    line-height: .4rem
  }

  .ypl-projectDetail .projectDetail .projectDetail-list .projectDetail-listop div {
    float: left
  }

  .ypl-projectDetail .projectDetail .projectDetail-list .projectDetail-listop .projectDetail-name {
    width: 2.6rem;
    height: .4rem;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap
  }

  .ypl-projectDetail .projectDetail .projectDetail-list .projectDetail-listop .projectDetail-listwarn {
    font-size: .2rem;
    width: 1.6rem;
    height: .4rem;
    line-height: .3rem;
    border: 1px solid #ff7200;
    border-radius: .3rem;
    margin-left: .2rem;
    text-align: center;
    margin-top: .05rem
  }

  .ypl-projectDetail .projectDetail .projectDetail-list .projectDetail-listop .projectDetail-listwarn .iconfont {
    color: #ff7200
  }

  .ypl-projectDetail .projectDetail .projectDetail-list .projectDetail-listbot {
    font-size: .24rem;
    float: left
  }

  .ypl-projectDetail .projectDetail .projectDetail-list .projectDetail-listbot .iconfont {
    font-size: .24rem
  }

  .ypl-projectDetail .projectDetail .projectDetail-icon {
    float: right;
    height: .6rem;
    width: .6rem;
    line-height: .6rem;
    color: #fff;
    text-align: center;
    position: relative;
    border-radius: 50%;
    font-size: .4rem;
    background-color: #1fa2ff
  }

  .ypl-projectDetail .projectDetail .projectDetail-icon.ypl-icon-phoneFail {
    opacity: .4
  }

  .ypl-projectDetail .projectDetail .projectDetail-icon .iconfont {
    line-height: 1;
    display: inline-block
  }

  .ypl-projectDetail .projectDetail-dialog {
    width: 5rem;
    height: 5.6rem;
    background: #fff;
    border-radius: .1rem;
    padding: .6rem;
    color: #333;
    letter-spacing: .02rem
  }

  .ypl-projectDetail .projectDetail-dialog .remind-title {
    text-align: center;
    font-size: .34rem;
    margin-bottom: .88rem;
    font-weight: 700;
    letter-spacing: .03rem
  }

  .ypl-projectDetail .projectDetail-dialog .remind-content div {
    font-size: .28rem;
    margin-bottom: .85rem
  }

  .ypl-projectDetail .projectDetail-dialog .remind-sure {
    font-size: .36rem;
    color: #1fa2ff;
    text-align: center;
    letter-spacing: .1rem
  }

  .ypl-projectDetail .projectDetail-content {
    width: 100%;
    margin-top: .3rem;
    font-size: .28rem;
    color: #333;
    line-height: .52rem;
    letter-spacing: .05rem
  }

  .ypl-projectDetail .projectDetail-content .projectDetail-content-video {
    width: 100%;
    height: 3.5rem;
    margin-bottom: .3rem;
    background: #000
  }

  .ypl-projectDetail .projectDetail-content .projectDetail-content-detail {
    line-height: 1.5
  }

  .ypl-projectDetail .projectDetail-content .projectDetail-content-detail p {
    text-align: center
  }

  .ypl-projectDetail .projectDetail-content .projectDetail-content-detail img {
    max-width: 100%
  }

  .ypl-projectRecord {
    font-size: .24rem;
    padding: 0 .25rem
  }

  .ypl-projectRecord .listLabel {
    color: #999;
    text-align: center;
    margin-top: .3rem
  }

  .ypl-projectRecord .list {
    color: #333;
    margin-bottom: .3rem
  }

  .ypl-projectRecord .list .item {
    text-align: center;
    margin-top: .3rem
  }

  .ypl-projectRecord .list .item p {
    width: 0
  }

  .ypl-projectRecord .list .nodata {
    font-size: .32rem;
    text-align: center;
    margin-top: .5rem;
    color: #999
  }

  .ypl-projectNew {
    width: 100%;
    padding: .4rem .3rem;
    font-size: .28rem;
    float: left;
    margin-bottom: .88rem
  }

  .ypl-projectNew .ypl-projectNew-nothing {
    margin-top: .6rem;
    margin-left: 1.8rem;
    height: 1.16rem
  }

  .ypl-projectNew .ypl-projectNew-nothing span {
    font-size: .3rem;
    float: left;
    line-height: 1.16rem;
    margin-left: .2rem
  }

  .ypl-projectNew .projectNews {
    width: 100%;
    margin-bottom: .15rem;
    float: left
  }

  .ypl-projectNew .projectNews .projectNew-top {
    width: 100%;
    line-height: .45rem;
    vertical-align: middle;
    margin-bottom: .1rem
  }

  .ypl-projectNew .projectNews .projectNew-top .ypl-icon-group {
    float: left
  }

  .ypl-projectNew .projectNews .projectNew-top .projectTime {
    color: #4a4a4a;
    font-size: .24rem;
    margin-left: .15rem
  }

  .ypl-projectNew .projectNews .content {
    width: 100%
  }

  .ypl-projectNew .projectNews .content .projectNew-content {
    width: 100%;
    float: left;
    margin-left: .2rem;
    border-left: .03rem solid #eaeaea;
    padding-left: .4rem
  }

  .ypl-projectNew .projectNews .content .projectNew-content .projectContent {
    width: 75%;
    word-wrap: break-word;
    margin: .2rem 0;
    color: #333;
    line-height: .5rem
  }

  .ypl-projectNew .projectNews .content .projectNew-content .projectPic {
    margin-bottom: .5rem;
    height: 1.73rem
  }

  .ypl-projectNew .projectNews .content .projectNew-content .projectPic img {
    float: left;
    margin-right: .35rem;
    width: 1.75rem;
    height: 1.73rem
  }

  .ypl-projectNew .moreNew {
    width: 100%;
    font-size: .3rem;
    color: #1fa2ff;
    text-align: center;
    margin-top: .2rem;
    margin-bottom: 1.8rem
  }

  .ypl-projectNew .moreNew .seeMore {
    width: 1.35rem
  }

  .ypl-projectNew .moreNew .ypl-icon-down-selected {
    margin-bottom: .05rem
  }

  .ypl-pay-fail {
    text-align: center
  }

  .ypl-pay-fail .ypl-fail {
    overflow: hidden;
    padding-top: 1.5rem;
    font-size: .4rem;
    width: 80%;
    margin: 0 auto
  }

  .ypl-pay-fail .ypl-fail .ypl-fail-icon {
    width: 2rem;
    height: 2rem;
    margin: 1rem auto;
    font-size: 60px;
    color: #c00
  }

  .ypl-pay-fail .ypl-fail p {
    text-align: center;
    color: #c00;
    letter-spacing: .1rem;
    word-break: break-all
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-meeting-confirm-payment-content {
    -webkit-overflow-scrolling: touch;
    background: #f6f6f6
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-meeting-confirm-payment-content .confirm-payment-header {
    width: 100%;
    height: 1.6rem;
    background: #fff;
    padding-left: .32rem;
    padding-top: .4rem
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-meeting-confirm-payment-content .confirm-payment-header .meeting-title {
    width: 6.5rem;
    font-size: .34rem;
    color: #000;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    margin-bottom: .25rem
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-meeting-confirm-payment-content .confirm-payment-header .meeting-info {
    font-size: .24rem;
    color: #aaa
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment {
    margin-top: .2rem;
    position: relative
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment li.b-b {
    position: relative
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment li.b-b:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-meeting-confirm-payment-wrapper .ypl-payment li.b-b:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-meeting-confirm-payment-wrapper .ypl-payment li.b-b:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .payment {
    height: 1.3rem;
    color: #000;
    position: relative;
    padding: .5rem .5rem .5rem .8rem
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .payment img {
    position: absolute;
    left: 0;
    top: .35rem;
    width: .6rem;
    height: .6rem
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .payment .payment-type {
    display: inline-block
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .payment .iconfont {
    float: right;
    font-size: .42rem;
    margin-top: -.1rem
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .payment .payment-choose {
    float: right;
    margin-right: .15rem;
    margin-top: .56rem
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .payment .ypl-icon-wx, .ypl-meeting-confirm-payment-wrapper .ypl-payment .payment .ypl-icon-zfb {
    width: .6rem;
    height: .6rem
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .paytime {
    margin-top: .35rem;
    float: right
  }

  .ypl-meeting-confirm-payment-wrapper .ypl-payment .paytime span {
    color: #ff7200;
    margin: 0 .05rem
  }

  .ypl-meeting-confirm-payment-wrapper .button-wrapper {
    width: 100%;
    height: .98rem;
    position: relative;
    bottom: 0;
    left: 0;
    text-align: center;
    line-height: .98rem
  }

  .ypl-meeting-confirm-payment-wrapper .button-wrapper .btn-left {
    width: 65%;
    height: 100%;
    background: #fff;
    font-size: 0;
    float: left
  }

  .ypl-meeting-confirm-payment-wrapper .button-wrapper .btn-left .con-left {
    margin-left: .34rem;
    height: 100%;
    font-size: 0;
    margin-right: .15rem;
    line-height: .98rem
  }

  .ypl-meeting-confirm-payment-wrapper .button-wrapper .btn-left .con-left .total-world {
    height: 100%;
    font-size: .24rem;
    color: #000
  }

  .ypl-meeting-confirm-payment-wrapper .button-wrapper .btn-left .con-left .total-money {
    height: 100%;
    font-size: .3rem;
    color: #1fa2ff
  }

  .ypl-meeting-confirm-payment-wrapper .button-wrapper .btn-left .discount-btn-right {
    height: 100%;
    font-size: .18rem;
    color: #d0021b
  }

  .ypl-meeting-confirm-payment-wrapper .button-wrapper .btn-right {
    width: 100%;
    float: left;
    height: 100%;
    font-size: .34rem;
    background: #1fa2ff;
    color: #fff
  }

  .ypl-support-success {
    width: 100%;
    text-align: center
  }

  .ypl-support-success .ypl-success {
    height: .46rem;
    line-height: .46rem;
    font-size: .4rem;
    letter-spacing: .1rem;
    padding-top: 30%
  }

  .ypl-support-success .ypl-success .iconfont {
    color: #23c334;
    font-size: .4rem
  }

  .ypl-support-success .ypl-success-num {
    font-size: .32rem;
    color: #666;
    margin-top: .6rem;
    letter-spacing: .1rem
  }

  .ypl-support-success .ypl-success-num span {
    color: #ff7200
  }

  .ypl-support-success .ypl-success-down {
    background-color: #1fa2ff;
    font-size: 18px;
    margin: 40% auto 0;
    width: 72%;
    height: 6%;
    line-height: 250%;
    text-align: center;
    color: #fff;
    border-radius: 3px 3px
  }

  .ypl-support-success .ypl-success-share {
    width: 4.5rem;
    height: .7rem;
    line-height: .7rem;
    background: #1fa2ff;
    border-radius: 35px;
    font-size: .34rem;
    color: #f8f8f8;
    margin: 2.6rem auto .35rem
  }

  .ypl-support-success .ypl-success-check {
    width: 4.5rem;
    height: .7rem;
    line-height: .7rem;
    border-radius: 35px;
    font-size: .34rem;
    color: #1fa2ff;
    border: 1px solid #1fa2ff;
    margin: 0 auto
  }

  .ypl-support-success .ypl-success-tip {
    width: 60%;
    height: .77rem;
    position: fixed;
    bottom: 10%;
    left: 20%
  }

  .ypl-support-success .p40 {
    padding: .8rem
  }

  .ypl-support-success .mint-button--large {
    border-radius: 27px
  }

  .ypl-support-success .control-wrapper {
    padding: 2rem .8rem 0
  }

  .ypl-support-success .success-tip {
    position: absolute;
    bottom: .5rem;
    left: 50%;
    margin-left: -2.3rem
  }

  .ypl-content-block {
    background-color: #fff;
    padding: .2rem;
    overflow-x: hidden
  }

  .ypl-slider {
    display: -webkit-box;
    display: -moz-box;
    display: -ms-flexbox;
    display: -webkit-flex;
    display: flex;
    position: relative;
    justify-content: space-between;
    -webkit-box-orient: vertical;
    -webkit-box-align: center;
    -webkit-align-items: center;
    align-items: center;
    text-align: center;
    width: 100%;
    min-height: 20px
  }

  .ypl-slider .slider-fill {
    z-index: 2;
    left: 0
  }

  .ypl-slider .slider-fill, .ypl-slider .slider-track {
    flex: 1;
    -webkit-flex: 1;
    display: block;
    position: absolute;
    width: 100%;
    top: 50%;
    transform: translateY(-50%);
    height: 2px;
    border-radius: 2.5px
  }

  .ypl-slider .slider-track {
    z-index: 1;
    background-color: #ddd
  }

  .ypl-slider .slider-thumb {
    flex: 1;
    -webkit-flex: 1;
    display: block;
    position: absolute;
    font-size: .5rem;
    z-index: 3
  }

  .ypl-vote-result {
    padding: .2rem .2rem .2rem 0
  }

  .ypl-vote-result .ypl-vote-result-item {
    margin-bottom: .7rem
  }

  .ypl-vote-result .ypl-vote-result-item .rank {
    float: left;
    height: 1rem
  }

  .ypl-vote-result .ypl-vote-result-item .rank .rank-text-icon {
    vertical-align: top;
    margin-top: .1rem;
    left: .1rem;
    background-color: rgba(184, 196, 206, .2);
    border-radius: 50%;
    width: .38rem;
    height: .38rem;
    line-height: normal;
    color: #777;
    font-size: .28rem;
    text-align: center
  }

  .ypl-vote-result .ypl-vote-result-item .rank .ypl-icon {
    vertical-align: top;
    left: .1rem;
    width: .42rem;
    height: .56rem
  }

  .ypl-vote-result .ypl-vote-result-item .values {
    margin-left: 1rem;
    width: 85%
  }

  .ypl-vote-result .ypl-vote-result-item .values .description {
    font-size: .25rem
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-option-desc {
    font-size: .32rem;
    color: #333;
    word-wrap: break-word;
    word-break: break-all
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-count {
    margin-top: .07rem;
    float: right
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-count .count {
    font-size: .24rem
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-count .percent {
    font-size: .2rem
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-count.no-1 {
    color: #fc4a1a
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-count.no-2 {
    color: #f7971e
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-count.no-3 {
    color: #1fa2ff
  }

  .ypl-vote-result .ypl-vote-result-item .values .description .vote-count.gray {
    color: #999
  }

  .ypl-vote-result .ypl-vote-result-item .ypl-slider {
    height: .6rem
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 1) {
    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-1 {
      width: 28px;
      height: 28px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #fc4a1a;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-1 i {
      position: absolute;
      width: 14px;
      height: 14px;
      border-radius: 50%;
      background-color: #fc4a1a;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-2 {
      width: 28px;
      height: 28px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #f7971e;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-2 i {
      position: absolute;
      width: 14px;
      height: 14px;
      border-radius: 50%;
      background-color: #f7971e;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-3 {
      width: 28px;
      height: 28px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #1fa2ff;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-3 i {
      position: absolute;
      width: 14px;
      height: 14px;
      border-radius: 50%;
      background-color: #1fa2ff;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #fc4a1a;
      width: 60px;
      height: 60px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 img {
      position: absolute;
      width: 50px;
      height: 50px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 div {
      position: absolute;
      color: #fc4a1a;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #f7971e;
      width: 60px;
      height: 60px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 img {
      position: absolute;
      width: 50px;
      height: 50px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 div {
      position: absolute;
      color: #f7971e;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #1fa2ff;
      width: 60px;
      height: 60px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 img {
      position: absolute;
      width: 50px;
      height: 50px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 div {
      position: absolute;
      color: #1fa2ff;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 2) {
    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-1 {
      width: 14px;
      height: 14px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #fc4a1a;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-1 i {
      position: absolute;
      width: 7px;
      height: 7px;
      border-radius: 50%;
      background-color: #fc4a1a;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-2 {
      width: 14px;
      height: 14px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #f7971e;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-2 i {
      position: absolute;
      width: 7px;
      height: 7px;
      border-radius: 50%;
      background-color: #f7971e;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-3 {
      width: 14px;
      height: 14px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #1fa2ff;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-3 i {
      position: absolute;
      width: 7px;
      height: 7px;
      border-radius: 50%;
      background-color: #1fa2ff;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #fc4a1a;
      width: 30px;
      height: 30px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 img {
      position: absolute;
      width: 25px;
      height: 25px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 div {
      position: absolute;
      color: #fc4a1a;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #f7971e;
      width: 30px;
      height: 30px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 img {
      position: absolute;
      width: 25px;
      height: 25px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 div {
      position: absolute;
      color: #f7971e;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #1fa2ff;
      width: 30px;
      height: 30px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 img {
      position: absolute;
      width: 25px;
      height: 25px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 div {
      position: absolute;
      color: #1fa2ff;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 3) {
    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-1 {
      width: 10px;
      height: 10px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #fc4a1a;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-1 i {
      position: absolute;
      width: 5px;
      height: 5px;
      border-radius: 50%;
      background-color: #fc4a1a;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-2 {
      width: 10px;
      height: 10px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #f7971e;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-2 i {
      position: absolute;
      width: 5px;
      height: 5px;
      border-radius: 50%;
      background-color: #f7971e;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-3 {
      width: 10px;
      height: 10px;
      border: 1px solid transparent;
      border-radius: 50%;
      box-shadow: inset 0 0 1px 0 #1fa2ff;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-normal-3 i {
      position: absolute;
      width: 5px;
      height: 5px;
      border-radius: 50%;
      background-color: #1fa2ff;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #fc4a1a;
      width: 20px;
      height: 20px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 img {
      position: absolute;
      width: 16px;
      height: 16px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-1 div {
      position: absolute;
      color: #fc4a1a;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #f7971e;
      width: 20px;
      height: 20px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 img {
      position: absolute;
      width: 16px;
      height: 16px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-2 div {
      position: absolute;
      color: #f7971e;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 {
      border: 1px solid transparent;
      box-shadow: inset 0 0 1px 0 #1fa2ff;
      width: 20px;
      height: 20px;
      transform: translate(-50%, -50%);
      left: 50%;
      top: 50%;
      border-radius: 50%;
      text-align: center
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 img {
      position: absolute;
      width: 16px;
      height: 16px;
      border-radius: 50%;
      left: 50%;
      top: 50%;
      transform: translate(-50%, -50%)
    }

    .ypl-vote-result .ypl-vote-result-item .slider-thumb-avatar-3 div {
      position: absolute;
      color: #1fa2ff;
      font-size: .2rem;
      top: 100%;
      left: 50%;
      transform: translate(-50%, 25%)
    }
  }

  .ypl-vote-result .ypl-vote-result-item .slider-fill-no-1 {
    background: linear-gradient(90deg, #fe8c00, #fc4a1a)
  }

  .ypl-vote-result .ypl-vote-result-item .slider-fill-no-2 {
    background: linear-gradient(90deg, #ffd200, #f7971e)
  }

  .ypl-vote-result .ypl-vote-result-item .slider-fill-no-3 {
    background: linear-gradient(90deg, #00d2ff, #1fa2ff)
  }

  .ypl-icon {
    display: inline-block
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 1) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 2) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal@2x.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed@2x.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default@2x.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default@2x.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1@2x.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2@2x.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default@2x.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed@2x.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed@2x.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name@2x.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 3) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal@3x.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed@3x.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default@3x.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default@3x.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1@3x.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2@3x.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default@3x.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed@3x.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed@3x.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name@3x.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  .ypl-checkbox {
    display: block;
    height: 100%;
    font-size: .32rem
  }

  .ypl-checkbox input[type=checkbox] {
    display: inline-block;
    position: relative;
    vertical-align: middle;
    width: .36rem;
    height: .36rem
  }

  .ypl-checkbox input[type=checkbox]:before {
    top: 0;
    left: 0;
    content: "";
    transition: background .1s ease-in
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 1) {
    .ypl-checkbox input[type=checkbox]:before {
      background-image: url("/static/assets/icons/ic_check_normal.png")
    }

    .ypl-checkbox input[type=checkbox]:before, .ypl-checkbox input[type=checkbox]:checked:before {
      position: absolute;
      display: inline-block;
      width: .36rem;
      height: .36rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-checkbox input[type=checkbox]:checked:before {
      background-image: url("/static/assets/icons/ic_check_pressed.png")
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 2) {
    .ypl-checkbox input[type=checkbox]:before {
      background-image: url("/static/assets/icons/ic_check_normal@2x.png")
    }

    .ypl-checkbox input[type=checkbox]:before, .ypl-checkbox input[type=checkbox]:checked:before {
      position: absolute;
      display: inline-block;
      width: .36rem;
      height: .36rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-checkbox input[type=checkbox]:checked:before {
      background-image: url("/static/assets/icons/ic_check_pressed@2x.png")
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 3) {
    .ypl-checkbox input[type=checkbox]:before {
      background-image: url("/static/assets/icons/ic_check_normal@3x.png")
    }

    .ypl-checkbox input[type=checkbox]:before, .ypl-checkbox input[type=checkbox]:checked:before {
      position: absolute;
      display: inline-block;
      width: .36rem;
      height: .36rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-checkbox input[type=checkbox]:checked:before {
      background-image: url("/static/assets/icons/ic_check_pressed@3x.png")
    }
  }

  .ypl-icon {
    display: inline-block
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 1) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 2) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal@2x.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed@2x.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default@2x.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default@2x.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1@2x.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2@2x.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default@2x.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed@2x.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed@2x.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name@2x.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 3) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal@3x.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed@3x.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default@3x.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default@3x.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1@3x.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2@3x.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default@3x.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed@3x.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed@3x.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name@3x.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  .ypl-radio {
    display: block;
    height: 100%;
    font-size: .32rem
  }

  .ypl-radio input[type=radio] {
    display: inline-block;
    position: relative;
    vertical-align: middle;
    margin-top: .05rem;
    width: .36rem;
    height: .36rem
  }

  .ypl-radio input[type=radio]:before {
    top: 0;
    left: 0;
    content: "";
    transition: background .1s ease-in
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 1) {
    .ypl-radio input[type=radio]:before {
      background-image: url("/static/assets/icons/ic_radio_normal.png")
    }

    .ypl-radio input[type=radio]:before, .ypl-radio input[type=radio]:checked:before {
      position: absolute;
      display: inline-block;
      width: .36rem;
      height: .36rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-radio input[type=radio]:checked:before {
      background-image: url("/static/assets/icons/ic_radio_pressed.png")
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 2) {
    .ypl-radio input[type=radio]:before {
      background-image: url("/static/assets/icons/ic_radio_normal@2x.png")
    }

    .ypl-radio input[type=radio]:before, .ypl-radio input[type=radio]:checked:before {
      position: absolute;
      display: inline-block;
      width: .36rem;
      height: .36rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-radio input[type=radio]:checked:before {
      background-image: url("/static/assets/icons/ic_radio_pressed@2x.png")
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 3) {
    .ypl-radio input[type=radio]:before {
      background-image: url("/static/assets/icons/ic_radio_normal@3x.png")
    }

    .ypl-radio input[type=radio]:before, .ypl-radio input[type=radio]:checked:before {
      position: absolute;
      display: inline-block;
      width: .36rem;
      height: .36rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-radio input[type=radio]:checked:before {
      background-image: url("/static/assets/icons/ic_radio_pressed@3x.png")
    }
  }

  .ypl-vote-voting ul li {
    padding: .26rem;
    transition: background .1s ease-in
  }

  .ypl-vote-voting ul li.touched {
    background-color: #f6f6f6;
    transition: background .05s ease-in
  }

  .ypl-vote-voting .ypl-checkbox, .ypl-vote-voting .ypl-radio {
    vertical-align: bottom !important;
    display: flex;
    line-height: .45rem
  }

  .ypl-vote-voting input[type=checkbox], .ypl-vote-voting input[type=radio] {
    vertical-align: bottom !important
  }

  .ypl-vote-voting .option-name {
    margin-left: .3rem;
    max-width: 85%;
    word-break: break-all;
    word-wrap: break-word
  }

  .ypl-icon {
    display: inline-block
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 1) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 2) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal@2x.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed@2x.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default@2x.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default@2x.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1@2x.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2@2x.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default@2x.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed@2x.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed@2x.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name@2x.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone@2x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  @media only screen and (-webkit-min-device-pixel-ratio: 3) {
    .ypl-icon-small-star-disable {
      width: .18rem;
      height: .18rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_collection_default@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-normal {
      background-image: url("/static/assets/icons/ic_collection_normal@3x.png")
    }

    .ypl-icon-star-normal, .ypl-icon-star-selected {
      width: .38rem;
      height: .38rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-star-selected {
      background-image: url("/static/assets/icons/ic_collection_pressed@3x.png")
    }

    .ypl-icon-small-view {
      width: .28rem;
      height: .17rem;
      background-image: url("/static/assets/icons/ic_tpshy_read1_default@3x.png")
    }

    .ypl-icon-down, .ypl-icon-small-view {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-down {
      width: .2rem;
      height: .12rem;
      background-image: url("/static/assets/icons/ic_con_down_default@3x.png")
    }

    .ypl-icon-chat {
      width: .31rem;
      height: .28rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_comment_default@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-1 {
      background-image: url("/static/assets/icons/ic_no1@3x.png")
    }

    .ypl-icon-no-1, .ypl-icon-no-2 {
      width: .4rem;
      height: .54rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-no-2 {
      background-image: url("/static/assets/icons/ic_no2@3x.png")
    }

    .ypl-icon-heart-normal {
      background-image: url("/static/assets/icons/ic_zan_default@3x.png")
    }

    .ypl-icon-heart-normal, .ypl-icon-heart-selected {
      width: .4rem;
      height: .4rem;
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-heart-selected {
      background-image: url("/static/assets/icons/ic_zan_pressed@3x.png")
    }

    .ypl-icon-close {
      width: .28rem;
      height: .28rem;
      background-image: url("/static/assets/icons/closed@3x.png")
    }

    .ypl-icon-close, .ypl-icon-user {
      background-position: 50%;
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }

    .ypl-icon-user {
      width: .3rem;
      height: .3rem;
      background-image: url("/static/assets/icons/ic_tp_name@3x.png")
    }

    .ypl-icon-mobile {
      width: .22rem;
      height: .35rem;
      background-position: 50%;
      background-image: url("/static/assets/icons/ic_tp_phone@3x.png");
      background-repeat: no-repeat;
      overflow: hidden;
      background-size: 100%, 100%
    }
  }

  body, html {
    width: 100%;
    height: 100%;
    font-family: PingFang-SC-Regular, \\5FAE\8F6F\96C5\9ED1, MicrosoftYaHei, Helvetica Neue, Helvetica, sans-serif !important;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    overflow-x: hidden;
    -webkit-overflow-scrolling: touch;
    color: #2e2e2e
  }

  body, html, li, ul {
    margin: 0;
    padding: 0
  }

  li, ul {
    list-style: none
  }

  a, article, aside, b, body, button, dd, div, dl, dt, figcaption, figure, footer, form, h1, h2, h3, h4, h5, h6, header, i, input, li, nav, p, section, select, span, textarea, ul {
    padding: 0;
    margin: 0;
    text-decoration: none;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    border: 0;
    -webkit-tap-highlight-color: transparent;
    -webkit-font-smoothing: antialiased;
    outline: none
  }

  a:hover, article:hover, aside:hover, b:hover, body:hover, button:hover, dd:hover, div:hover, dl:hover, dt:hover, figcaption:hover, figure:hover, footer:hover, form:hover, h1:hover, h2:hover, h3:hover, h4:hover, h5:hover, h6:hover, header:hover, i:hover, input:hover, li:hover, nav:hover, p:hover, section:hover, select:hover, span:hover, textarea:hover, ul:hover {
    outline: none
  }

  input, textarea {
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    line-height: normal
  }

  a, a:active, a:hover, a:link, a:visited {
    text-decoration: none
  }

  [type=password], [type=text], button, select, textarea {
    border: none
  }

  button {
    padding: 0
  }

  input, select {
    border: none;
    outline: none;
    line-height: normal
  }

  input::-webkit-input-placeholder, textarea::-webkit-input-placeholder {
    color: #6d768d
  }

  input:-moz-placeholder, input::-moz-placeholder, textarea:-moz-placeholder, textarea::-moz-placeholder {
    color: #6d768d
  }

  input:-ms-input-placeholder, textarea:-ms-input-placeholder {
    color: #6d768d
  }

  a, div, img {
    -webkit-tap-highlight-color: transparent;
    -webkit-touch-callout: none;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none
  }

  h1, h2, h3, p {
    -webkit-margin-before: 0;
    -webkit-margin-after: 0;
    -webkit-padding-before: 0;
    -webkit-padding-after: 0
  }

  img {
    vertical-align: top
  }

  .f-b {
    font-weight: 700
  }

  .f-xx {
    font-size: .05rem
  }

  .f-xs {
    font-size: .24rem
  }

  .f-sm {
    font-size: .26rem
  }

  .f-md {
    font-size: .28rem
  }

  .f-lg {
    font-size: .32rem
  }

  .f-xl {
    font-size: .34rem
  }

  .f-0 {
    font-size: 0
  }

  .p-0 {
    padding: 0
  }

  .m-t-xs {
    margin-top: .05rem
  }

  .m-t-sm {
    margin-top: .1rem
  }

  .m-t-md {
    margin-top: .15rem
  }

  .m-t-lg {
    margin-top: .2rem
  }

  .m-t-xl {
    margin-top: .3rem !important
  }

  .m-t-xxl {
    margin-top: .4rem
  }

  .m-t-xxxl {
    margin-top: .5rem
  }

  .m-r-xs {
    margin-right: .05rem
  }

  .m-r-sm {
    margin-right: .1rem
  }

  .m-r-md {
    margin-right: .15rem
  }

  .m-r-lg {
    margin-right: .2rem
  }

  .m-r-xl {
    margin-right: .3rem
  }

  .m-r-xxl {
    margin-right: .4rem
  }

  .m-r-xxxl {
    margin-right: .5rem
  }

  .m-l-xs {
    margin-left: .05rem
  }

  .m-l-sm {
    margin-left: .1rem
  }

  .m-l-md {
    margin-left: .15rem
  }

  .m-l-lg {
    margin-left: .2rem
  }

  .m-l-xl {
    margin-left: .3rem
  }

  .m-l-xxl {
    margin-left: .4rem
  }

  .m-l-xxxl {
    margin-left: .5rem
  }

  .m-b-xs {
    margin-bottom: .05rem
  }

  .m-b-sm {
    margin-bottom: .1rem
  }

  .m-b-md {
    margin-bottom: .15rem
  }

  .m-b-lg {
    margin-bottom: .2rem
  }

  .m-b-xl {
    margin-bottom: .3rem
  }

  .m-b-xxl {
    margin-bottom: .4rem
  }

  .m-b-xxxl {
    margin-bottom: .5rem
  }

  .p-t-xs {
    padding-top: .05rem
  }

  .p-t-sm {
    padding-top: .1rem
  }

  .p-t-md {
    padding-top: .15rem
  }

  .p-t-lg {
    padding-top: .2rem
  }

  .p-t-xl {
    padding-top: .3rem
  }

  .p-t-xxl {
    padding-top: .4rem
  }

  .p-t-xxxl {
    padding-top: .5rem
  }

  .p-r-xs {
    padding-right: .05rem
  }

  .p-r-sm {
    padding-right: .1rem
  }

  .p-r-md {
    padding-right: .15rem
  }

  .p-r-lg {
    padding-right: .2rem
  }

  .p-r-xl {
    padding-right: .3rem
  }

  .p-r-xxl {
    padding-right: .4rem
  }

  .p-r-xxxl {
    padding-right: .5rem
  }

  .p-l-xs {
    padding-left: .05rem
  }

  .p-l-sm {
    padding-left: .1rem
  }

  .p-l-md {
    padding-left: .15rem
  }

  .p-l-lg {
    padding-left: .2rem
  }

  .p-l-xl {
    padding-left: .3rem
  }

  .p-l-xxl {
    padding-left: .4rem
  }

  .p-l-xxxl {
    padding-left: .5rem
  }

  .p-b-xs {
    padding-bottom: .05rem
  }

  .p-b-sm {
    padding-bottom: .1rem
  }

  .p-b-md {
    padding-bottom: .15rem
  }

  .p-b-lg {
    padding-bottom: .2rem
  }

  .p-b-xl {
    padding-bottom: .3rem
  }

  .p-b-xxl {
    padding-bottom: .4rem
  }

  .p-b-xxxl {
    padding-bottom: .5rem
  }

  .text-muted {
    color: #aaa
  }

  .text-primary {
    color: #333
  }

  .text-success {
    color: #3c763d
  }

  .text-info {
    color: #1fa2ff
  }

  .text-warning {
    color: #8a6d3b
  }

  .text-danger {
    color: #a94442
  }

  .text-white {
    color: #fff
  }

  .pull-right {
    float: right
  }

  .pull-left {
    float: left
  }

  .scroll-y {
    height: 100%;
    overflow-y: scroll
  }

  .w-full {
    width: 100%
  }

  .h-full {
    height: 100%
  }

  .overflowHidden {
    overflow: hidden
  }

  .bg-white {
    background-color: #fff
  }

  .list-unstyle {
    list-style: none
  }

  .mint-cell-text {
    vertical-align: baseline
  }

  .text-black {
    color: #2e2e2e
  }

  .text-green {
    color: #50e3c2
  }

  .text-cyan {
    color: #05cedc
  }

  .text-yellow {
    color: #ff7200
  }

  .text-red {
    color: #ff7c7c
  }

  .text-purple {
    color: #9c86ff
  }

  .text-light-purple {
    color: #86a4ff
  }

  .text-center {
    text-align: center
  }

  .text-left {
    text-align: left
  }

  .text-right {
    text-align: right
  }

  .red-dot {
    position: relative
  }

  .red-dot:after {
    content: "";
    width: 4px;
    height: 4px;
    background-color: red;
    border-radius: 50%;
    right: 0;
    top: 0;
    position: absolute
  }

  .mint-cell-value {
    border: none
  }

  .letterSpace1 {
    letter-spacing: 1px
  }

  .header-top-search {
    padding: 0 .2rem;
    background-color: #fff;
    width: 100%;
    display: inline-block;
    border-radius: .46rem;
    font-weight: 400;
    font-size: .24rem;
    letter-spacing: 1px;
    line-height: .46rem
  }

  .image-placeholder img {
    border-radius: 3px
  }

  .mint-button:after {
    background: transparent
  }

  .mint-header {
    width: 100%;
    background-color: #fff;
    color: #000;
    height: .9rem;
    position: relative
  }

  .mint-header:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .mint-header:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .mint-header:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .mint-header .mint-header-button {
    -webkit-box-flex: 0;
    -ms-flex: none;
    flex: none
  }

  .mint-header .mint-header-button.is-left {
    padding-right: .15rem
  }

  .mint-header .mint-header-button .current-city-name {
    width: .7rem;
    display: inline-block;
    text-align: center
  }

  .mint-header .mint-header-button.is-right {
    width: .96rem
  }

  .mint-header .mint-header-button.is-right .mint-button {
    margin-right: .2rem
  }

  .mint-header .mint-header-title {
    font-size: .32rem
  }

  .mint-header .mint-button-icon {
    vertical-align: baseline
  }

  .mint-cell-wrapper {
    padding: 0
  }

  .footer-wrapper {
    position: relative;
    height: .9rem
  }

  @media only screen and (device-width: 375px) and (device-height: 812px) and (-webkit-device-pixel-ratio: 3) {
    .footer-wrapper {
      height: .98rem
    }
  }

  @media only screen and (device-width: 414px) and (device-height: 896px) and (-webkit-device-pixel-ratio: 2) {
    .footer-wrapper {
      height: .98rem
    }
  }

  @media only screen and (device-width: 414px) and (device-height: 896px) and (-webkit-device-pixel-ratio: 3) {
    .footer-wrapper {
      height: .98rem
    }
  }

  .ypl-page-wrapper {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0
  }

  .ypl-flex {
    display: flex;
    display: -webkit-box;
    display: -ms-flexbox;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -ms-flex-direction: column;
    flex-direction: column;
    overflow: hidden;
    height: 100%
  }

  .ypl-flex .flex {
    -ms-flex: 1;
    flex: 1;
    -webkit-box-flex: 1;
    -moz-box-flex: 1;
    position: relative;
    overflow: auto;
    -webkit-overflow-scrolling: touch
  }

  .flex-col, .flex-row {
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex
  }

  .flex-col {
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    -ms-flex-direction: column;
    flex-direction: column
  }

  .flex1 {
    -webkit-box-flex: 1;
    -ms-flex: 1;
    flex: 1
  }

  .flex2 {
    -webkit-box-flex: 2;
    -ms-flex: 2;
    flex: 2
  }

  .flex3 {
    -webkit-box-flex: 3;
    -ms-flex: 3;
    flex: 3
  }

  .flex4 {
    -webkit-box-flex: 4;
    -ms-flex: 4;
    flex: 4
  }

  .noData {
    text-align: center;
    padding-top: 1.5rem
  }

  .noData img {
    width: 2.3rem;
    height: 3.3rem
  }

  .noData p {
    color: #397cca;
    font-size: .26rem;
    margin-top: .24rem
  }

  .noData-img {
    align-items: center;
    justify-content: center;
    margin-top: 2rem
  }

  .noData-img img {
    width: 3.04rem;
    height: 2.52rem
  }

  .noData-img p {
    color: #397cca;
    font-size: .26rem;
    margin-top: .4rem
  }

  .oneLine {
    white-space: nowrap
  }

  .oneLine, .twoLine {
    overflow: hidden;
    text-overflow: ellipsis
  }

  .twoLine {
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical
  }

  ::-webkit-scrollbar {
    display: none
  }

  .clearFloat:after {
    content: ".";
    display: block;
    height: 0;
    clear: both;
    visibility: hidden
  }

  .clearMarginTop:before {
    content: "";
    display: table
  }

  .textellipsis {
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis
  }

  input[type=button], input[type=reset], input[type=search], input[type=submit] {
    -webkit-appearance: none;
    outline: none;
    border: none
  }

  .mint-msgbox-message {
    color: #2e2e2e;
    font-size: .28rem;
    line-height: .4rem
  }

  .MeetingSignUpInfoPage {
    background: #f6f6f6;
    padding-bottom: 1rem
  }

  .MeetingSignUpInfoPage .errorMsg {
    opacity: .8;
    width: 100%;
    color: #fff;
    padding: .1rem;
    font-size: .28rem;
    line-height: .4rem;
    text-align: center;
    background: #ef4f4f
  }

  .MeetingSignUpInfoPage .btnSubmit {
    width: 80%;
    height: .9rem;
    line-height: .9rem;
    margin: 1rem 10%;
    color: #fff;
    font-size: .36rem;
    text-align: center;
    background: #3498db;
    border-radius: .08rem
  }

  .MeetingSignUpInfoPage .downloadApp {
    bottom: 0;
    width: 100%;
    z-index: 100;
    position: fixed
  }

  .MeetingSignUpInfoPage .list {
    padding: .5rem .3rem;
    background: #fff
  }

  .MeetingSignUpInfoPage .list .item {
    font-size: .28rem
  }

  .MeetingSignUpInfoPage .list .item .cell {
    margin: .3rem 0
  }

  .MeetingSignUpInfoPage .list .item .cell input {
    line-height: .3rem
  }

  .MeetingSignUpInfoPage .list .item .cell input, .MeetingSignUpInfoPage .list .item .cell textarea {
    width: 100%;
    font-size: .28rem;
    padding: .3rem .15rem;
    margin-top: .3rem;
    border-radius: .08rem;
    border: 1px solid #ddd
  }

  .MeetingSignUpInfoPage .list .item .cell textarea {
    height: 2rem;
    line-height: .36rem
  }

  .MeetingSignUpInfoPage .list .item .cell .radio {
    padding: .2rem 0
  }

  .MeetingSignUpInfoPage .list .item .cell .radio img {
    width: .34rem;
    height: .34rem
  }

  .MeetingSignUpInfoPage .list .item .cell .radio p {
    line-height: .34rem;
    margin-left: .3rem
  }

  .ypl-vote-page {
    width: 100%;
    background-color: #f6f6f6;
    height: 100%;
    overflow-y: auto
  }

  .ypl-vote-page .ypl-vote-cover {
    position: relative;
    height: 3.66rem
  }

  .ypl-vote-page .ypl-vote-cover .collect-icon {
    position: absolute;
    right: .2rem;
    top: .2rem;
    width: .5rem;
    height: .5rem;
    background-color: hsla(0, 0%, 100%, .5);
    box-shadow: 0 0 1px 0 #fff;
    border-radius: 3px;
    border-color: transparent
  }

  .ypl-vote-page .ypl-vote-cover .collect-icon .ypl-icon {
    display: block;
    margin-top: .04rem;
    margin-left: .04rem;
    width: .4rem;
    height: .4rem
  }

  .ypl-vote-page .ypl-content-block {
    padding: 0 .26rem;
    margin-bottom: .14rem
  }

  .ypl-vote-page .ypl-content-block:last-child {
    margin-bottom: 0
  }

  .ypl-vote-page .ypl-content-block .header {
    margin-top: .2rem;
    padding-bottom: .14rem;
    font-size: .28rem;
    color: #999;
    letter-spacing: .1em
  }

  .ypl-vote-page .ypl-content-block .header .ypl-icon-down {
    float: right;
    width: .4rem;
    height: .4rem;
    background-size: 50%;
    transform-origin: center center
  }

  .ypl-vote-page .ypl-content-block .content-enter-active, .ypl-vote-page .ypl-content-block .content-leave-active {
    transition: opacity .1s
  }

  .ypl-vote-page .ypl-content-block .content-enter, .ypl-vote-page .ypl-content-block .content-leave {
    opacity: 0
  }

  .ypl-vote-page .remove-padding-bottom {
    padding-bottom: 0 !important
  }

  .ypl-vote-page .vote-cover {
    display: block;
    width: 100%;
    height: 3.66rem
  }

  .ypl-vote-page .vote-title {
    font-size: .34rem;
    font-weight: 400;
    line-height: .45rem;
    color: #333;
    margin: .15rem 0;
    width: 100%
  }

  .ypl-vote-page .vote-title-count {
    font-size: .24rem;
    color: #ff7200
  }

  .ypl-vote-page .vote-base-info {
    font-size: .24rem;
    color: #999
  }

  .ypl-vote-page .vote-view-count-info {
    font-size: .24rem
  }

  .ypl-vote-page .vote-base-info-line {
    margin-bottom: .24rem
  }

  .ypl-vote-page .vote-view-count {
    font-size: .2rem;
    color: #999;
    margin-right: .5rem
  }

  .ypl-vote-page .voted-count {
    font-size: .2rem;
    color: #ff7200
  }

  .ypl-vote-page .vote-description {
    margin-top: .11rem;
    margin-bottom: .35rem;
    color: #333;
    font-size: .28rem;
    line-height: 1.5
  }

  .ypl-vote-page .vote-btn-container {
    position: relative;
    text-align: center;
    padding-top: 1.84rem;
    padding-bottom: .3rem
  }

  .ypl-vote-page .btn-vote {
    border: 1px solid #1fa2ff;
    background-color: #1fa2ff;
    width: 100%;
    height: .9rem;
    color: #fff;
    font-size: .36rem;
    border-radius: 0
  }

  .ypl-vote-page .btn-vote:disabled {
    opacity: .3
  }

  .ypl-vote-page .vote-user-info-dialog {
    width: 5.52rem;
    height: 7.32rem
  }

  .ypl-vote-page .vote-user-info-dialog .header {
    height: .54rem
  }

  .ypl-vote-page .vote-user-info-dialog .body p {
    font-size: .28rem;
    text-align: center;
    letter-spacing: .05rem;
    line-height: normal;
    color: #333
  }

  .ypl-vote-page .vote-user-info-dialog .body .form {
    padding: .26rem
  }

  .ypl-vote-page .vote-user-info-dialog .body .fields {
    text-align: left;
    font-size: .28rem;
    color: #999;
    margin-top: .3rem;
    margin-bottom: .5rem;
    position: relative
  }

  .ypl-vote-page .vote-user-info-dialog .body .fields:after {
    pointer-events: none;
    content: "";
    display: block;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
    border-width: 0 0 1px;
    border-style: solid;
    border-color: #ddd;
    border-radius: 0;
    transform-origin: 0 0;
    box-sizing: border-box;
    -webkit-transform-origin: 0 0;
    -webkit-tap-highlight-color: transparent
  }

  @media (-webkit-max-device-pixel-ratio: 2.49) and (-webkit-min-device-pixel-ratio: 1.5),(max-resolution: 2.49dppx) and (min-resolution: 1.5dppx),(max-resolution: 239dpi) and (min-resolution: 144dpi), not all {
    .ypl-vote-page .vote-user-info-dialog .body .fields:after {
      width: 200%;
      height: 200%;
      transform: scale(.5);
      -webkit-transform: scale(.5)
    }
  }

  @media (-webkit-min-device-pixel-ratio: 2.5),(min-resolution: 2.5dppx),(min-resolution: 240dpi), not all {
    .ypl-vote-page .vote-user-info-dialog .body .fields:after {
      width: 300%;
      height: 300%;
      transform: scale(.333);
      -webkit-transform: scale(.333)
    }
  }

  .ypl-vote-page .vote-user-info-dialog .body .fields .iconfont {
    margin-right: .2rem;
    color: #ccc
  }

  .ypl-vote-page .vote-user-info-dialog .body .fields .fields-label {
    vertical-align: middle
  }

  .ypl-vote-page .vote-user-info-dialog .body .fields .ypl-icon-user {
    height: .35rem
  }

  .ypl-vote-page .vote-user-info-dialog .body .fields label {
    display: block;
    margin-bottom: .05rem
  }

  .ypl-vote-page .vote-user-info-dialog .body .fields input[type=number], .ypl-vote-page .vote-user-info-dialog .body .fields input[type=text] {
    height: .6rem;
    width: 100%;
    color: #333
  }

  .ypl-vote-page .vote-user-info-dialog .body .ypl-line {
    border-color: #f0f0f0
  }

  .ypl-vote-page .vote-user-info-dialog .footer {
    font-size: .4rem;
    text-align: center
  }

  .ypl-vote-page .vote-user-info-dialog .footer button {
    margin-top: .24rem;
    color: #fff;
    font-size: .28rem;
    background-color: #1fa2ff;
    border: 1px solid #1fa2ff;
    border-radius: .08rem;
    width: 4rem;
    height: .66rem;
    box-shadow: 0 0 .05rem 1px rgba(31, 162, 255, .65)
  }
</style>
