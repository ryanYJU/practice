
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 주문Manager from "./components/listers/주문Cards"
import 주문Detail from "./components/listers/주문Detail"
import OrderInfoManager from "./components/listers/OrderInfoCards"
import OrderInfoDetail from "./components/listers/OrderInfoDetail"

import 메뉴판View from "./components/메뉴판View"
import 메뉴판ViewDetail from "./components/메뉴판ViewDetail"
import 통합주문상태View from "./components/통합주문상태View"
import 통합주문상태ViewDetail from "./components/통합주문상태ViewDetail"
import MenuInfoView from "./components/MenuInfoView"
import MenuInfoViewDetail from "./components/MenuInfoViewDetail"
import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"
import 결제이력Manager from "./components/listers/결제이력Cards"
import 결제이력Detail from "./components/listers/결제이력Detail"
import PaymentInfoManager from "./components/listers/PaymentInfoCards"
import PaymentInfoDetail from "./components/listers/PaymentInfoDetail"

import 주문관리Manager from "./components/listers/주문관리Cards"
import 주문관리Detail from "./components/listers/주문관리Detail"
import OrderManagementManager from "./components/listers/OrderManagementCards"
import OrderManagementDetail from "./components/listers/OrderManagementDetail"

import 주문상세보기View from "./components/주문상세보기View"
import 주문상세보기ViewDetail from "./components/주문상세보기ViewDetail"
import OrderDetailView from "./components/OrderDetailView"
import OrderDetailViewDetail from "./components/OrderDetailViewDetail"

import DeliveryInfoManager from "./components/listers/DeliveryInfoCards"
import DeliveryInfoDetail from "./components/listers/DeliveryInfoDetail"

import DeliveryView from "./components/DeliveryView"
import DeliveryViewDetail from "./components/DeliveryViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/주문',
                name: '주문Manager',
                component: 주문Manager
            },
            {
                path: '/주문/:id',
                name: '주문Detail',
                component: 주문Detail
            },
            {
                path: '/orderInfos',
                name: 'OrderInfoManager',
                component: OrderInfoManager
            },
            {
                path: '/orderInfos/:id',
                name: 'OrderInfoDetail',
                component: OrderInfoDetail
            },

            {
                path: '/메뉴판',
                name: '메뉴판View',
                component: 메뉴판View
            },
            {
                path: '/메뉴판/:id',
                name: '메뉴판ViewDetail',
                component: 메뉴판ViewDetail
            },
            {
                path: '/통합주문상태',
                name: '통합주문상태View',
                component: 통합주문상태View
            },
            {
                path: '/통합주문상태/:id',
                name: '통합주문상태ViewDetail',
                component: 통합주문상태ViewDetail
            },
            {
                path: '/menuInfos',
                name: 'MenuInfoView',
                component: MenuInfoView
            },
            {
                path: '/menuInfos/:id',
                name: 'MenuInfoViewDetail',
                component: MenuInfoViewDetail
            },
            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },
            {
                path: '/결제이력',
                name: '결제이력Manager',
                component: 결제이력Manager
            },
            {
                path: '/결제이력/:id',
                name: '결제이력Detail',
                component: 결제이력Detail
            },
            {
                path: '/paymentInfos',
                name: 'PaymentInfoManager',
                component: PaymentInfoManager
            },
            {
                path: '/paymentInfos/:id',
                name: 'PaymentInfoDetail',
                component: PaymentInfoDetail
            },

            {
                path: '/주문관리',
                name: '주문관리Manager',
                component: 주문관리Manager
            },
            {
                path: '/주문관리/:id',
                name: '주문관리Detail',
                component: 주문관리Detail
            },
            {
                path: '/orderManagements',
                name: 'OrderManagementManager',
                component: OrderManagementManager
            },
            {
                path: '/orderManagements/:id',
                name: 'OrderManagementDetail',
                component: OrderManagementDetail
            },

            {
                path: '/주문상세보기',
                name: '주문상세보기View',
                component: 주문상세보기View
            },
            {
                path: '/주문상세보기/:id',
                name: '주문상세보기ViewDetail',
                component: 주문상세보기ViewDetail
            },
            {
                path: '/orderDetails',
                name: 'OrderDetailView',
                component: OrderDetailView
            },
            {
                path: '/orderDetails/:id',
                name: 'OrderDetailViewDetail',
                component: OrderDetailViewDetail
            },

            {
                path: '/deliveryInfos',
                name: 'DeliveryInfoManager',
                component: DeliveryInfoManager
            },
            {
                path: '/deliveryInfos/:id',
                name: 'DeliveryInfoDetail',
                component: DeliveryInfoDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryView',
                component: DeliveryView
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryViewDetail',
                component: DeliveryViewDetail
            },


    ]
})
