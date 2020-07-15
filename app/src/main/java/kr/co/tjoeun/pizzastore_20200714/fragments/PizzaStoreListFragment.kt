package kr.co.tjoeun.pizzastore_20200714.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*
import kr.co.tjoeun.pizzastore_20200714.R
import kr.co.tjoeun.pizzastore_20200714.ViewPizzaStoreDetailActivity
import kr.co.tjoeun.pizzastore_20200714.adapters.PizzaStoreAdapter
import kr.co.tjoeun.pizzastore_20200714.datas.PizzaStore

class PizzaStoreListFragment : Fragment() {

    val mPizzaStoreList = ArrayList<PizzaStore>()

    lateinit var mAdapter : PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStoreList.add(PizzaStore("피자헛", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg", "1588-5588"))
        mPizzaStoreList.add(PizzaStore("파파존스", "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800", "1577-8080"))
        mPizzaStoreList.add(PizzaStore("도미노 피자", "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png", "1577-3082"))
        mPizzaStoreList.add(PizzaStore("미스터 피자", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200", "1577-0077"))

        mAdapter = PizzaStoreAdapter(activity!!, R.layout.pizza_store_list_item, mPizzaStoreList)

        pizzaStoreListView.adapter = mAdapter

//        리스트뷰의 아이템 클릭 이벤트 지원
        pizzaStoreListView.setOnItemClickListener { parent, view, position, id ->

//            클릭된 가게가 어디인지 찾아내서 저장
            val clickedPizzaStore = mPizzaStoreList[position]

//            가게 정보를 들고 상세 보기 화면으로 이동
            val myIntent = Intent(activity, ViewPizzaStoreDetailActivity::class.java)

//            가게 정보를 첨부 => Serializable을 붙여야 에러 X.
            myIntent.putExtra("pizzaStore", clickedPizzaStore)

            startActivity(myIntent)

        }

    }

}