<template>
  <a-layout>
    <the-header></the-header>
    <a-layout-content style="padding: 0 50px">
      <a-breadcrumb style="margin: 16px 0">
        <a-breadcrumb-item>Home</a-breadcrumb-item>
        <a-breadcrumb-item>List</a-breadcrumb-item>
        <a-breadcrumb-item>App</a-breadcrumb-item>
      </a-breadcrumb>
      <a-layout style="padding: 24px 0; background: #fff">
        <the-sider></the-sider>
        <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
          {{ resp }}
          <a-input v-model:value="resp" @change="onchange()"></a-input>
        </a-layout-content>
      </a-layout>
    </a-layout-content>
    <a-layout-footer style="text-align: center">
      Ant Design ©2018 Created by Ant UED
    </a-layout-footer>
  </a-layout>
</template>

<script setup>
import TheHeader from "../components/the-header.vue"
import TheSider from "../components/the-sider.vue"
import axios from "axios"
import {ref} from "vue";
import {message} from "ant-design-vue"

const resp = ref()

const onchange = () => {
  console.log("手工赋值，内容:", resp.value)
}

axios.get("http://localhost:18000/nls/query", {
  params: {
    "mobile": "Huawei"
  }
}).then((response)=>{
  console.log(response)
  let data = response.data
  if (data.success) {
    resp.value = data.content
    console.log("已赋值，内容:", resp.value)
  } else {
    message.error(data.message)
  }
})
</script>

<style scoped>
.ant-row-rtl .logo {
  float: right;
  margin: 16px 0 16px 24px;
}
</style>