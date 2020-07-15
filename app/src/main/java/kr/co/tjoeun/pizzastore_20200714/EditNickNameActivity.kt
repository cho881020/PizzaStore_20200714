package kr.co.tjoeun.pizzastore_20200714

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//        ok버튼을 누르면 완료 처리 => 데이터 들고 돌아가기

        okBtn.setOnClickListener {

//            입력한 닉네임을 받아야 들고 돌아감.
            val inputNickName = newNickNameEdt.text.toString()

//            결과로 닉네임 첨부 + OK눌렀다고 명시
            val resultIntent = Intent()
            resultIntent.putExtra("nickName", inputNickName)

            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }

    }

    override fun setValues() {

    }

}