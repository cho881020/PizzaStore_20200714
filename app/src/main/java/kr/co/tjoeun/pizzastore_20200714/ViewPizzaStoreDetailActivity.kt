package kr.co.tjoeun.pizzastore_20200714

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kr.co.tjoeun.pizzastore_20200714.datas.PizzaStore

class ViewPizzaStoreDetailActivity : BaseActivity() {

//    받아오는 피자가게 정보를 담아주기 위한 멤버변수
//    setupEvents / setValues 등의 함수가 공유하기 편하게 만들기 위해 멤버변수로 저장.
    lateinit var mPizzaStore : PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
//        멤버변수로 있는 피자가게 변수를 intent 변수에서 받아온 가게로 대입.
        mPizzaStore = intent.getSerializableExtra("pizzaStore") as PizzaStore

//        피자가게변수를 통해 화면 데이터 세팅.
        storeNameTxt.text = mPizzaStore.name
        phoneNumTxt.text = mPizzaStore.phoneNum

//        이미지뷰에 => 웹에있는 그림 띄우기 Glide 활용
        Glide.with(mContext).load(mPizzaStore.logoUrl).into(logoImg)

    }


}