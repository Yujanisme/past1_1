<template>
    <div id="todoList">
        <div id="add">
            <h1>新增代辦事項</h1>
            <input  v-model="new_item" @keyup.enter="addItem" style="margin:20px">
            <button @click="addItem()">新增</button>
        </div>
        <div id="item" style="display: grid; grid-template-columns: 1fr 1fr; width: 80%; margin: 0 auto;">
            <div id="wait" style="background-color: lightblue; text-align: center;">
                <h1>代辦事項</h1>
                <label style="display: inline-block; padding:2px">待辦數量 :</label>
                <p style="display: inline-block;">{{itemlength}}</p>
                <ul style="list-style-type:none; text-align: left; list-style-position:outside;  font-size:20px">
                    <li v-for="(item, index) in items" :key="item.text" style="padding:10px">
                        <input type="checkbox" :checked="item.checked" @change="itemDone(index)"/>
                        {{item.text}}
                        <button @click="removeItem(index)">刪除</button>
                    </li>
                </ul>
            </div>
            
            <div id="complete" style="background-color: lightcoral; text-align: center; list-style-type:none;">
                <h1>已完成</h1>
                <ol style="text-align: left; list-style-position:outside;  font-size:20px">
                    <li v-for="(item, index) in completeItems" :key="index">{{ item.text }}</li>
                </ol>
            </div>
        </div>
    </div>
</template>
<script>
    export default {
        data(){
            return{
                new_item:'',
                count:0
            };
        },
        computed:{
            items(){
                return this.$store.getters.items
            },
            itemlength(){
                return this.$store.getters.itemlength
            },
            completeItems(){
                return this.$store.getters.completeItems
            }
        },
        methods:{
            addItem(){
                if(this.new_item.trim() !== "") {
                    this.$store.dispatch('addItem',this.new_item);
                    this.new_item=""
                }
            },
            itemDone(index,item){
                this.$store.dispatch('itemDone',{item,index}),
                this.removeItem(index)
            },
            removeItem(index){
                this.$store.dispatch('removeItem',index)
            }
        }
    };
</script>
