import { createStore } from 'vuex'; 

export default createStore({
    state:{
        items:[],
        completeItems:[]
    },
    mutations:{
        addItem(state,item){
            state.items.push({text:item,checked:false});
        },
        itemDone(state,{index}){ //更改item checked
            state.items[index].checked = !state.items[index].checked;
            state.completeItems.push(state.items[index])
        },
        removeItem(state,index){ //刪除item
            state.items.splice(index,1)
        }
    },
    actions:{
        addItem({commit},item){
            commit('addItem',item)
        },
        itemDone({commit},{index}){
            commit('itemDone',{index})
        },
        removeItem({commit},index){
            commit('removeItem',index)
        }
    },
    getters:{
        items: state => state.items,
        itemlength: state => state.items.length,
        completeItems: state => state.completeItems
    }
})