package com.br.wcabral.kotlin.android.githubcompose.ui.feature.users.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.wcabral.kotlin.android.githubcompose.data.model.User
import com.br.wcabral.kotlin.android.githubcompose.data.model.UserPreview

@Composable
fun UsersList(
    users: List<User>,
    onItemClick: (User) -> Unit
) {
    LazyColumn {
        item {
            UsersListHeader()
        }
        items(users) { user ->
            UsersListItem(user = user, onItemClick = onItemClick)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UsersListPreview() {
    val users = List(3) { UserPreview.user }
    UsersList(users = users) {}
}