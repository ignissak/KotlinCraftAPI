# Endpoints

## /
Example response:

```json
{
  "status": 200,
  "data": {
    "id": 0,
    "nick": "",
    "uuid": "00000000-0000-0000-0000-000000000000",
    "registered": 0,
    "lastOnline": 0,
    "lastServer": "",
    "isOnline": false,
    "economy": {
      "craftCoins": 0,
      "craftTokens": 0,
      "voteTokens": 0,
      "bugPoints": 0,
      "karma": 0
    },
    "ranked": {
      "globalLevel": 0,
      "globalExperience": 0,
      "survivalLevel": 0,
      "survivalExperience": 0,
      "skyblockLevel": 0,
      "skyblockExperience": 0,
      "creativeLevel": 0,
      "creativeExperience": 0,
      "prisonLevel": 0,
      "prisonExperience": 0,
      "vanillaLevel": 0,
      "vanillaExperience": 0,
      "skycloudLevel": 0,
      "skycloudExperience": 0,
      "hardcoreVanillaLevel": 0,
      "hardcoreVanillaExperience": 0
    },
    "votes": {
      "totalVotes": 0,
      "monthVotes": 0,
      "weekVotes": 0,
      "lastVote": 0
    }
  }
}
```

## /profile/:nick
Example response:

```json
{
  "status": 200,
  "data": {
    "id": 131544,
    "nick": "MrWakeCZ",
    "uuid": "43d05dab-2dbc-418b-9e6f-dc73ab916dbc",
    "registered": 1387654350000,
    "lastOnline": 1613260991505,
    "lastServer": "vanilla",
    "isOnline": true,
    "economy": {
      "craftCoins": 50595,
      "craftTokens": 42,
      "voteTokens": 109,
      "bugPoints": 8,
      "karma": 0
    },
    "ranked": {
      "globalLevel": 65,
      "globalExperience": 0,
      "survivalLevel": 22,
      "survivalExperience": 28592,
      "skyblockLevel": 9,
      "skyblockExperience": 9548,
      "creativeLevel": 7,
      "creativeExperience": 867,
      "prisonLevel": 9,
      "prisonExperience": 1964,
      "vanillaLevel": 8,
      "vanillaExperience": 6124,
      "skycloudLevel": 10,
      "skycloudExperience": 20926,
      "hardcoreVanillaLevel": 1,
      "hardcoreVanillaExperience": 466
    },
    "votes": {
      "totalVotes": 173,
      "monthVotes": 10,
      "weekVotes": 6,
      "lastVote": 1613312848740
    }
  }
}
```

## /profile/:uuid
Example response:

```json
{
  "status": 200,
  "data": {
    "id": 131544,
    "nick": "MrWakeCZ",
    "uuid": "43d05dab-2dbc-418b-9e6f-dc73ab916dbc",
    "registered": 1387654350000,
    "lastOnline": 1613260991505,
    "lastServer": "vanilla",
    "isOnline": true,
    "economy": {
      "craftCoins": 50595,
      "craftTokens": 42,
      "voteTokens": 109,
      "bugPoints": 8,
      "karma": 0
    },
    "ranked": {
      "globalLevel": 65,
      "globalExperience": 0,
      "survivalLevel": 22,
      "survivalExperience": 28592,
      "skyblockLevel": 9,
      "skyblockExperience": 9548,
      "creativeLevel": 7,
      "creativeExperience": 867,
      "prisonLevel": 9,
      "prisonExperience": 1964,
      "vanillaLevel": 8,
      "vanillaExperience": 6124,
      "skycloudLevel": 10,
      "skycloudExperience": 20926,
      "hardcoreVanillaLevel": 1,
      "hardcoreVanillaExperience": 466
    },
    "votes": {
      "totalVotes": 173,
      "monthVotes": 10,
      "weekVotes": 6,
      "lastVote": 1613312848740
    }
  }
}
```

# /leaderboard/economy/craftcoins
Example response:

```json
{
  "status": 200,
  "data": [
    {
      "index": 1,
      "nick": "Zachry_",
      "uuid": "df577570-7696-4c50-89d3-2a157e9b97dd",
      "value": 248560
    }
  ]
}
```

# /leaderboard/economy/crafttokens
Example response:

```json
{
  "status": 200,
  "data": [
    {
      "index": 1,
      "nick": "Danek987",
      "uuid": "dab5e8cc-ce48-4b2c-b736-4f79761132af",
      "value": 68
    }
  ]
}
```

# /leaderboard/economy/votetokens
Example response:

```json
{
  "status": 200,
  "data": [
    {
      "index": 1,
      "nick": "Danek987",
      "uuid": "dab5e8cc-ce48-4b2c-b736-4f79761132af",
      "value": 4292
    }
  ]
}
```

# /leaderboard/economy/bugpoints
Example response:

```json
{
  "status": 200,
  "data": [
    {
      "index": 1,
      "nick": "Mititi",
      "uuid": "3f8ee255-b993-4d9b-99fd-5d8f52606be1",
      "value": 10
    }
  ]
}
```