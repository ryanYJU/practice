<template>

    <v-card outlined>
        <v-card-title>
            OrderDetail # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Menu" v-model="item.menu" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="Count" v-model="item.count" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="TotalAmount" v-model="item.totalAmount" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IsRapidDelivery" v-model="item.isRapidDelivery" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'OrderDetailViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/orderDetails/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

