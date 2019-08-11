package com.laddukutti.codecoach


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.laddukutti.codecoach.data.Questions
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val questions: ArrayList<Questions> = ArrayList()

        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))
        questions.add(Questions("Run Length Encoding", "Return the run length encoding of a string"))


        val adapter = QuestionsAdapter(questions)
        view.recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        view.recyclerView.adapter = adapter

        return view
    }


}
