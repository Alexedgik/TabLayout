package com.example.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import com.example.tablayout.databinding.MainFragmentBinding


class MainFragment : Fragment() {
    private lateinit var binding: MainFragmentBinding
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            model.plant.value = PlantModel(
                R.drawable.plant3,
                "Рома́шка (лат. Matricária) — род многолетних цветковых растений семейства Астровые," +
                        " или Сложноцветные (Asteraceae), " +
                        "объединяет около двадцати видов[4] невысоких пахучих трав[5]," +
                        " цветущих с первого года жизни. Наиболее известный вид —" +
                        " Ромашка аптечная (Matricaria chamomilla, syn. Matricaria recutita)," +
                        " это растение широко используется в лечебных и косметических целях.",
                "Высушенную и свежую ромашку аптечную издавна применяют в медицине:" +
                        " (отвары, экстракты) — как противовоспалительное, слабое антисептическое" +
                        " и вяжущее средство, наружно — для полосканий, примочек и ванн. " +
                        "Лечение ромашкой применяется в отношении патологий ЖКТ (желудочно-кишечного тракта)," +
                        " гинекологической сферы, мочеполовой и других систем организма " +
                        "как основная или дополнительная терапия. Ромашка принимается внутрь в виде чая" +
                        " (традиционное английское домашнее средство) или настоя," +
                        " её используют при спазмах кишечника," +
                        " метеоризме и диарее, а также как потогонное средство. Препараты — Рекутан, Ротокан."
            )
            (activity as AppCompatActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.holder, ContentFragment.newInstance()).commit()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}