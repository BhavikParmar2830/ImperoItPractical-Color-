package com.imperoitpractical3.views

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import com.imperoitpractical3.R
import com.imperoitpractical3.base.BaseActivity
import com.imperoitpractical3.databinding.ActivityMainBinding
import com.imperoitpractical3.viewmodels.MainActivityViewModel
import kotlin.reflect.KClass

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(),
    View.OnClickListener {

    override val modelClass: KClass<MainActivityViewModel> = MainActivityViewModel::class
    override val layoutId: Int = R.layout.activity_main

    override fun initControls() {
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        initFirstRaw()
        initSecondRaw()
        initThirdRaw()
        initForthRaw()
        initFifthRaw()
        initSixthRaw()
    }

    private fun initSixthRaw() {
        binding.tvLnSixOne.setOnClickListener(this)
        binding.tvLnSixTwo.setOnClickListener(this)
        binding.tvLnSixThree.setOnClickListener(this)
        binding.tvLnSixFour.setOnClickListener(this)
        binding.tvLnSixFive.setOnClickListener(this)
    }

    private fun initFifthRaw() {
        binding.tvLnFiveOne.setOnClickListener(this)
        binding.tvLnFiveTwo.setOnClickListener(this)
        binding.tvLnFiveThree.setOnClickListener(this)
        binding.tvLnFiveFour.setOnClickListener(this)
        binding.tvLFiveFive.setOnClickListener(this)
    }

    private fun initForthRaw() {
        binding.tvLnFourOne.setOnClickListener(this)
        binding.tvLnFourTwo.setOnClickListener(this)
        binding.tvLnFourThree.setOnClickListener(this)
        binding.tvLnFourFour.setOnClickListener(this)
        binding.tvLnFourFive.setOnClickListener(this)
    }

    private fun initThirdRaw() {
        binding.tvLnThreeOne.setOnClickListener(this)
        binding.tvLnThreeTwo.setOnClickListener(this)
        binding.tvLnThreeThree.setOnClickListener(this)
        binding.tvLnThreeFour.setOnClickListener(this)
        binding.tvLnThreeFive.setOnClickListener(this)
    }

    private fun initSecondRaw() {
        binding.tvLnTwoOne.setOnClickListener(this)
        binding.tvLnTwoTwo.setOnClickListener(this)
        binding.tvLnTwoThree.setOnClickListener(this)
        binding.tvLnTwoFour.setOnClickListener(this)
        binding.tvLnTwoFive.setOnClickListener(this)
    }

    private fun initFirstRaw() {
        binding.tvLnOneOne.setOnClickListener(this)
        binding.tvLnOneTwo.setOnClickListener(this)
        binding.tvLnOneThree.setOnClickListener(this)
        binding.tvLnOneFour.setOnClickListener(this)
        binding.tvLnOneFive.setOnClickListener(this)
    }

    override fun onClick(id: View?) {

        when (id) {

            // 6 th row
            binding.tvLnSixOne -> {
                changeTextAndBackground(
                    viewModel.row6Text,
                    viewModel.row6Drawable,
                    resources.getString(R.string.six_one),
                    resources.getDrawable(R.color.six_one)
                )
            }

            binding.tvLnSixTwo -> {
                changeTextAndBackground(
                    viewModel.row6Text,
                    viewModel.row6Drawable,
                    resources.getString(R.string.six_two),
                    resources.getDrawable(R.color.six_two)
                )
            }

            binding.tvLnSixThree -> {
                changeTextAndBackground(
                    viewModel.row6Text,
                    viewModel.row6Drawable,
                    resources.getString(R.string.six_three),
                    resources.getDrawable(R.color.six_three)
                )
            }

            binding.tvLnSixFour -> {
                changeTextAndBackground(
                    viewModel.row6Text,
                    viewModel.row6Drawable,
                    resources.getString(R.string.six_four),
                    resources.getDrawable(R.color.six_four)
                )
            }

            binding.tvLnSixFive -> {
                changeTextAndBackground(
                    viewModel.row6Text,
                    viewModel.row6Drawable,
                    resources.getString(R.string.six_five),
                    resources.getDrawable(R.color.six_five)
                )
            }

            // 5 th row

            binding.tvLnFiveOne -> {
                changeTextAndBackground(
                    viewModel.row5Text,
                    viewModel.row5Drawable,
                    resources.getString(R.string.five_one),
                    resources.getDrawable(R.color.five_one)
                )
            }
            binding.tvLnFiveTwo -> {
                changeTextAndBackground(
                    viewModel.row5Text,
                    viewModel.row5Drawable,
                    resources.getString(R.string.five_two),
                    resources.getDrawable(R.color.five_two)
                )
            }
            binding.tvLnFiveThree -> {
                changeTextAndBackground(
                    viewModel.row5Text,
                    viewModel.row5Drawable,
                    resources.getString(R.string.five_three),
                    resources.getDrawable(R.color.five_three)
                )

            }
            binding.tvLnFiveFour -> {
                changeTextAndBackground(
                    viewModel.row5Text,
                    viewModel.row5Drawable,
                    resources.getString(R.string.five_four),
                    resources.getDrawable(R.color.five_four)
                )
            }
            binding.tvLFiveFive -> {
                changeTextAndBackground(
                    viewModel.row5Text,
                    viewModel.row5Drawable,
                    resources.getString(R.string.five_five),
                    resources.getDrawable(R.color.five_five)
                )
            }

            // 4th row
            binding.tvLnFourOne -> {
                changeTextAndBackground(
                    viewModel.row4Text,
                    viewModel.row4Drawable,
                    resources.getString(R.string.four_one),
                    resources.getDrawable(R.color.four_one)
                )
            }
            binding.tvLnFourTwo -> {
                changeTextAndBackground(
                    viewModel.row4Text,
                    viewModel.row4Drawable,
                    resources.getString(R.string.four_two),
                    resources.getDrawable(R.color.four_two)
                )
            }
            binding.tvLnFourThree -> {
                changeTextAndBackground(
                    viewModel.row4Text,
                    viewModel.row4Drawable,
                    resources.getString(R.string.four_three),
                    resources.getDrawable(R.color.four_three)
                )
            }
            binding.tvLnFourFour -> {
                changeTextAndBackground(
                    viewModel.row4Text,
                    viewModel.row4Drawable,
                    resources.getString(R.string.four_four),
                    resources.getDrawable(R.color.four_four)
                )
            }
            binding.tvLnFourFive -> {
                changeTextAndBackground(
                    viewModel.row4Text,
                    viewModel.row4Drawable,
                    resources.getString(R.string.four_five),
                    resources.getDrawable(R.color.four_five)
                )
            }

            // 3 rd row

            binding.tvLnThreeOne -> {
                changeTextAndBackground(
                    viewModel.row3Text,
                    viewModel.row3Drawable,
                    resources.getString(R.string.three_one),
                    resources.getDrawable(R.color.three_one)
                )
            }
            binding.tvLnThreeTwo -> {
                changeTextAndBackground(
                    viewModel.row3Text,
                    viewModel.row3Drawable,
                    resources.getString(R.string.three_two),
                    resources.getDrawable(R.color.three_two)
                )
            }
            binding.tvLnThreeThree -> {
                changeTextAndBackground(
                    viewModel.row3Text,
                    viewModel.row3Drawable,
                    resources.getString(R.string.three_three),
                    resources.getDrawable(R.color.three_three)
                )
            }
            binding.tvLnThreeFour -> {
                changeTextAndBackground(
                    viewModel.row3Text,
                    viewModel.row3Drawable,
                    resources.getString(R.string.three_four),
                    resources.getDrawable(R.color.three_four)
                )
            }
            binding.tvLnThreeFive -> {
                changeTextAndBackground(
                    viewModel.row3Text,
                    viewModel.row3Drawable,
                    resources.getString(R.string.three_five),
                    resources.getDrawable(R.color.three_five)
                )
            }

            //2nd row

            binding.tvLnTwoOne -> {
                changeTextAndBackground(
                    viewModel.row2Text,
                    viewModel.row2Drawable,
                    resources.getString(R.string.two_one),
                    resources.getDrawable(R.color.two_one)
                )
            }
            binding.tvLnTwoTwo -> {
                changeTextAndBackground(
                    viewModel.row2Text,
                    viewModel.row2Drawable,
                    resources.getString(R.string.two_two),
                    resources.getDrawable(R.color.two_two)
                )
            }
            binding.tvLnTwoThree -> {
                changeTextAndBackground(
                    viewModel.row2Text,
                    viewModel.row2Drawable,
                    resources.getString(R.string.two_three),
                    resources.getDrawable(R.color.two_three)
                )
            }
            binding.tvLnTwoFour -> {
                changeTextAndBackground(
                    viewModel.row2Text,
                    viewModel.row2Drawable,
                    resources.getString(R.string.two_four),
                    resources.getDrawable(R.color.two_four)
                )
            }
            binding.tvLnTwoFive -> {
                changeTextAndBackground(
                    viewModel.row2Text,
                    viewModel.row2Drawable,
                    resources.getString(R.string.two_five),
                    resources.getDrawable(R.color.two_five)
                )
            }

            // 1st row

            binding.tvLnOneOne -> {
                changeTextAndBackground(
                    viewModel.row1Text,
                    viewModel.row1Drawable,
                    resources.getString(R.string.one_one),
                    resources.getDrawable(R.color.one_one)
                )
            }
            binding.tvLnOneTwo -> {

                changeTextAndBackground(
                    viewModel.row1Text,
                    viewModel.row1Drawable,
                    resources.getString(R.string.one_two),
                    resources.getDrawable(R.color.one_two)
                )
            }
            binding.tvLnOneThree -> {

                changeTextAndBackground(
                    viewModel.row1Text,
                    viewModel.row1Drawable,
                    resources.getString(R.string.one_three),
                    resources.getDrawable(R.color.one_three)
                )
            }
            binding.tvLnOneFour -> {

                changeTextAndBackground(
                    viewModel.row1Text,
                    viewModel.row1Drawable,
                    resources.getString(R.string.one_four),
                    resources.getDrawable(R.color.one_four)
                )
            }
            binding.tvLnOneFive -> {

                changeTextAndBackground(
                    viewModel.row1Text,
                    viewModel.row1Drawable,
                    resources.getString(R.string.one_five),
                    resources.getDrawable(R.color.one_five)
                )
            }
        }

    }

    private fun changeTextAndBackground(
        text: MutableLiveData<String>,
        drawable: MutableLiveData<Drawable>,
        colorCode: String,
        background: Drawable
    ) {
        text.value = colorCode
        drawable.value = background
    }


}