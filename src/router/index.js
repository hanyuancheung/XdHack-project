import Router from 'vue-router'
import Vue from 'vue'
import helloword from '../components/HelloWorld'
import login from '../components/login'
import person from '../components/person'
import preference from '../components/preference'

Vue.use(Router)
const routerPush = Router.prototype.push
Router.prototype.push = function push(location) {
    return routerPush.call(this, location).catch(error=> error)
}

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            component: login
        },
        {
            path: '/helloword',
            component: helloword
        },
        {

            path: '/person',
            component: person
        },
        {

            path: '/preference',
            component: preference
        },

    ]
})
