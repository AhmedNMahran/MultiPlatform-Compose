package com.vodafone.mpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.ComposeView
import com.vodafone.mpcompose.ui.composables.Conversation
import com.vodafone.mpcompose.ui.theme.MPComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_home)
        findViewById<ComposeView>(R.id.compose_view).apply {
            setContent {

                MPComposeTheme {
                    Conversation(messages = SampleData.conversationSample)
                }
            }
        }
    }
}

