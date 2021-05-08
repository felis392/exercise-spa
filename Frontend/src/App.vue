<template>
  <v-app>
    <v-main>
      <navi-bar />
      <router-view/>
    </v-main>
  </v-app>
</template>

<script lang="ts">
import { defineComponent } from 'vue'
import NaviBar from './components/NaviBar.vue'

export default defineComponent({
  name: 'App',
  components: {
    NaviBar
  },

  data () {
    return {
      //
    }
  }
})
</script>
