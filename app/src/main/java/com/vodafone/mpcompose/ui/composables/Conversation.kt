package com.vodafone.mpcompose.ui.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vodafone.mpcompose.SampleData
import com.vodafone.mpcompose.data.Message
import com.vodafone.mpcompose.ui.theme.MPComposeTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    MPComposeTheme {
        Conversation(SampleData.conversationSample)
    }
}