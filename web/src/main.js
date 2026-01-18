import { createApp } from 'vue'
import App from './App.vue'
import * as Icons from '@ant-design/icons-vue'
import Antd from 'ant-design-vue'
import router from './router'
import './style.css'
import 'ant-design-vue/dist/reset.css'

const app = createApp(App);
app.use(Antd).use(router).mount('#app');

const icons = Icons
for (const i in icons) {
    app.component(i, icons[i])
}