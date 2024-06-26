# Changelog

## [1.12.2](https://github.com/jgeramb/software-challenge-client/compare/v1.12.1...v1.12.2) (2024-06-07)


### Bug Fixes

* **player/weighted:** don't add depth level if the ship already collected a passenger ([5d01d8b](https://github.com/jgeramb/software-challenge-client/commit/5d01d8b05db0a95e82203ababa6bc47bb521827f))

## [1.12.1](https://github.com/jgeramb/software-challenge-client/compare/v1.12.0...v1.12.1) (2024-06-07)


### Bug Fixes

* **player/weighted:** last refinements for optimal move choice ([ebdeb8b](https://github.com/jgeramb/software-challenge-client/commit/ebdeb8bd13090806245e30b76b13e72238f34259))
* **player/weighted:** reduce computation for bad moves ([70af0fb](https://github.com/jgeramb/software-challenge-client/commit/70af0fbcd82efc232bc6e3867282abdd6ccb96b1))

## [1.12.0](https://github.com/jgeramb/software-challenge-client/compare/v1.11.5...v1.12.0) (2024-06-06)


### Features

* **player/weighted:** optimize performance + move evaluation ([be5bc7b](https://github.com/jgeramb/software-challenge-client/commit/be5bc7b2a693ab82aa7d0c714130419641532ddb))

## [1.11.5](https://github.com/jgeramb/software-challenge-client/compare/v1.11.4...v1.11.5) (2024-05-28)


### Bug Fixes

* **player/weighted:** allow more coal usage when near the end of the map ([95154c6](https://github.com/jgeramb/software-challenge-client/commit/95154c670b219b8f529fe9326afb3267de5459be))

## [1.11.4](https://github.com/jgeramb/software-challenge-client/compare/v1.11.3...v1.11.4) (2024-05-27)


### Bug Fixes

* **player/weighted:** force collection of at least 2 passengers ([5c20380](https://github.com/jgeramb/software-challenge-client/commit/5c20380f3bf5fa3476876aa5bd2fc301831f10bf))
* **player/weighted:** only require push or passive condition for goal prevention ([5c0c1b1](https://github.com/jgeramb/software-challenge-client/commit/5c0c1b1894d3efa5667b2dde7faaa0c265d42687))
* **player/weighted:** prevent getting stuck due to too high speeds ([8f306fb](https://github.com/jgeramb/software-challenge-client/commit/8f306fbd0569f0b2621c9c24d94ebbaac61353ed))

## [1.11.3](https://github.com/jgeramb/software-challenge-client/compare/v1.11.2...v1.11.3) (2024-05-27)


### Bug Fixes

* **player/weighted:** optimize move evaluation ([a91a20d](https://github.com/jgeramb/software-challenge-client/commit/a91a20df447e80d82cba630f13ce1ae130dc584e))

## [1.11.2](https://github.com/jgeramb/software-challenge-client/compare/v1.11.1...v1.11.2) (2024-05-27)


### Bug Fixes

* **player/weighted:** allow goal prevention even if the player does not have enough passengers ([f8882d6](https://github.com/jgeramb/software-challenge-client/commit/f8882d6e82fe6bdacbce34b1b6d09c8db29b32ea))
* **player/weighted:** force deceleration if the ship shall not move towards the goal yet ([82efb98](https://github.com/jgeramb/software-challenge-client/commit/82efb984e96462ad8b6f1d98cf854394486cc34b))
* **player/weighted:** increase coal cost ([32089db](https://github.com/jgeramb/software-challenge-client/commit/32089db5115705d8cff6922875bed875caabb2d7))
* **player/weighted:** only ignore enemy position in 2nd forecast ([fd6a7ca](https://github.com/jgeramb/software-challenge-client/commit/fd6a7ca1a5ba8d6d43c7e0f58bb69406d00d7b0e))
* **player/weighted:** prioritize distance when near end of map instead of when near last round ([af2a836](https://github.com/jgeramb/software-challenge-client/commit/af2a836c8d77b2b4f335b0c09f962bad04da2654))

## [1.11.1](https://github.com/jgeramb/software-challenge-client/compare/v1.11.0...v1.11.1) (2024-05-27)


### Bug Fixes

* **player/weighted:** also allow finishing with all lower speeds ([46e6151](https://github.com/jgeramb/software-challenge-client/commit/46e61511e9cbfe82680de2dd457c9b15b5c10b92))
* **sdk/game:** also allow finishing and collection of passengers with all lower speeds ([20349da](https://github.com/jgeramb/software-challenge-client/commit/20349daf675b3110b95af7e50fa2746594d627de))

## [1.11.0](https://github.com/jgeramb/software-challenge-client/compare/v1.10.0...v1.11.0) (2024-05-27)


### Features

* **player/weighted:** allow more coal usage when the player has enough passengers ([886265b](https://github.com/jgeramb/software-challenge-client/commit/886265b2d630d6b1b942a16f602503a1688421ec))
* **player/weighted:** always reserve one coal ([00c5a32](https://github.com/jgeramb/software-challenge-client/commit/00c5a32365658cc1f83de293bfdd035dd2b4706b))


### Bug Fixes

* **player/weighted:** adjust distance + passenger weights ([50ce007](https://github.com/jgeramb/software-challenge-client/commit/50ce0076076e5023fc656c283c75b3fd6752388f))
* **player/weighted:** adjust forecast weight + use best move when loosing intentionally ([6fe5581](https://github.com/jgeramb/software-challenge-client/commit/6fe55812a2a63f4b92798cedbfa64230ea6ae129))
* **player/weighted:** adjust weights ([ac42f1e](https://github.com/jgeramb/software-challenge-client/commit/ac42f1e11b1104580c587f91bab737c86bf9eede))
* **player/weighted:** fix passenger collection prevention ([542b7c3](https://github.com/jgeramb/software-challenge-client/commit/542b7c33ca4fe29493db665dc63c414d0984282f))
* **player/weighted:** fix passive goal prevention check ([365a0f3](https://github.com/jgeramb/software-challenge-client/commit/365a0f30da2c9c2d41036b8776e5376ed3f5c99f))
* **player/weighted:** increase points for preventing a goal ([a21f101](https://github.com/jgeramb/software-challenge-client/commit/a21f10108a2c0a0ab32cb58cbf53c71383731eba))
* **player/weighted:** increase points for preventing the collection of a passenger ([2600791](https://github.com/jgeramb/software-challenge-client/commit/260079124a6c37bfe03e52c28815b49f7e7137e8))
* **player/weighted:** make sure the enemy is near the same passenger field ([3deb29c](https://github.com/jgeramb/software-challenge-client/commit/3deb29c4f4883392d266358f16f94b0715b3be21))
* **sdk/game:** fix direction logic of canReachRequiredSpeed method ([f0140c1](https://github.com/jgeramb/software-challenge-client/commit/f0140c1032cfaa2654ca9613002713ae8e27cdfc))
* **sdk/game:** fix passenger collection prevention logic for pushing ([cdd22e4](https://github.com/jgeramb/software-challenge-client/commit/cdd22e40ce3e8c0359e2bc484cb97dfaa5f901d6))
* **sdk/game:** reduce score instead of skipping the direction ([e9adff6](https://github.com/jgeramb/software-challenge-client/commit/e9adff621b586f167ee2119e4f60712ed7b1b633))

## [1.10.0](https://github.com/jgeramb/software-challenge-client/compare/v1.9.2...v1.10.0) (2024-05-26)


### Features

* **sdk/game; player/weighted:** move segment direction cost to board class + add bonus points for field column ([5f4db17](https://github.com/jgeramb/software-challenge-client/commit/5f4db171bf50cc638594dc2130a93b3d6deea639))


### Bug Fixes

* **player/weighted:** prevent collection of same passenger in further moves ([e2b7872](https://github.com/jgeramb/software-challenge-client/commit/e2b7872e4bc658de928d79424e973764c1619b23))
* **player/weighted:** prevent ship from getting stuck at segment borders ([c147d85](https://github.com/jgeramb/software-challenge-client/commit/c147d851c24501bed16a94196f85183813cc7ae4))
* **player/weighted:** use start position of current move instead of ship position + adjust weights ([d2b926b](https://github.com/jgeramb/software-challenge-client/commit/d2b926bd7a2393a6ee0e7ec5754a970614f47da9))

## [1.9.2](https://github.com/jgeramb/software-challenge-client/compare/v1.9.1...v1.9.2) (2024-05-25)


### Bug Fixes

* **player/weighted:** edge case weight optimization + turn parameter fix ([1b4a894](https://github.com/jgeramb/software-challenge-client/commit/1b4a894563dbc7ba1462e07569413011ea3678c1))

## [1.9.1](https://github.com/jgeramb/software-challenge-client/compare/v1.9.0...v1.9.1) (2024-05-22)


### Bug Fixes

* **player/weighted:** fix passenger score calculation ([e6a3979](https://github.com/jgeramb/software-challenge-client/commit/e6a3979f891590fd00488e8fe32b4efa161f5502))

## [1.9.0](https://github.com/jgeramb/software-challenge-client/compare/v1.8.2...v1.9.0) (2024-05-21)


### Features

* optimize weights ([4de6249](https://github.com/jgeramb/software-challenge-client/commit/4de62499d764ba8aac6f1d65eee8c738012b74b5))


### Bug Fixes

* adjust coal + speed weights ([c8f1c87](https://github.com/jgeramb/software-challenge-client/commit/c8f1c87960963b54e61c1bac3d9e67d85c2dfc31))

## [1.8.2](https://github.com/jgeramb/software-challenge-client/compare/v1.8.1...v1.8.2) (2024-05-02)


### Bug Fixes

* don't consider enemy position in further move forecasting ([d44caa9](https://github.com/jgeramb/software-challenge-client/commit/d44caa940dc3e7c9a0c98d55684632578e50785d))
* rewrite prevention logic ([1cdb64f](https://github.com/jgeramb/software-challenge-client/commit/1cdb64ff3e62c59827350cb6c314f110bc3b4826))


### Documentation

* fix punctuation ([9b23e39](https://github.com/jgeramb/software-challenge-client/commit/9b23e397600c5d2197942a17b794401b79be6326))
* remove redundant anchor tag attributes ([1ab0109](https://github.com/jgeramb/software-challenge-client/commit/1ab01090a0b128631cbe3988ff55d4d8ae9c9ff1))

## [1.8.1](https://github.com/jgeramb/software-challenge-client/compare/v1.8.0...v1.8.1) (2024-05-02)


### Bug Fixes

* enhance garbage collection performance ([541825e](https://github.com/jgeramb/software-challenge-client/commit/541825e5851d90862db8544ef252dfe8b72d1955))
* optimize performance ([7547a4e](https://github.com/jgeramb/software-challenge-client/commit/7547a4eeba74b2db08acd8f2526d1e44be09a64f))

## [1.8.0](https://github.com/jgeramb/software-challenge-client/compare/v1.7.1...v1.8.0) (2024-05-02)


### Features

* allow more coal usage to make 180° turns possible ([7108b9b](https://github.com/jgeramb/software-challenge-client/commit/7108b9bc6992f9109a8c83202dbb493cd9e02253))


### Bug Fixes

* update play styles in run configurations ([9520657](https://github.com/jgeramb/software-challenge-client/commit/95206579b0b1160f99b913e3d3489369e357a551))


### Documentation

* update play style documentation ([8354492](https://github.com/jgeramb/software-challenge-client/commit/83544920ec34eeed26489af75bc583d0c72b8e5c))

## [1.7.1](https://github.com/jgeramb/software-challenge-client/compare/v1.7.0...v1.7.1) (2024-04-26)


### Bug Fixes

* **player/max-passengers:** remove obsolete check ([534521c](https://github.com/jgeramb/software-challenge-client/commit/534521cfbf313aa461b1180d61e4967f79286a5b))


### Documentation

* **sdk:** add function documentation ([747ace6](https://github.com/jgeramb/software-challenge-client/commit/747ace629917f988a4e073345ffdaefbac3f88f1))

## [1.7.0](https://github.com/jgeramb/software-challenge-client/compare/v1.6.0...v1.7.0) (2024-04-22)


### Features

* **player/simple:** enhance move evaluation + performance ([7686505](https://github.com/jgeramb/software-challenge-client/commit/76865057ead0a4ba8e46198a87a414e664003c31))

## [1.6.0](https://github.com/jgeramb/software-challenge-client/compare/v1.5.2...v1.6.0) (2024-04-21)


### Features

* **player/simple:** optimize move evaluation ([bdebc6b](https://github.com/jgeramb/software-challenge-client/commit/bdebc6b2ae76b839b5ef956aaaeb32698170ec88))
* **player:** optimize move/path evaluation ([90f84ae](https://github.com/jgeramb/software-challenge-client/commit/90f84aeb4d754e1072203b5b28d18fb1c441b727))


### Bug Fixes

* **sdk/game:** fix push direction evaluation for the late game ([63eab0a](https://github.com/jgeramb/software-challenge-client/commit/63eab0a8a69ed3a8df520a2cfcfe5ee94950ea27))

## [1.5.2](https://github.com/jgeramb/software-challenge-client/compare/v1.5.1...v1.5.2) (2024-04-21)


### Bug Fixes

* **player/simple:** force player to push more often when having enough passengers to prevent draws ([f9ca90d](https://github.com/jgeramb/software-challenge-client/commit/f9ca90d72c6b494718b6aff9db1d18634d157c42))

## [1.5.1](https://github.com/jgeramb/software-challenge-client/compare/v1.5.0...v1.5.1) (2024-04-15)


### Bug Fixes

* **player/simple:** slightly increase passenger weight to improve move evaluation ([242e956](https://github.com/jgeramb/software-challenge-client/commit/242e95662fb95f809abda9f829a5dea20535c99f))

## [1.5.0](https://github.com/jgeramb/software-challenge-client/compare/v1.4.0...v1.5.0) (2024-04-09)


### Features

* **player/advanced:** prefer passenger fields with the smallest distance ([41ca778](https://github.com/jgeramb/software-challenge-client/commit/41ca7788a8390cb319c62b14d04ec7c13ccf1d8e))
* **player/advanced:** prevent collection of passengers that can be collected by the enemy ([10fc926](https://github.com/jgeramb/software-challenge-client/commit/10fc9262f0e3687c5c3243df63f4ca11b116e748))
* **player/advanced:** rewrote path finding logic ([c2ebdef](https://github.com/jgeramb/software-challenge-client/commit/c2ebdef8c0eac5711b8186927631aba1dede36c3))
* **player/simple:** optimize criteria weights ([72c95aa](https://github.com/jgeramb/software-challenge-client/commit/72c95aab76066cd121eb291e1c34e5ff317d457b))


### Bug Fixes

* **player/admin:** reduce parallel threads to lower cpu load ([4ca4e96](https://github.com/jgeramb/software-challenge-client/commit/4ca4e96d4523442a72a166d1dec7d790fbb5e777))
* **player/advanced:** fix next direction calculation ([535a908](https://github.com/jgeramb/software-challenge-client/commit/535a908560b9d48fd8d0600055dbb7276b7131d5))
* **player/simple:** decrease speed cost to get to the goal first ([1888196](https://github.com/jgeramb/software-challenge-client/commit/18881965b470a690755278cd6c9903e517764995))
* **player/simple:** increase passenger criteria weight ([7c2f76b](https://github.com/jgeramb/software-challenge-client/commit/7c2f76b7ee1371fe169834172e8ef89a5b1347b2))

## [1.4.0](https://github.com/jgeramb/software-challenge-client/compare/v1.3.0...v1.4.0) (2024-04-09)


### Features

* **player/admin:** stop collecting losses ([0de2d42](https://github.com/jgeramb/software-challenge-client/commit/0de2d420f60a38aff0f41a9f7f63e7d03b581c4b))
* **player/simple:** increase weight of 2nd forecasted move ([5db03ce](https://github.com/jgeramb/software-challenge-client/commit/5db03ce1610a09a50135f3d28c6c1eb1ab545a4d))
* **sdk:** return whether the message was logged ([89d3047](https://github.com/jgeramb/software-challenge-client/commit/89d3047011db1a7ff8ecf586e37be1d9ca492ec9))


### Bug Fixes

* **player/admin:** prevent line breaks from invisible debug messages ([08af93c](https://github.com/jgeramb/software-challenge-client/commit/08af93c9d8d87cae78d73c4ebadae6eb3da837ee))
* **player/advanced:** fix incorrect max speed after turn ([ee03339](https://github.com/jgeramb/software-challenge-client/commit/ee03339f76d3cb4c88c3ff72d95950d12df2a40e))
* **player/advanced:** fix rule violation ([dc3532d](https://github.com/jgeramb/software-challenge-client/commit/dc3532d84a516e55f8c0873870e0ba7f2962728c))
* **player/advanced:** prevent dead ends ([5243632](https://github.com/jgeramb/software-challenge-client/commit/52436329967e90fe1fb0c089a034359fbec4e9c7))
* **player/advanced:** prevent infinite loops in path reconstruction ([66ff295](https://github.com/jgeramb/software-challenge-client/commit/66ff29555b7b4dc857d92810152f3c842f006e09))
* **player:** reduce the distance that the enemy needs to be seen as ahead ([a3833fc](https://github.com/jgeramb/software-challenge-client/commit/a3833fca9a21885b825e8475eb7b2d1501312b99))

## [1.3.0](https://github.com/jgeramb/software-challenge-client/compare/v1.2.0...v1.3.0) (2024-04-08)


### Features

* **player/admin:** add average passengers statistic ([2b52f4e](https://github.com/jgeramb/software-challenge-client/commit/2b52f4ee7753b7ffd412125e798aa550c3012071))
* **player/admin:** add loose reason debug message ([d52b451](https://github.com/jgeramb/software-challenge-client/commit/d52b451087ebe04d4e1cddd00758d167a5818bff))
* **player/admin:** adds dynamic thread count + logs an error if no actions are available ([4eee05b](https://github.com/jgeramb/software-challenge-client/commit/4eee05b6b27081e76e165f330efa493dd961af15))
* **player/admin:** automatically disconnect clients to free up memory ([9cb7186](https://github.com/jgeramb/software-challenge-client/commit/9cb7186c06ee3e71a4cad7d99ef1ac537435e041))
* **player/advanced:** added turn cost & counter current cost to pathfinding ([7f2aaa8](https://github.com/jgeramb/software-challenge-client/commit/7f2aaa8f0b18e83c8046c249efe8ee80afc0d0e6))
* **player/advanced:** cleans up code + prevents dead ends + removes pathfinder timeout ([f6c0913](https://github.com/jgeramb/software-challenge-client/commit/f6c09130aeb5970b1fab7d31b6ee225f8e418acd))
* **player/advanced:** enhance pathfinding + add pathfinding unit tests + make strategic changes ([13d3074](https://github.com/jgeramb/software-challenge-client/commit/13d307493f8939a92bf09faa8e0cb002a39a1c93))
* **player/advanced:** make strategic changes ([e8c3164](https://github.com/jgeramb/software-challenge-client/commit/e8c31640e4b5031147f5687946000602ed4c531c))
* **player/advanced:** make strategic changes to path evaluation ([d1a6f2b](https://github.com/jgeramb/software-challenge-client/commit/d1a6f2b38ba82e7f12c0bd4e62263299f89369c6))
* **player/advanced:** make strategic changes to path evaluation ([11c68fe](https://github.com/jgeramb/software-challenge-client/commit/11c68fe67cc3ebf747e561b54b1bdf41074f02e2))
* **player/advanced:** make sure the player gets to the goal first ([45d3692](https://github.com/jgeramb/software-challenge-client/commit/45d3692b601746ec378cae3b6710f51d8732e2a2))
* **player/advanced:** optimize acceleration + fix cost calculation ([b1bef66](https://github.com/jgeramb/software-challenge-client/commit/b1bef6631b79a68ded519fbf60ddfaa681c8215a))
* **player/advanced:** optimize path decision ([61a1d3c](https://github.com/jgeramb/software-challenge-client/commit/61a1d3c3a94b179595cd8d468ca09bb0b44848cf))
* **player/advanced:** optimize pathfinding + move generation + add unit tests ([edee44a](https://github.com/jgeramb/software-challenge-client/commit/edee44ab92ef5672d8a3569434d58602689e9a21))
* **player/advanced:** optimize turning after arriving at the destination ([6d457bf](https://github.com/jgeramb/software-challenge-client/commit/6d457bfdde0f04ace266634f27acb05df54a080a))
* **player/advanced:** refactors code + fixes a rule violation ([c9d2780](https://github.com/jgeramb/software-challenge-client/commit/c9d278051536d7d0d3a322f5eebca096e2b8477b))
* **player/advanced:** rewrite velocity logic ([a21abd9](https://github.com/jgeramb/software-challenge-client/commit/a21abd96e8dcfaf982afeb1bd9546423bd99fe8b))
* **player/advanced:** switch to universal coal usage ([a187885](https://github.com/jgeramb/software-challenge-client/commit/a1878853ad82f7487e0dbdf1576a915014698f3d))
* **player/network:** limit garbage collection to 1 Hz ([415696d](https://github.com/jgeramb/software-challenge-client/commit/415696d6c9474a4fabd58ca9ef5eefd24522b01c))
* **player/simple:** add bonus points if the enemy ship needs to turn after being pushed ([b45ef7a](https://github.com/jgeramb/software-challenge-client/commit/b45ef7addd6be6295605fa344271b05d30055477))
* **player/simple:** enhance move evaluation ([f661826](https://github.com/jgeramb/software-challenge-client/commit/f661826fa5b216b434628b16ff5c3446d2f6c7e0))
* **player/simple:** improve move evaluation + refactor MoveUtil#getSegmentDirectionCost ([2fefd59](https://github.com/jgeramb/software-challenge-client/commit/2fefd5908a5a6682ddc0d8e071aa5ae6af7d3213))
* **player/simple:** optimize move efficiency evaluation ([cd1ebef](https://github.com/jgeramb/software-challenge-client/commit/cd1ebefcd61bc98e5c8c428bcc27720625381339))
* **player/simple:** remove evaluation criteria + recalibrate player + reduce code ([888b1cc](https://github.com/jgeramb/software-challenge-client/commit/888b1ccb98858e214db75b21ce8cf3a970e77769))
* **player/simple:** strategic changes ([d74248c](https://github.com/jgeramb/software-challenge-client/commit/d74248cbb1ddd64f4973b8e203c3a7b9ea177e56))
* **player:** add move calculation debug time ([b5a08f7](https://github.com/jgeramb/software-challenge-client/commit/b5a08f738634149c0701e4374d28ba11b60a0c6a))
* **player:** add team and next actions debug messages ([79de36d](https://github.com/jgeramb/software-challenge-client/commit/79de36ddb0672a82b90ed5e19bce60616ab9ae12))
* **player:** change play style to advanced ([16cd8d7](https://github.com/jgeramb/software-challenge-client/commit/16cd8d733186c555594f26c4953227d4051627bd))
* **player:** change test games count to 50 and add garbage collector flag ([e261010](https://github.com/jgeramb/software-challenge-client/commit/e2610108a5b2d9e1155dc8ba3102c21542a4bb06))
* **player:** change timeouts for move calculation ([fe8d73a](https://github.com/jgeramb/software-challenge-client/commit/fe8d73a766e9ecc637393adc871adece7a6c1697))
* **player:** only close client connection once ([108e352](https://github.com/jgeramb/software-challenge-client/commit/108e3528499bda75f5701a11af581bfb793daa1f))
* **sdk/game:** add segment position and distance functions to sdk ([9a15d40](https://github.com/jgeramb/software-challenge-client/commit/9a15d40de1d703e4239228004dedbe63ffaedac6))
* **sdk/game:** provide win reason for game handlers ([7a384da](https://github.com/jgeramb/software-challenge-client/commit/7a384dadc837162663f117237fde9deac6dc4d4e))
* **sdk/game:** switch to universal coal usage ([8298dea](https://github.com/jgeramb/software-challenge-client/commit/8298deac20384ede95789d3352a6e659386b492c))


### Bug Fixes

* **player/admin:** count stuck as error ([25cc69d](https://github.com/jgeramb/software-challenge-client/commit/25cc69d3bfa2159631841b7b8188ccf7c9976528))
* **player/advanced:** fix out of memory error when running parallel games ([8525307](https://github.com/jgeramb/software-challenge-client/commit/8525307327f27873939fca67300143cd4e5d70d3))
* **player/advanced:** refactor moveFromPath push code during movement point calculation ([8d75fa3](https://github.com/jgeramb/software-challenge-client/commit/8d75fa31498a4dfc1e1141db29c91f997adf7488))
* **player/advanced:** removed multi threading since the contest server doesn't support it ([77ba602](https://github.com/jgeramb/software-challenge-client/commit/77ba60205960874e8e5cde8edb96f5cf4c731bb9))
* **player/simple:** fix empty possible moves after pushing the enemy ship ([343104e](https://github.com/jgeramb/software-challenge-client/commit/343104e03efd5d7d4e9bb0c0d6ce92b4b0615126))
* **player/simple:** fix empty possible moves if pushing the enemy to a goal field is required ([bbd2cb7](https://github.com/jgeramb/software-challenge-client/commit/bbd2cb78dd412d9c579b7fc44056f3a1b23aa6d8))
* **player/simple:** fix goal unit test ([2cc7891](https://github.com/jgeramb/software-challenge-client/commit/2cc789130ec58421c45d539fb0a58121084547a9))
* **player/simple:** fix unit tests ([48021af](https://github.com/jgeramb/software-challenge-client/commit/48021af21d8dd44858f82b5a8f3b174653ffb3b8))
* **player:** change default password to the default password of the server ([d883a7d](https://github.com/jgeramb/software-challenge-client/commit/d883a7df6e97c427bcffc0deee124d5c4c847a8a))
* **player:** decrease turn cost in isEnemyAhead evaluation ([19987cd](https://github.com/jgeramb/software-challenge-client/commit/19987cd18e09399d77cb0b1919752b2284d794d5))
* **sdk/game:** correct speed in push to collect passenger test ([aa027e6](https://github.com/jgeramb/software-challenge-client/commit/aa027e682d158209f97b52401a54aab12b2f8686))
* **sdk/game:** make recursive algorithm find all possible combinations ([f9b96c6](https://github.com/jgeramb/software-challenge-client/commit/f9b96c6688f794c30485116e45b2ace6f0eec3bd))
* **sdk/network:** lets the server close the connection ([d570d5c](https://github.com/jgeramb/software-challenge-client/commit/d570d5c8fb802a71a1f8d21d60b2ee2f69f63b0a))
* **sdk/network:** remove manual garbage collection because it causes bulk tests to freeze and it is mostly redundant ([3a12131](https://github.com/jgeramb/software-challenge-client/commit/3a12131b46f0b431c1ab187f98d5c31f4a2be286))
* **sdk:** changed timing of manual garbage collection ([2db44f3](https://github.com/jgeramb/software-challenge-client/commit/2db44f395c16e9de77a5100fbf904c07a71c7f13))
* **sdk:** hide debug messages from admin client if debug mode is disabled ([5c7d618](https://github.com/jgeramb/software-challenge-client/commit/5c7d618f3cab426b6c4da573d9ca9cc2b75d18fb))


### Documentation

* change default password + adjust build paths ([aab9d4f](https://github.com/jgeramb/software-challenge-client/commit/aab9d4ff8c21d3fae088f702efb8f5fdfada2f5e))
* **scopes:** added initial scopes ([64d34ad](https://github.com/jgeramb/software-challenge-client/commit/64d34ad6876514c6bd728897e6d4fb3fbe27f6a0))
