import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Javaboy from '@/components/Javaboy'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/aaa',
      name: 'HelloWorld',
      component: HelloWorld
    },{
      path: '/hello',
      name: 'Javaboy',
      component: Javaboy
    }
  ]
})
